package im.tox.core.typesafe

import im.tox.core.ModuleCompanion
import im.tox.core.typesafe.Equals._

import scala.collection.immutable.TreeSet

abstract class EnumModuleCompanion[T, +S <: Security] extends ModuleCompanion[T, S] {

  def ordinal(self: T): Int
  def values: TreeSet[T]

  final implicit val ordT: Ordering[T] = Ordering.by(ordinal)

}
