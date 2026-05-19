package com.example.emailsettingsapp.controller;

import com.example.emailsettingsapp.model.Settings;
import com.example.emailsettingsapp.service.ISettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SettingsController {

    @Autowired
    private ISettingsService settingsService;

    @GetMapping("/settings")
    public String showForm(Model model) {
        model.addAttribute("settings", settingsService.getSettings());

        model.addAttribute("languages", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});

        model.addAttribute("pageSizes", new Integer[]{5, 10, 15, 25, 50, 100});

        return "settings";
    }

    @PostMapping("/settings")
    public String update(@ModelAttribute("settings") Settings settings) {
        settingsService.update(settings);
        return "redirect:/settings";
    }
}