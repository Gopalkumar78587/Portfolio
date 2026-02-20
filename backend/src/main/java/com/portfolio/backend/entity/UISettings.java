package com.portfolio.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ui_settings")
public class UISettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String theme;        // light / dark
    private String primaryColor; // #4caf50
    private boolean navbarVisible;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getPrimaryColor() { return primaryColor; }
    public void setPrimaryColor(String primaryColor) { this.primaryColor = primaryColor; }

    public boolean isNavbarVisible() { return navbarVisible; }
    public void setNavbarVisible(boolean navbarVisible) { this.navbarVisible = navbarVisible; }
}
