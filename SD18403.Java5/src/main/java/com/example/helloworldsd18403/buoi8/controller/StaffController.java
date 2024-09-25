package com.example.helloworldsd18403.buoi8.controller;

import com.example.helloworldsd18403.buoi8.model.Country;
import com.example.helloworldsd18403.buoi8.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/buoi8")
public class StaffController {
    @GetMapping("/staff")
    public String showForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "buoi8/hien-thi";
    }

    @PostMapping("/staff")
    public String save(@ModelAttribute("staff") Staff staff, Model model) {
        model.addAttribute("message", "luu thanh cong");
        return "buoi8/hien-thi";
    }

    @ModelAttribute("positions")
    public Map<String, String> getPositions() {
        Map<String, String> positions = new HashMap();
        positions.put("tp", "Truong phong");
        positions.put("gd", "Giam doc");
        positions.put("tk", "Thu ky");
        return positions;
    }

    @ModelAttribute("hobbies")
    public String[] getHobbies() {
        return new String[]{"An", "Ngu", "Choi"};
    }

    @ModelAttribute("countries")
    public List<Country> getCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country(1,"Viet Nam"));
        countries.add(new Country(2, "My"));
        countries.add(new Country(3, "Trung Quoc"));
        return countries;
    }
}
