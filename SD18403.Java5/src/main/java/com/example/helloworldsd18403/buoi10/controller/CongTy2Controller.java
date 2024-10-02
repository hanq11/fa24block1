package com.example.helloworldsd18403.buoi10.controller;

import com.example.helloworldsd18403.buoi10.model.CongTy;
import com.example.helloworldsd18403.buoi10.model.CongTyKhac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buoi10")
public class CongTy2Controller {
    @Autowired
    CongTy congTy;

    @Autowired
    @Qualifier("2")
    CongTyKhac congTyKhac;

    @ResponseBody
    @GetMapping("/cong-ty2")
    public String getCongTy2() {
        return congTy.getName();
    }

    @ResponseBody
    @GetMapping("/cong-ty-khac")
    public String getCongTyKhac() {
        return congTyKhac.getName();
    }
}
