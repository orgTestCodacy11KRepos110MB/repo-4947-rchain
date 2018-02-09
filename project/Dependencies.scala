import sbt._

object Dependencies {
  val loggingDependencies = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
  )

  val testingDependencies = Seq(
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  )

  // val coverageDependencies = Seq(
  //   "org.scoverage" % "sbt-scoverage" % "1.5.1"
  // )

  val commonDependencies = loggingDependencies ++ testingDependencies // ++ coverageDependencies

  val crypto = "org.scorexfoundation" %% "scrypto" % "2.0.0"

  val argParsing = "org.rogach" %% "scallop" % "3.0.3"

  val uriParsing = "io.lemonlabs" %% "scala-uri" % "0.5.0"

  val uPnP = "org.bitlet" % "weupnp" % "0.1.+"

  val spire = compilerPlugin("org.spire-math"  %% "kind-projector" % "0.9.4")
  val scalaz = "org.scalaz" %% "scalaz-core" % "7.3.0-M17"

  val protobufCompiler = "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.6"
  val protobufRuntime = "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf"

  val protobufDependencies = Seq(protobufCompiler, protobufRuntime)

  val cats = "org.typelevel" %% "cats-core" % "1.0.1"

  val lmdb = "org.lmdbjava" % "lmdbjava" % "0.0.2"
}
