package im.tox.core

import com.typesafe.scalalogging.Logger
import im.tox.core.error.CoreError
import im.tox.core.typesafe.Security
import org.slf4j.LoggerFactory

import scalaz.\/

@SuppressWarnings(Array("org.wartremover.warts.Equals"))
abstract class ModuleCompanion[T, +S <: Security] {

  protected val logger = Logger(LoggerFactory.getLogger(getClass))

  def nullable: Boolean = false

}
