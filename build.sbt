organization  := "org.toktok"
name          := "tox4j-api"
version       := "0.2.3"
scalaVersion  := "2.11.12"

bintrayVcsUrl := Some("https://github.com/TokTok/jvm-toxcore-api")

// Build dependencies.
libraryDependencies ++= Seq(
  "org.jetbrains" % "annotations" % "13.0"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.1",
  "org.scalatestplus" %% "scalacheck-1-14" % "3.1.0.1"
) map (_ % Test)

import im.tox.sbt.Scalastyle
Scalastyle.projectSettings
