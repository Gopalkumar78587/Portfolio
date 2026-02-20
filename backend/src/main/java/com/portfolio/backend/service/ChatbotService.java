package com.portfolio.backend.service;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.portfolio.backend.entity.Skill;
import com.portfolio.backend.repository.PastEmploymentRepository;
import com.portfolio.backend.repository.ProjectRepository;
import com.portfolio.backend.repository.SkillRepository;

@Service
public class ChatbotService {

    private final SkillRepository skillRepo;
    private final ProjectRepository projectRepo;
    private final PastEmploymentRepository employmentRepo;

    public ChatbotService(
        SkillRepository skillRepo,
        ProjectRepository projectRepo,
        PastEmploymentRepository employmentRepo
    ) {
        this.skillRepo = skillRepo;
        this.projectRepo = projectRepo;
        this.employmentRepo = employmentRepo;
    }

    public String reply(String question) {
        String q = question.toLowerCase();

        if (q.contains("skill")) {
            return "Skills: " + skillRepo.findAll()
                    .stream()
                    .map(Skill::getName)
                    .limit(5)
                    .collect(Collectors.joining(", "));
        }

        if (q.contains("project")) {
            return "Total projects: " + projectRepo.count();
        }

        if (q.contains("experience")) {
            return "Experience entries: " + employmentRepo.count();
        }

        return "You can ask about skills, projects, or experience.";
    }
}
