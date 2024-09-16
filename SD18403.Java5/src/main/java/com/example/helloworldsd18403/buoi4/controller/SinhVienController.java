package com.example.helloworldsd18403.buoi4.controller;

import com.example.helloworldsd18403.buoi4.service.SinhVienService;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buoi4")
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("danhSach", sinhVienService.getAll());
        return "buoi4/hien-thi";
    }
}
