package com.portfolio.backend.service;

import java.util.List;

import com.portfolio.backend.entity.Project;

public interface ProjectService {

    Project createProject(Project project);

    List<Project> getAllProjects();

    Project getProjectById(Long id);

    void deleteProject(Long id);
}
