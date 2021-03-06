package org.scalatra.sbt

import sbt._

object Compat {

  def compileModules(m: UpdateReport): Option[Seq[sbt.ModuleReport]] = {
    m.configuration(Compile.name).map(_.modules)
  }

}
