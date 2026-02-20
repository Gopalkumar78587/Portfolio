package com.portfolio.backend.controller;

import com.portfolio.backend.entity.UISettings;
import com.portfolio.backend.service.UISettingsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ui-settings")
@CrossOrigin("*")
public class UISettingsController {

    private final UISettingsService service;

    public UISettingsController(UISettingsService service) {
        this.service = service;
    }

    @PostMapping
    public UISettings save(@RequestBody UISettings settings) {
        return service.save(settings);
    }

    @GetMapping
    public UISettings get() {
        return service.get();
    }
}
