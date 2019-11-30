// The Play plugin
addSbtPlugin( dependency= "com.typesafe.play" % "sbt-plugin" % "2.7.3")
addSbtPlugin( dependency= "com.typesafe.sbt" % "sbt-play-ebean" % "5.0.2")

// Defines scaffolding (foudependencynd under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin( dependency= "org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")

