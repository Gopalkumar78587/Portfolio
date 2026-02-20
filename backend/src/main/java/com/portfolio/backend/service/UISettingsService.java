package com.portfolio.backend.service;

import com.portfolio.backend.entity.UISettings;

public interface UISettingsService {
    UISettings save(UISettings settings);
    UISettings get();
}
