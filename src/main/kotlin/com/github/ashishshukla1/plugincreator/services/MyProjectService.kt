package com.github.ashishshukla1.plugincreator.services

import com.github.ashishshukla1.plugincreator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
