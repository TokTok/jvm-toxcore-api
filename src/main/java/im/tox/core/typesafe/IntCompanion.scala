package im.tox.core.typesafe

import im.tox.core.ModuleCompanion

abstract class IntCompanion[T <: AnyVal] extends ModuleCompanion[T, Security.Sensitive] {

  private[typesafe] def fromInt(value: Int): Option[T]
  private[typesafe] def toInt(self: T): Int

  final override def equals(a: T, b: T): Boolean = {
    toInt(a) == toInt(b)
  }

}
