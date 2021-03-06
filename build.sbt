import com.banno.plantuml.PlantUMLPlugin

enablePlugins(WindowsPlugin, UniversalPlugin, JavaAppPackaging, PlantUMLPlugin, ParadoxPlugin)

sequenceDiagramsLocation := file("src/main/paradox/")
sequenceDiagramExtension := ".plantuml"
sequenceDiagramsOutput := file("target/paradox/site/main/")

rpmRelease := "1"

rpmVendor := "mauritania"

rpmUrl := Some("https://github.com/mauriciojost/olympus-photosync")

rpmLicense := Some("Apache License Version 2.0")

name := "olympus-photosync"

paradoxTheme := Some(builtinParadoxTheme("generic"))

scalaVersion := "2.11.8"

mainClass in Compile := Some("org.mauritania.photosync.starter.Starter")

maintainer := "Mauricio Jost <mauriciojostx@gmail.com>"

packageSummary := "Synchronize media from Olympus cameras to your PC wirelessly."

coverageMinimum := 90
coverageFailOnMinimum := true

parallelExecution in Test := false

resolvers ++= Seq(
  "Bintray repository" at "https://dl.bintray.com/scalaz-releases/"
)

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-log4j12" % "1.7.5",
  "com.typesafe" % "config" % "1.2.1",
  "com.github.scopt" %% "scopt" % "3.3.0",
  "org.scalafx" %% "scalafx" % "8.0.144-R12",
  "com.lihaoyi" %% "scalarx" % "0.3.2"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "org.specs2" %% "specs2-mock" % "3.8.9" % "test",
  "commons-io" % "commons-io" % "2.5" % "test"
)


