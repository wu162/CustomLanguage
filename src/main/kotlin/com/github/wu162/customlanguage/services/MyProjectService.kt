package com.github.wu162.customlanguage.services

import com.intellij.openapi.project.Project
import com.github.wu162.customlanguage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
