package com.portfolio.backend.repository;

import com.portfolio.backend.entity.UISettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UISettingsRepository extends JpaRepository<UISettings, Long> {
}
