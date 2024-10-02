package com.example.helloworldsd18403.buoi10.controller;

import com.example.helloworldsd18403.buoi10.model.NhanVien;
import com.example.helloworldsd18403.buoi10.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/buoi10")
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

    @ResponseBody
    @GetMapping("/nhan-vien")
    public List<NhanVien> getNhanVien() {
        return nhanVienService.getAll();
    }
}
