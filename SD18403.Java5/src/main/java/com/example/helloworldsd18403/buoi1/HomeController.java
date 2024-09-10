package com.example.helloworldsd18403.buoi1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String trangChu(Model model) {
        model.addAttribute("name", "SD18403");
        return "home";
    }
}
