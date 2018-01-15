package im.tox.core.typesafe

sealed abstract class \/[A, B] extends Product with Serializable {
  /** Bind through the right of this disjunction. */
  def flatMap[D](g: B => (A \/ D)): (A \/ D) =
    this match {
      case a @ -\/(_) => a.coerceRight
      case \/-(b)     => g(b)
    }

  /** Map on the right of this disjunction. */
  def map[D](g: B => D): (A \/ D) =
    this match {
      case \/-(b)     => \/-(g(b))
      case a @ -\/(_) => a.coerceRight
    }

  /** Flip the left/right values in this disjunction. Alias for `unary_~` */
  def swap: (B \/ A) =
    this match {
      case -\/(a) => \/-(a)
      case \/-(b) => -\/(b)
    }

  /**
   * Return an empty option or option with one element on the right of this
   *  disjunction. Useful to sweep errors under the carpet.
   */
  def toOption: Option[B] =
    this match {
      case -\/(_) => None
      case \/-(b) => Some(b)
    }
}

@SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
final case class -\/[A, B](a: A) extends (A \/ B) {
  def coerceRight[C]: A \/ C = this.asInstanceOf[A \/ C]
}
@SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
final case class \/-[A, B](b: B) extends (A \/ B) {
  def coerceLeft[C]: C \/ B = this.asInstanceOf[C \/ B]
}

object \/ {
  /** Construct a left disjunction value. */
  def left[A, B]: A => A \/ B =
    -\/(_)

  /** Construct a right disjunction value. */
  def right[A, B]: B => A \/ B =
    \/-(_)

  /** Construct a disjunction value from a standard `scala.Either`. */
  def fromEither[A, B](e: Either[A, B]): A \/ B =
    e fold (left, right)
}
