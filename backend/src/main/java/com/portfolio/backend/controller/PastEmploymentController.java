package com.portfolio.backend.controller;

import com.portfolio.backend.entity.PastEmployment;
import com.portfolio.backend.service.PastEmploymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employment")
@CrossOrigin("*")
public class PastEmploymentController {

    private final PastEmploymentService service;

    public PastEmploymentController(PastEmploymentService service) {
        this.service = service;
    }

    @PostMapping
    public PastEmployment create(@RequestBody PastEmployment employment) {
        return service.create(employment);
    }

    @GetMapping
    public List<PastEmployment> getAll() {
        return service.getAll();
    }
}
