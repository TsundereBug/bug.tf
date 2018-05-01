package services

import play.twirl.api.Html

import scala.xml.{Elem, XML}

case class Section(name: String, e: Elem) {

  def content = ElemToHtml(e)

  def toSection: Html = views.html.components.section.section(name)(content)

  def toSectionEntry = views.html.components.section.sectionentry(name)

  def sectionToElem: Elem = XML.loadString(toSection.toString())

  def sectionEntryToElem: Elem = XML.loadString(toSectionEntry.toString())

}
