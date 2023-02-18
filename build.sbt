val scalaV = "2.13.10"
val scala3Version = "3.2.2"
ThisBuild / scalaVersion := scalaV
ThisBuild / version := "1.0-SNAPSHOT"
ThisBuild / organization := "com.baeldung"
ThisBuild / organizationName := "core-scala"

val jUnitInterface = "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
val catsEffect = "org.typelevel" %% "cats-effect" % "3.4.7"
val catEffectTest = "org.typelevel" %% "cats-effect-testkit" % "3.4.7" % Test
val scalaReflection = "org.scala-lang" % "scala-reflect" % scalaV
val logback = "ch.qos.logback" % "logback-classic" % "1.3.5"

val scalaTestDeps = Seq(
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-wordspec" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-flatspec" % "3.2.15" % Test
)
val scalaMock = "org.scalamock" %% "scalamock" % "5.2.0" % Test
val zioVersion = "2.0.9"

lazy val scala_core = (project in file("scala-core"))
  .settings(
    name := "scala-core",
    libraryDependencies ++=
      Seq(
        jUnitInterface,
        catsEffect
      ) ++ scalaTestDeps
  )

lazy val scala_core_2 = (project in file("scala-core-2"))
  .settings(
    name := "scala-core-2",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += scalaMock,
    libraryDependencies += jUnitInterface
  )

lazy val scala_core_3 = (project in file("scala-core-3"))
  .settings(
    name := "scala-core-3",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface,
    libraryDependencies += scalaReflection,
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
  )

lazy val scala_core_4 = (project in file("scala-core-4"))
  .settings(
    name := "scala-core-4",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface,
    libraryDependencies += scalaReflection
  )

lazy val scala_core_5 = (project in file("scala-core-5"))
  .settings(
    name := "scala-core-5",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface,
    libraryDependencies += scalaReflection,
    libraryDependencies += "joda-time" % "joda-time" % "2.12.2",
    libraryDependencies += "org.joda" % "joda-convert" % "2.2.3",
    libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.32.0"
  )

lazy val scala_core_6 = (project in file("scala-core-6"))
  .settings(
    name := "scala-core-6",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface
  )

lazy val scala_core_7 = (project in file("scala-core-7"))
  .settings(
    name := "scala-core-7",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface,
    libraryDependencies += "com.github.scopt" %% "scopt" % "4.1.0",
    libraryDependencies += "org.rogach" %% "scallop" % "4.1.0",
    libraryDependencies += "org.backuity.clist" %% "clist-core" % "3.5.1",
    libraryDependencies += "org.backuity.clist" %% "clist-macros" % "3.5.1" % "provided",
    libraryDependencies += "args4j" % "args4j" % "2.33"
  )

lazy val scala_core_8 = (project in file("scala-core-8"))
  .settings(
    name := "scala-core-8",
    libraryDependencies += scalaReflection,
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value % "test"
    // scalacOptions += "-Ymacro-debug-lite"
  )

lazy val scala_core_io = (project in file("scala-core-io"))
  .settings(
    name := "scala-core-io",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value
  )

lazy val scala_core_oop = (project in file("scala-core-oop"))
  .settings(
    name := "scala-core-oop",
    libraryDependencies ++=
      Seq(catsEffect, jUnitInterface) ++ scalaTestDeps
  )

lazy val scala_core_fp = (project in file("scala-core-fp"))
  .settings(
    name := "scala-core-fp",
    libraryDependencies ++=
      Seq(catsEffect, jUnitInterface) ++ scalaTestDeps
  )

lazy val scala_lang = (project in file("scala-lang"))
  .settings(
    name := "scala-lang",
    libraryDependencies ++=
      Seq(jUnitInterface) ++ scalaTestDeps
  )

lazy val scala_lang_2 = (project in file("scala-lang-2"))
  .settings(
    name := "scala-lang",
    libraryDependencies ++=
      Seq(jUnitInterface) ++ scalaTestDeps
  )

lazy val scala_core_collections = (project in file("scala-core-collections"))
  .settings(
    name := "scala-core-collections",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
    ) ++ scalaTestDeps
  )

lazy val scala_core_collections_2 =
  (project in file("scala-core-collections-2"))
    .settings(
      name := "scala-core-collections-2",
      libraryDependencies ++= scalaTestDeps
    )

lazy val scala_test = (project in file("scala-test"))
  .settings(
    name := "scala-test",
    libraryDependencies ++=
      Seq(
        "org.scalatestplus" %% "mockito-3-4" % "3.2.10.0" % Test,
        jUnitInterface,
        scalaMock
      ) ++ scalaTestDeps
  )

