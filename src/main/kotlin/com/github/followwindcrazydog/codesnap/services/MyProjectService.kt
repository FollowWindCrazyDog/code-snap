package com.github.followwindcrazydog.codesnap.services

import com.intellij.openapi.project.Project
import com.github.followwindcrazydog.codesnap.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
