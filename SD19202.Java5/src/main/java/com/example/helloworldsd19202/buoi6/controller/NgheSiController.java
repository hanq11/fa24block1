package com.example.helloworldsd19202.buoi6.controller;

import com.example.helloworldsd19202.buoi6.model.NgheSi;
import com.example.helloworldsd19202.buoi6.service.NgheSiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi6")
public class NgheSiController {
    NgheSiService ngheSiService = new NgheSiService();

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("danhSach", ngheSiService.getAll());
        return "buoi6/hien-thi";
    }

    @GetMapping("/add")
    public String showFormAdd() {
        return "buoi6/add";
    }

    @PostMapping("/add")
    public String addNgheSi(NgheSi ngheSi) {
        ngheSiService.addNgheSi(ngheSi);
        return "redirect:/buoi6/hien-thi";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("ngheSi", ngheSiService.findNgheSiById(id));
        return "buoi6/update";
    }

    @PostMapping("/update")
    public String updateNgheSi(NgheSi ngheSi) {
        ngheSiService.updateNgheSi(ngheSi);
        return "redirect:/buoi6/hien-thi";
    }

    @GetMapping("/delete")
    public String deleteNgheSi(@RequestParam("id") int id) {
        ngheSiService.deleteNgheSi(id);
        return "redirect:/buoi6/hien-thi";
    }

    @GetMapping("/search")
    public String searchNgheSi(@RequestParam("id") int id, Model model) {
        model.addAttribute("ngheSi", ngheSiService.findNgheSiById(id));
        return "buoi6/update";
    }
}
