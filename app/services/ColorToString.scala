package services

import java.awt.Color

object ColorToString {

  def apply(c: Color): String = s"#${(c.getRed :: c.getGreen :: c.getBlue :: Nil).map(_.toHexString.reverse.padTo(2, "0").reverse.mkString).mkString}"

}
