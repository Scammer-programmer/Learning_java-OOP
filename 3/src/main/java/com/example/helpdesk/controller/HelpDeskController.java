package com.example.helpdesk.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelpDeskController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Главная - Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать в систему технической поддержки!");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "О нас");
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("pageTitle", "Контакты поддержки");
        return "contacts";
    }
}
