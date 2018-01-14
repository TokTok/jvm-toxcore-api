package im.tox.core.typesafe

abstract class BoundedIntCompanion[T <: AnyVal](
    val MinValue: Int,
    val MaxValue: Int
) extends IntCompanion[T] {

  protected def unsafeFromInt(value: Int): T

  final def clamp(value: Int): T = {
    unsafeFromInt(value min MaxValue max MinValue)
  }

  final override def fromInt(value: Int): Option[T] = {
    if (MinValue <= value && value <= MaxValue) {
      Some(unsafeFromInt(value))
    } else {
      None
    }
  }

}
