addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

libraryDependencies <+= sbtVersion("org.scala-sbt" % "scripted-plugin" % _)

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
