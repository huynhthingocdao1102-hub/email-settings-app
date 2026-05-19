package com.example.emailsettingsapp.service;

import com.example.emailsettingsapp.model.Settings;

public interface ISettingsService {
    Settings getSettings();

    void update(Settings settings);
}
