package com.portfolio.backend.service.impl;

import com.portfolio.backend.entity.UISettings;
import com.portfolio.backend.repository.UISettingsRepository;
import com.portfolio.backend.service.UISettingsService;
import org.springframework.stereotype.Service;

@Service
public class UISettingsServiceImpl implements UISettingsService {

    private final UISettingsRepository repo;

    public UISettingsServiceImpl(UISettingsRepository repo) {
        this.repo = repo;
    }

    @Override
    public UISettings save(UISettings settings) {
        repo.deleteAll(); // only ONE row
        return repo.save(settings);
    }

    @Override
    public UISettings get() {
        return repo.findAll().stream().findFirst().orElse(null);
    }
}
