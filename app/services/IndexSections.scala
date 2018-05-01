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
    DevCard("https://github.com/", "GitHub", new Color(0x2c3e50), s"${routes.Assets.versioned("images/dev/github.png")}",
      <div>
        GitHub is where you will find most of my programming. I keep everything I do there, and it provides easy options
        to contact me. GitHub is also a great platform to show programming skill and preference.
      </div>
    ).toDevCardElem,
    DevCard("https://gitter.im", "Gitter", new Color(0x27ae60), s"${routes.Assets.versioned("images/dev/gitter.png")}",
      <div>
        Gitter is where I can recieve lots of powerful help with frameworks and tools I am using. Gitter makes
        communication easy. With each project able to have multiple rooms, and amazing built-in GitHub support, Gitter
        is the first step to take for project communication.
      </div>
    ).toDevCardElem,
    DevCard("https://scala-lang.org", "Scala", new Color(0x9f1f2a), s"${routes.Assets.versioned("images/dev/scala.png")}",
      <div>
        Scala is my go-to language. If I can do a project in Scala, I will. Scala is a JVM Language that leaves you with
        little to no boilerplate to write yourself. <a href="https://github.com/TsundereBug/bug.tf">Take this website,
        for example.</a>
      </div>
    ).toDevCardElem,
    DevCard("https://crystal-lang.org", "Crystal", new Color(0x776791), s"${routes.Assets.versioned("images/dev/crystal.png")}",
      <div>
        Crystal is a fairly new LLVM language with a Ruby-like syntax. It's easy to read, easy to develop, easy to
        maintain, and includes one of the best Standard Libraries out there. For these reasons, Crystal is my choice for
        native projects.
      </div>
    ).toDevCardElem,
    DevCard("https://jetbrains.com", "JetBrains", new Color(0x7d7d7d), s"${routes.Assets.versioned("images/dev/ij.png")}",
      <div>
        JetBrains makes powerful IDEs and management tools. This website was created using the Scala plugin in
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

  val socialMedia: Section = Section("Social Media",
    <div>
      Todo
    </div>
  )

  val sections: List[Section] =
    aboutMe ::
    devStuff ::
    socialMedia ::
      Nil

}
