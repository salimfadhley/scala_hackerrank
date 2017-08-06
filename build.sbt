name := "untitled"

version := "1.0"

scalaVersion := "2.12.1"

val scalaTestVersion = "3.0.1"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.14"
libraryDependencies += "org.scalactic" %% "scalactic" % scalaTestVersion
libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"