package com.example.helloworldsd19202.buoi11.controller;

import com.example.helloworldsd19202.buoi11.entity.DanhMuc;
import com.example.helloworldsd19202.buoi11.entity.SanPham;
import com.example.helloworldsd19202.buoi11.repository.DanhMucRepository;
import com.example.helloworldsd19202.buoi11.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public String hienThi(Model model, @RequestParam(value = "p", defaultValue = "0") int p) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(p, 3, sort);
        model.addAttribute("page", sanPhamRepository.findAll(pageable));
        return "buoi11/san-pham/hien-thi";
    }

    @GetMapping("/tim-kiem")
    public String timKiem(Model model, @RequestParam(value = "p", defaultValue = "0") int p, @RequestParam(value = "ten") String ten) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(p, 3, sort);
        model.addAttribute("page", sanPhamRepository.findSanPhamsByTenContains(ten, pageable));
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
