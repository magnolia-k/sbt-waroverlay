addSbtPlugin("org.scalariform" % "sbt-scalariform"      % "1.8.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

// scripted for plugin testing
libraryDependencies += { "org.scala-sbt" % "scripted-plugin" % sbtVersion.value }
