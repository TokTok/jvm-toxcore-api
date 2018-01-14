organization  := "org.toktok"
name          := "tox4j-api"
version       := "0.1.3"
scalaVersion  := "2.11.12"

bintrayVcsUrl := Some("https://github.com/TokTok/jvm-toxcore-api")

// Build dependencies.
libraryDependencies ++= Seq(
  "com.intellij" % "annotations" % "12.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "org.scalaz" %% "scalaz-core" % "7.3.0-M18"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP7"
) map (_ % Test)

import im.tox.sbt.lint.Scalastyle
Scalastyle.projectSettings
