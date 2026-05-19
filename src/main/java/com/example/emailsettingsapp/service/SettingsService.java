package com.example.emailsettingsapp.service;

import com.example.emailsettingsapp.model.Settings;
import org.springframework.stereotype.Service;

@Service
public class SettingsService implements ISettingsService {

    private Settings settings = new Settings(
            "English",
            25,
            false,
            "Thor\nKing, Asgard"
    );

    @Override
    public Settings getSettings() {
        return settings;
    }

    @Override
    public void update(Settings settings) {
        this.settings = settings;
    }
}