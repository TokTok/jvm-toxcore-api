package im.tox.core.typesafe

@SuppressWarnings(Array("org.wartremover.warts.Equals"))
object Equals {
  implicit final class AnyOps[A](self: A) {
    def ===(other: A): Boolean = self == other
    def =/=(other: A): Boolean = self != other
  }
}
