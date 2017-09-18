sbt-waroverlay
============

Add the plugin in `project/plugins.sbt`

```scala
addSbtPlugin("org.scalatra.sbt" % "sbt-waroverlay" % "1.0.0")
```

## WarOverlayPlugin

WarOverlayPlugin is mini war-overlay plugin. It allows you to depend on war files and
it will copy the static files out of those wars and into the current project.
You can use it to depend on jquery-atmosphere for example.

### usage

```scala
enablePlugins(WarOverlayPlugin)
```

Execute the `overlayWars` task as follows with the sbt shell, it will copy the static files out of
those wars and into the current project.

```
> overlayWars
```
