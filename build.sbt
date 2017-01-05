organization  := "org.toktok"
name          := "tox4j-api"
version       := "0.1.2"
scalaVersion  := "2.11.7"

bintrayVcsUrl := Some("https://github.com/TokTok/jvm-toxcore-api")

// Build dependencies.
libraryDependencies ++= Seq(
  "com.intellij" % "annotations" % "12.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "org.scalaz" %% "scalaz-core" % "7.2.8",
  "org.scodec" %% "scodec-core" % "1.10.3"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0"
) map (_ % Test)

import im.tox.sbt.lint.Scalastyle
Scalastyle.projectSettings
