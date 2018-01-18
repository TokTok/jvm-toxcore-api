package im.tox.core.typesafe

import org.scalacheck.{ Gen, Arbitrary }

abstract class DiscreteValueCompanionTest[Repr, T <: AnyVal](module: DiscreteValueCompanion[Repr, T])
  extends WrappedValueCompanionTest(module)
