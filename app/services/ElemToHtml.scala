package services

import play.twirl.api.Html

import scala.xml.Elem

object ElemToHtml {

  def apply(e: Elem): Html = Html(e.toString())

}
