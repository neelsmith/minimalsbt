name := "Minimal SBT project template"
organization := "io.github.USERNAME"
version := "1.0.0"
licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

tutTargetDirectory := file("docs")
tutSourceDirectory := file("src/main/tut")
enablePlugins(TutPlugin)
