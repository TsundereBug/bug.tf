package services

import java.awt.Color

import controllers.routes

import scala.xml.{Elem, XML}

object IndexSections {

  val aboutMe: Section = Section("About Me",
    <div>
      I'm Anthony Cerruti. Other names I go by online include:
      <ul>
        <li>bug</li>
        <li>tsun_bug</li>
        <li>TsundereBug</li>
      </ul>
    </div>
  )

  val devCards: Seq[Elem] = Seq(
    DevCard("GitHub", new Color(0x212223), s"${routes.Assets.versioned("images/dev/github.png")}",
      <div>
        GitHub is where you will find most of my programming. I keep everything I do there, and it provides easy options
        to contact me. GitHub is also a great platform to show programming skill and preference.
      </div>
    ).toDevCardElem,
    DevCard("Scala", new Color(0x7f0c1d), s"${routes.Assets.versioned("images/dev/scala.png")}",
      <div>
        Scala is my go-to language. If I can do a project in Scala, I will. Scala is a JVM Language that leaves you with
        little to no boilerplate to write yourself. <a href="https://github.com/TsundereBug/bug.tf">Take this website,
        for example.</a>
      </div>
    ).toDevCardElem,
    DevCard("Crystal", new Color(0x776791), s"${routes.Assets.versioned("images/dev/crystal.png")}",
      <div>
        Crystal is a fairly new LLVM language with a Ruby-like syntax. It's easy to read, easy to develop, easy to
        maintain, and includes one of the best Standard Libraries out there. For these reasons, Crystal is my choice for
        native projects.
      </div>
    ).toDevCardElem,
    DevCard("JetBrains", new Color(0x18d68c).darker(), s"${routes.Assets.versioned("images/dev/ij.png")}",
      <div>
        JetBrains makes powerfull IDEs and management tools. This website was created using the Scala plugin in
        IntelliJ. I've even made <a href="https://plugins.jetbrains.com/plugin/10217-discord-integration">a plugin for
        their IDEs which links them to Discord</a>.
      </div>
    ).toDevCardElem
  )

  val devStuff: Section = Section("Dev Stuff",
    <div>
      Very diverse tools with different origins are required to build your experience as a developer. Here are some of
      the many tools I use to get my work done.
      {devCards}
    </div>
  )

  val sections: List[Section] =
    aboutMe ::
    devStuff ::
      Nil

}
