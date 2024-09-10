package com.example.helloworldsd19202.buoi1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String showHome(Model model) {
        model.addAttribute("name", "SD19202");
        return "home";
    }
}
