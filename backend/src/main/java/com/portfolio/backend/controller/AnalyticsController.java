package com.portfolio.backend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.repository.ChatMessageRepository;
import com.portfolio.backend.repository.ProjectRepository;
import com.portfolio.backend.repository.SkillRepository;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin
public class AnalyticsController {

    private final SkillRepository skillRepo;
    private final ProjectRepository projectRepo;
    private final ChatMessageRepository chatRepo;

    public AnalyticsController(
        SkillRepository skillRepo,
        ProjectRepository projectRepo,
        ChatMessageRepository chatRepo
    ) {
        this.skillRepo = skillRepo;
        this.projectRepo = projectRepo;
        this.chatRepo = chatRepo;
    }

    @GetMapping("/overview")
    public ResponseEntity<?> overview() {
        return ResponseEntity.ok(Map.of(
            "skills", skillRepo.count(),
            "projects", projectRepo.count(),
            "messages", chatRepo.count()
        ));
    }
}

