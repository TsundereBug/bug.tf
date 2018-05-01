package services

import java.awt.Color

import play.twirl.api.Html

import scala.xml.{Elem, XML}

case class DevCard(name: String, color: Color, icon: String, e: Elem) {

  def content = ElemToHtml(e)

  def toDevCard: Html = views.html.components.devcard(name, color, icon)(content)

  def toDevCardElem: Elem = XML.loadString(toDevCard.toString())

}