lazy val scala_akka_dependencies: Seq[ModuleID] = Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
  "com.lightbend.akka" %% "akka-stream-alpakka-mongodb" % "5.0.0",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0",
  "com.lightbend.akka" %% "akka-stream-alpakka-file" % "5.0.0",
  jUnitInterface,
  "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "2.2.0" % Test,
  "com.typesafe.akka" %% "akka-http" % "10.4.0"
) ++ scalaTestDeps
lazy val scala_test_junit4 = (project in file("scala-test-junit4"))
  .settings(
    name := "scala-test-junit4",
    libraryDependencies ++=
      Seq(
        "org.scalatestplus" %% "junit-4-12" % "3.2.2.0" % Test,
        jUnitInterface
      )
  )

lazy val scala_akka = (project in file("scala-akka"))
  .settings(
    name := "scala-akka",
    libraryDependencies ++= scala_akka_dependencies
  )

lazy val scala_akka_2 = (project in file("scala-akka-2"))
  .enablePlugins(AkkaGrpcPlugin)
  .settings(
    name := "scala-akka-2",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-http" % "10.4.0",
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.4.0",
      "com.typesafe.akka" %% "akka-http-testkit" % "10.4.0",
      "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "5.0.0",
      "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
    ) ++ scalaTestDeps
  )
val monocleVersion = "2.1.0"
val slickVersion = "3.4.1"
val shapelessVersion = "2.3.10"
val scalazVersion = "7.3.7"
val fs2Version = "3.6.1"
val AkkaVersion = "2.7.0"
val reactiveMongo = "1.0.10"

lazy val scala_libraries = (project in file("scala-libraries"))
  .settings(
    name := "scala-libraries",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies ++= Seq(
      "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % "test",
      "com.typesafe.slick" %% "slick" % slickVersion,
      "com.h2database" % "h2" % "2.1.214",
      "com.chuusai" %% "shapeless" % shapelessVersion,
      "org.scalaz" %% "scalaz-core" % scalazVersion,
      "co.fs2" %% "fs2-core" % fs2Version,
      "co.fs2" %% "fs2-io" % fs2Version,
      "junit" % "junit" % "4.13.2" % Test,
      "org.reactivemongo" %% "reactivemongo" % reactiveMongo,
      "org.reactivemongo" %% "reactivemongo-akkastream" % reactiveMongo,
      "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "3.0.0" % Test,
      logback % Test,
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-protobuf" % AkkaVersion,
      catEffectTest,
      "org.typelevel" %% "cats-effect-testing-scalatest" % "1.5.0" % Test
    )
  )

val circeVersion = "0.14.4"
val monixVersion = "3.4.1"
val elastic4sVersion = "8.5.3"
val sparkVersion = "3.3.2"

val sparkCoreDep = "org.apache.spark" %% "spark-core" % sparkVersion
val sparkSqlDep = "org.apache.spark" %% "spark-sql" % sparkVersion

lazy val scala_libraries_2 = (project in file("scala-libraries-2"))
  .settings(
    name := "scala-libraries",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion,
      "com.github.cb372" %% "scalacache-core" % "0.28.0",
      "com.github.cb372" %% "scalacache-guava" % "0.28.0",
      "com.github.cb372" %% "scalacache-cats-effect" % "0.28.0",
      "com.github.cb372" %% "scalacache-caffeine" % "0.28.0",
      "com.beachape" %% "enumeratum" % "1.7.2"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-slick" % "5.1.0",
      "org.postgresql" % "postgresql" % "42.5.4"
    ),
    libraryDependencies ++= Seq(
      "io.monix" %% "monix" % monixVersion
    ),
    dependencyOverrides := Seq(
      "com.typesafe.akka" %% "akka-protobuf-v3" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-serialization-jackson" % AkkaVersion
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
      "org.scalacheck" %% "scalacheck" % "1.17.0" % Test,
      "com.lihaoyi" %% "requests" % "0.8.0"
    ) ++ scalaTestDeps,
    libraryDependencies ++= Seq(
      "com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % elastic4sVersion,
      "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sVersion,
      logback
    )
  )

val http4sBlaze = "0.23.13"
val http4sVersion = "0.23.18"

lazy val scala_libraries_3 = (project in file("scala-libraries-3"))
  .settings(
    name := "scala-libraries",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies ++= Seq(
      sparkSqlDep,
      sparkCoreDep
    ),
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % http4sVersion,
      "org.http4s" %% "http4s-blaze-server" % http4sBlaze,
      "org.http4s" %% "http4s-blaze-client" % http4sBlaze,
      "com.beachape" %% "enumeratum" % "1.7.2",
      "com.github.pureconfig" %% "pureconfig" % "0.17.2",
      "com.github.pureconfig" %% "pureconfig-enumeratum" % "0.17.2",
      "com.typesafe" % "config" % "1.4.2",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),
    libraryDependencies += scalaMock,
    libraryDependencies += "com.softwaremill.retry" %% "retry" % "0.3.6",
    libraryDependencies ++= Seq(
      "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
      "org.apache.logging.log4j" % "log4j-core" % "2.19.0" % Runtime
    ),
    libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.9.0"
  )

