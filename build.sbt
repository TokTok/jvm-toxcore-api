organization  := "org.toktok"
name          := "tox4j-api"
version       := "0.2.0"
scalaVersion  := "2.11.12"

bintrayVcsUrl := Some("https://github.com/TokTok/jvm-toxcore-api")

// Build dependencies.
libraryDependencies ++= Seq(
  "com.intellij" % "annotations" % "12.0"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.5",
  "org.scalatest" %% "scalatest" % "3.0.1"
) map (_ % Test)

import im.tox.sbt.Scalastyle
Scalastyle.projectSettings
