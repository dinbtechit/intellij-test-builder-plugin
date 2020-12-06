package com.github.dinbtechit.intellijtestbuilderplugin.services

import com.intellij.openapi.project.Project
import com.github.dinbtechit.intellijtestbuilderplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
