package com.example.helloworldsd18403.buoi11.controller;

import com.example.helloworldsd18403.buoi11.entity.DanhMuc;
import com.example.helloworldsd18403.buoi11.entity.DanhMucRequest;
import com.example.helloworldsd18403.buoi11.entity.DanhMucResponse;
import com.example.helloworldsd18403.buoi11.repository.DanhMucRepository;
import com.example.helloworldsd18403.buoi11.service.DanhMucService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/buoi11")
public class DanhMucController {
    @Autowired
    DanhMucService danhMucService;

    @Autowired
    DanhMucRepository danhMucRepository;

//    @GetMapping("/hien-thi")
//    public String hienThi(Model model) {
//        List<DanhMuc> danhMucList = danhMucService.getAll();
//        List<DanhMucResponse> danhMucResponses = new ArrayList<>();
//        for(DanhMuc danhMuc: danhMucList) {
//            danhMucResponses.add(new DanhMucResponse(danhMuc.getId(), danhMuc.getTen()));
//        }
//        model.addAttribute("danhSach", danhMucResponses);
//        return "buoi11/hien-thi";
//    }
    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("danhSach", danhMucRepository.getAllDanhMucResponse());
        return "buoi11/hien-thi";
    }

    @PostMapping("/them")
    public String them(DanhMucRequest danhMucRequest) {
        DanhMuc danhMuc = new DanhMuc();
        BeanUtils.copyProperties(danhMucRequest, danhMuc);
        danhMucService.them(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/sua/{id}")
    public String hienThiSua(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("danhMuc", danhMucService.findById(id));
        return "buoi11/sua";
    }
    @PostMapping("/sua")
    public String sua(DanhMuc danhMuc) {
        danhMucService.sua(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoa(@RequestParam("id") Integer id) {
        danhMucService.xoa(id);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/chi-tiet/{id}")
    public String chiTiet(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("danhMuc", danhMucService.findById(id));
        return "buoi11/chi-tiet";
    }
}