lazy val scala_libraries_os = (project in file("scala-libraries-os"))
  .settings(
    name := "scala-libraries",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies ++= Seq(
      "org.apache.logging.log4j" %% "log4j-api-scala" % "12.0",
      "org.apache.logging.log4j" % "log4j-core" % "2.19.0" % Runtime
    ),
    libraryDependencies += "com.lihaoyi" %% "os-lib" % "0.9.0"
  )

lazy val scala_libraries_4 = (project in file("scala-libraries-4"))
  .configs(IntegrationTest)
  .settings(
    name := "scala-libraries-4",
    libraryDependencies += "com.lihaoyi" %% "utest" % "0.8.1" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework"),
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-async" % "1.0.1",
      scalaReflection % Provided,
      "org.tpolecat" %% "skunk-core" % "0.5.1",
      sparkSqlDep,
      sparkCoreDep,
      logback,
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
    ),
    libraryDependencies ++= Seq(
      "com.clever-cloud.pulsar4s" %% "pulsar4s-core" % "2.9.0",
      "com.clever-cloud.pulsar4s" %% "pulsar4s-jackson" % "2.9.0",
      "org.testcontainers" % "pulsar" % "1.17.6" % IntegrationTest
    ),
    libraryDependencies ++= Seq(
      "software.amazon.awssdk" % "s3" % "2.20.7",
      "com.amazonaws" % "aws-java-sdk-s3" % "1.12.410" % IntegrationTest,
      "com.dimafeng" %% "testcontainers-scala-scalatest" % "0.40.12" % IntegrationTest,
      "com.dimafeng" %% "testcontainers-scala-localstack-v2" % "0.40.12" % IntegrationTest
    ),
    scalacOptions += "-Xasync",
    Defaults.itSettings,
    IntegrationTest / fork := true
  )

lazy val scala_strings = (project in file("scala-strings"))
  .settings(
    name := "scala-strings",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += jUnitInterface
  )

lazy val scala_design_patterns = (project in file("scala-design-patterns"))
  .settings(
    name := "scala-design-patterns",
    libraryDependencies ++= scalaTestDeps,
    libraryDependencies += scalaMock,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
  )

lazy val scala3_lang = (project in file("scala3-lang")).settings(
  libraryDependencies ++= scalaTestDeps
)

lazy val scala3_lang_2 = (project in file("scala3-lang-2")).settings(
  libraryDependencies ++= scalaTestDeps
)

lazy val cats_effects = (project in file("cats-effects"))
  .settings(
    name := "cats-effects",
    libraryDependencies += catsEffect,
    libraryDependencies += "org.typelevel" %% "munit-cats-effect-3" % "1.0.7" % Test,
    libraryDependencies += "junit" % "junit" % "4.13.2" % Test
  )

lazy val zio = (project in file("zio"))
  .settings(
    name := "zio",
    libraryDependencies += "dev.zio" %% "zio" % zioVersion,
    libraryDependencies += "dev.zio" %% "zio-streams" % zioVersion,
    libraryDependencies += "dev.zio" %% "zio-test-sbt" % zioVersion % Test,
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )

lazy val doobie = (project in file("doobie"))
  .settings(
    name := "doobie",
    libraryDependencies += "org.tpolecat" %% "doobie-core" % "1.0.0-RC2",
    libraryDependencies += "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC2"
  )

// Scala Native Project is disabled as it needs clang to installed in the target machine.
// To test the scala-native code, install clang and then uncomment this build
// lazy val scala_native = (project in file("scala-native"))
//   .settings(
//     name := "scala-native",
//     libraryDependencies += "com.lihaoyi" %%% "fansi" % "0.3.0"
//   )

lazy val reflection = (project in file("reflection"))
  .settings(
    name := "reflection",
    libraryDependencies += scalaReflection,
    libraryDependencies += "junit" % "junit" % "4.13.2" % Test
  )

lazy val scala3_libraries = (project in file("scala3-libraries"))
  .settings(
    scalaVersion := scala3Version,
    name := "scala3-libraries",
    libraryDependencies ++= Seq(
      "com.github.japgolly.clearconfig" %% "core" % "3.1.0",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )

Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-eG")

lazy val scala212 = (project in file("scala212"))
  .settings(
    scalaVersion := "2.12.17",
    name := "scala212",
    libraryDependencies ++= scalaTestDeps
  )
