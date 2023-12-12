package com.org.revenge.devstudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.org.revenge.devstudio.services.KeyGeneration.symbolGenerator;

@Controller
public class MainController {
    @GetMapping("/") //main page
    public String home(Model model) {
        model.addAttribute("title", "Мир"); //page name

        String a = "12345";
        model.addAttribute("pasteOutput", a);

        return "home"; //html sample
    }

    @GetMapping("/test") //main page
    public String test(Model model) {
        model.addAttribute("title", "Мир"); //page name

        String a = "12345";
        model.addAttribute("pasteOutput", a);

        return "test"; //html sample
    }

    @PostMapping("/create")
    @ResponseBody
    public String createPaste(@RequestParam("pasteInput") String pasteInput) { //button function
        String uniCode = symbolGenerator();
        if (pasteInput.isEmpty() || pasteInput.trim().isEmpty()) return "Пожалуйста, введите ваш текст.";
        return uniCode;
    }
}