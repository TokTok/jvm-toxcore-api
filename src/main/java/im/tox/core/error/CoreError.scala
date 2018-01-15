package im.tox.core.error

import im.tox.core.error.CoreError.CoreException

import im.tox.core.typesafe.{ -\/, \/, \/- }

sealed abstract class CoreError {
  val exception: CoreException = new CoreException(this)
}

object CoreError {

  final case class CoreException(error: CoreError) extends Exception(error.toString)

  final case class Unimplemented(message: String) extends CoreError
  final case class ValidationError(message: String) extends CoreError
  final case class InvalidFormat(message: String) extends CoreError
  final case object DecryptionError extends CoreError

  def apply[A](option: Option[A], message: String): CoreError \/ A = {
    option match {
      case None        => -\/(ValidationError(message))
      case Some(value) => \/-(value)
    }
  }

  def require(condition: Boolean, message: => String): CoreError \/ Unit = {
    if (condition) {
      \/-(())
    } else {
      -\/(ValidationError(message))
    }
  }

}
