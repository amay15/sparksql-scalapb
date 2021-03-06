addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.10")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.18")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.8.2"

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
