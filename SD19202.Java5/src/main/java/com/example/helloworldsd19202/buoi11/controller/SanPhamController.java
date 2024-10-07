package com.example.helloworldsd19202.buoi11.controller;

import com.example.helloworldsd19202.buoi11.entity.DanhMuc;
import com.example.helloworldsd19202.buoi11.entity.SanPham;
import com.example.helloworldsd19202.buoi11.repository.DanhMucRepository;
import com.example.helloworldsd19202.buoi11.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/buoi11/san-pham")
public class SanPhamController {
    @Autowired
    DanhMucRepository danhMucRepository;

    @Autowired
    SanPhamRepository sanPhamRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        return "buoi11/san-pham/hien-thi";
    }

    @ModelAttribute("listDanhMuc")
    List<DanhMuc> getListDanhMuc() {
        return danhMucRepository.findAll();
    }

    @PostMapping("/them")
    public String them(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/buoi11/san-pham/hien-thi";
    }

    @GetMapping("/sua/{id}")
    public String showSua(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("sanPham", sanPhamRepository.findById(id).get());
        return "buoi11/san-pham/sua";
    }

    @PostMapping("/sua")
    public String sua(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/buoi11/san-pham/hien-thi";
    }
    @GetMapping("/xoa")
    public String xoa(@RequestParam("id") Integer id) {
        sanPhamRepository.deleteById(id);
        return "redirect:/buoi11/san-pham/hien-thi";
    }
}
