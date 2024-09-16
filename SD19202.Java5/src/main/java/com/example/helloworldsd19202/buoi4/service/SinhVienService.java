package com.example.helloworldsd19202.buoi4.service;

import com.example.helloworldsd19202.buoi4.model.SinhVien;

import java.util.ArrayList;

public class SinhVienService {
    ArrayList<SinhVien> danhSach = new ArrayList<>();

    public SinhVienService() {
        danhSach.add(new SinhVien("1", "Thi A", 6, "HN", false));
        danhSach.add(new SinhVien("2", "Tran B", 7, "BG", true));
        danhSach.add(new SinhVien("3", "Tuan C", 8, "QN", true));
    }

    public ArrayList<SinhVien> getAll() { return danhSach; }

    public SinhVien findById(String id) {
        for(SinhVien sv : danhSach) {
            if(sv.getId().equals(id)) {
                return sv;
            }
        }
        return null;
    }

    public void add(SinhVien sv) { danhSach.add(sv); }

    public void update(SinhVien sv) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId().equals(sv.getId())) {
                danhSach.set(i, sv);
            }
        }
    }

    public void deleteById(String id) {
        SinhVien sv = null;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId().equals(id)) {
                sv = danhSach.get(i);
            }
        }
        danhSach.remove(sv);
    }
}
