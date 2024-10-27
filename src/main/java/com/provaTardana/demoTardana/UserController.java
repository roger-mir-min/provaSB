package com.provaTardana.demoTardana;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String redirectToForm() {
        return "redirect:/formulari";
    }

    @GetMapping("/formulari")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "formulari";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid User user, BindingResult result, Model model) {
        System.out.println("User: " + user);
        System.out.println("Model: " + model);
        if (result.hasErrors()) {
            System.out.println("ERROOOR!");
            return "formulari";
        }
        model.addAttribute("message", "Formulari enviat correctament!");
        return "resultat";
    }

}
