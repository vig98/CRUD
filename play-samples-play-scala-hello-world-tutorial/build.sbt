name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.12"

libraryDependencies += guice
//libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"
libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.0"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.0"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.0"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
libraryDependencies +=   "org.mockito" % "mockito-core" % "2.8.47" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.10.0"