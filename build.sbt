name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "io.kamon" %% "kamon-bundle" % "2.1.9",
//  "io.kamon" %% "kamon-jdbc" % "2.1.4",
//  "io.kamon" %% "kamon-akka" % "2.1.4",
  "io.kamon" %% "kamon-prometheus" % "2.1.9",
  "io.kamon" %% "kamon-zipkin" % "2.1.9",
  "com.zaxxer" % "HikariCP" % "3.4.5",
  "org.scalikejdbc" %% "scalikejdbc" % "3.4.2",
  "org.postgresql" % "postgresql" % "42.2.14"
)
