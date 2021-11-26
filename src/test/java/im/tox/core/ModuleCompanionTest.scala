package im.tox.core

import im.tox.core.typesafe.Security
import org.scalatest.FunSuite
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

abstract class ModuleCompanionTest[T, S <: Security](module: ModuleCompanion[T, S]) extends FunSuite with ScalaCheckPropertyChecks
