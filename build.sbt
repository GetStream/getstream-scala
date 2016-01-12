name := "getstream-scala-client"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
	"org.json4s" %% "json4s-jackson" % "3.3.0",
	"org.json4s" %% "json4s-ext" % "3.3.0",
	"com.twitter" %% "finagle-httpx" % "6.29.0",
	"com.typesafe" % "config" % "1.3.0",
	"joda-time" % "joda-time" % "2.9.1",
	"org.apache.httpcomponents" % "httpcore" % "4.4",
	"org.apache.httpcomponents" % "httpclient" % "4.4",
	"org.scalatest" % "scalatest_2.11" % "2.2.5" % "test"
)
