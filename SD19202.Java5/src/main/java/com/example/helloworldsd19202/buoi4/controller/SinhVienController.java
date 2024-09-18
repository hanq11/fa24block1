package com.example.helloworldsd19202.buoi4.controller;

import com.example.helloworldsd19202.buoi4.model.SinhVien;
import com.example.helloworldsd19202.buoi4.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi4")
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("danhSach", sinhVienService.getAll());
        return "buoi4/hien-thi";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam("id") String id) {
        model.addAttribute("sinhVien", sinhVienService.findById(id));
        return "buoi4/detail";
    }

    @GetMapping("/add")
    public String showFormAdd() {
        return "buoi4/add";
    }

    @PostMapping("/add")
    public String addSinhVien(SinhVien sinhVien) {
        sinhVienService.add(sinhVien);
        return "redirect:/buoi4/hien-thi";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdate(Model model, @PathVariable("id") String id) {
        model.addAttribute("sinhVien", sinhVienService.findById(id));
        return "buoi4/update";
    }

    @PostMapping("/update")
    public String updateSinhVien(SinhVien sinhVien) {
        sinhVienService.update(sinhVien);
        return "redirect:/buoi4/hien-thi";
    }

    @GetMapping("/delete")
    public String deleteSinhVien(@RequestParam("id") String id) {
        sinhVienService.deleteById(id);
        return "redirect:/buoi4/hien-thi";
    }
}
