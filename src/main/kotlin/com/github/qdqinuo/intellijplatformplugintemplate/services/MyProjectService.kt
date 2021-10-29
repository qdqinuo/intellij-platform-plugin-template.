package com.github.qdqinuo.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.qdqinuo.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
