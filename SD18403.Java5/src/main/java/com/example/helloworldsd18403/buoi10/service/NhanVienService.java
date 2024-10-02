package com.example.helloworldsd18403.buoi10.service;

import com.example.helloworldsd18403.buoi10.model.NhanVien;
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
                new NhanVien("C"),
                new NhanVien("D")
        );
    }

    public List<NhanVien> getAll() {
        return danhSach;
    }
}
