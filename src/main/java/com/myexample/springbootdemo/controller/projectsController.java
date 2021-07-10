package com.myexample.springbootdemo.controller;


import com.myexample.springbootdemo.model.Projects;
import com.myexample.springbootdemo.service.ProjectsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/*Точка входа из внешнего мира*/

@Controller
public class projectsController {

    private ProjectsService projectsService;

    public projectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping("/projects")
    public String findAll(Model model){
        List<Projects> projects = projectsService.findAll();
        model.addAttribute("projects", projects);
        return "projects-list";
    }

/*Get и Post методы для создания юзера*/

    @GetMapping("/project-create")
    public String createProjectForm(Projects projects){
        return "/project-create";
    }

    @PostMapping("/project-create")
    public String createProject(Projects projects){
        projectsService.saveProject(projects);
        return "redirect:/projects";
    }

    @GetMapping("/project-update/{id}")
    public String updateProjectForm(@PathVariable("id") Long id, Model model){
        Projects projects = projectsService.findById(id);
        model.addAttribute("projects", projects);
        return "/project-update";
    }

    @PostMapping("/project-update")
    public String updateProject(Projects projects){
        projectsService.saveProject(projects);
        return "redirect:/projects";
    }
}
