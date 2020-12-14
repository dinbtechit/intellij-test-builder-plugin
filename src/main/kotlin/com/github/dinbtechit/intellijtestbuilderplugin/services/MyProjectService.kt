package com.github.dinbtechit.intellijtestbuilderplugin.services

import com.github.dinbtechit.intellijtestbuilderplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
