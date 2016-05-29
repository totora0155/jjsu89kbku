name := "template"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

// resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  // filters,
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
