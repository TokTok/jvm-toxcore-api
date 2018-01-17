package im.tox.core

import im.tox.core.error.CoreError
import im.tox.core.typesafe.Security

import im.tox.core.typesafe.\/

@SuppressWarnings(Array("org.wartremover.warts.Equals"))
abstract class ModuleCompanion[T, +S <: Security] {

  def equals(a: T, b: T): Boolean
  def nullable: Boolean = false

}
