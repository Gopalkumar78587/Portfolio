package com.portfolio.backend.service.impl;

import com.portfolio.backend.entity.Skill;
import com.portfolio.backend.repository.SkillRepository;
import com.portfolio.backend.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repository;

    public SkillServiceImpl(SkillRepository repository) {
        this.repository = repository;
    }

    @Override
    public Skill createSkill(Skill skill) {
        return repository.save(skill);
    }

    @Override
    public List<Skill> getAllSkills() {
        return repository.findAll();
    }
}
