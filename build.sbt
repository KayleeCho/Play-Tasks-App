name := """kaylee-scala"""
organization := "kaylee"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
TwirlKeys.templateImports += "kaylee.controllers._"

// Adds additional packages into conf/routes
 play.sbt.routes.RoutesKeys.routesImport += "kaylee.binders._"
