package com.portfolio.backend.service.impl;

import com.portfolio.backend.entity.PastEmployment;
import com.portfolio.backend.repository.PastEmploymentRepository;
import com.portfolio.backend.service.PastEmploymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PastEmploymentServiceImpl implements PastEmploymentService {

    private final PastEmploymentRepository repository;

    public PastEmploymentServiceImpl(PastEmploymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public PastEmployment create(PastEmployment employment) {
        return repository.save(employment);
    }

    @Override
    public List<PastEmployment> getAll() {
        return repository.findAllByOrderByStartDateDesc();
    }
}
