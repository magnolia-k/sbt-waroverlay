import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

lazy val root = (project in file(".")).settings(
  organization := "org.scalatra.sbt",
  name := "sbt-waroverlay",
  sbtPlugin := true,
  version := "1.0.0",
  crossSbtVersions := Seq("0.13.16", "1.0.2"),
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  libraryDependencies += {
    Defaults.sbtPluginExtra(
    "com.earldouglas" % "xsbt-web-plugin" % "4.0.0",
    (sbtBinaryVersion in pluginCrossBuild).value,
    (scalaBinaryVersion in pluginCrossBuild).value
    )
  },
  publishTo := {
    if (version.value.trim.endsWith("SNAPSHOT")) Some(Opts.resolver.sonatypeSnapshots)
    else Some(Opts.resolver.sonatypeStaging)
  },
  publishMavenStyle := true,
  pomIncludeRepository := { x => false },
  pomExtra := <url>https://github.com/scalatra/sbt-waroverlay/</url>
  <licenses>
    <license>
      <name>BSD License</name>
      <url>https://github.com/scalatra/sbt-waroverlay/blob/master/LICENSE</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:scalatra/sbt-waroverlay.git</url>
    <connection>scm:git:git@github.com:scalatra/sbt-waroverlay.git</connection>
  </scm>
  <developers>
  </developers>
)

val preferences =
ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(DanglingCloseParenthesis, Force)
Seq(preferences)
