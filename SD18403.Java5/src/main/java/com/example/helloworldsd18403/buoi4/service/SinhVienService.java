package com.example.helloworldsd18403.buoi4.service;

import com.example.helloworldsd18403.buoi4.model.SinhVien;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SinhVienService {
    ArrayList<SinhVien> danhSach = new ArrayList<>();

    public SinhVienService() {
        danhSach.add(new SinhVien("1", "Nguyen Van A", 5, "Ha Noi", true));
        danhSach.add(new SinhVien("2", "Tran Thi B", 9, "Bac Giang", false));
        danhSach.add(new SinhVien("3", "Pham Van C", 10, "Ha Tinh", true));
    }

    public ArrayList<SinhVien> getAll() { return danhSach; }

    public SinhVien findById(String id){
        for(SinhVien sv: danhSach) {
            if(sv.getId().equals(id)) {
                return sv;
            }
        }
        return null;
    }

    public void add(SinhVien sv) {
        danhSach.add(sv);
    }

    public void update(SinhVien sv) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId().equals(sv.getId())) {
                danhSach.set(i, sv);
            }
        }
    }

    public void deleteById(String id) {
        SinhVien sinhVienCanXoa = null;
        for(SinhVien sv: danhSach) {
            if(sv.getId().equals(id)) {
                sinhVienCanXoa = sv;
            }
        }
        if(sinhVienCanXoa != null) {
            danhSach.remove(sinhVienCanXoa);
        }
    }
}
