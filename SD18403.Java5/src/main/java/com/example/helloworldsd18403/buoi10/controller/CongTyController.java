package com.example.helloworldsd18403.buoi10.controller;

import com.example.helloworldsd18403.buoi10.model.CongTy;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buoi10")
public class CongTyController {
    @Autowired
    CongTy congTy;

    @ResponseBody
    @GetMapping("/cong-ty")
    public String getCongTy() {
        return congTy.getName();
    }

    @ResponseBody
    @GetMapping("/edit-cong-ty")
    public void editCongTy() {
        congTy.setName("TEST");
    }
}
