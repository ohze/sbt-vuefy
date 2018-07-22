lazy val root = Project("plugins", file(".")).aggregate(sbtVuefy).dependsOn(sbtVuefy)

lazy val sbtVuefy = RootProject(file("./..").getCanonicalFile.toURI)

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.17")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")
// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"