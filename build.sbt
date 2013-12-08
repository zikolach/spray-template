import AssemblyKeys._

organization  := "com.example"

version       := "0.1"

name          := "spray-can-rpi"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/"
)

libraryDependencies ++= Seq(
  "io.spray"            %   "spray-can"     % "1.2.0",
  "io.spray"            %   "spray-routing" % "1.2.0",
  "io.spray"            %   "spray-testkit" % "1.2.0" % "test",
  "com.typesafe.akka"   %%  "akka-actor"    % "2.2.3",
  "com.typesafe.akka"   %%  "akka-testkit"  % "2.2.3" % "test",
  "io.spray"            %   "spray-testkit" % "1.2.0" % "test"
)

seq(Revolver.settings: _*)

assemblySettings
