package com.myexample.springbootdemo.service;

import com.myexample.springbootdemo.model.Projects;
import com.myexample.springbootdemo.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;

    public ProjectsService(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    public Projects findById(long id){
        return projectsRepository.findById(id).orElse(null);
    }

    public List<Projects> findAll(){
        return projectsRepository.findAll();
    }

    public Projects saveProject(Projects projects){
        return projectsRepository.save(projects);
    }

    public List<String> findAllCashComplete(){
        return projectsRepository.findAllCash();
    }

}
