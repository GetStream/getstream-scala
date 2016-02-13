package com.github.imliar.getstream.client

import org.joda.time.DateTime
import org.json4s.JsonAST.{JNull, JString}
import org.json4s.{CustomSerializer}

import org.joda.time._
/**
  * Created by derric on 2/12/16.
  */
case object DateTimeSerializer extends CustomSerializer[DateTime](format => (
  {
    case JString(s) => DateTime.parse(s).withZone(DateTimeZone.UTC)
    case JNull => null
  },
  {
    case d: DateTime => JString(format.dateFormat.format(d.toDate))
  }
  ))