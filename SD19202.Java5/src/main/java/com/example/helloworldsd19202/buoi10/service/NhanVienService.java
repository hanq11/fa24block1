package com.example.helloworldsd19202.buoi10.service;

import com.example.helloworldsd19202.buoi10.model.NhanVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NhanVienService {
    List<NhanVien> danhSach = null;

    public NhanVienService() {
        danhSach = Arrays.asList(
                new NhanVien("A"),
                new NhanVien("B"),
                new NhanVien("C")
        );

    }

    public List<NhanVien> getAll() {
        return danhSach;
    }
}
