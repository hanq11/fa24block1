/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi11.service;

import java.util.ArrayList;
import sd1807.Buoi11.model.DienThoai;

/**
 *
 * @author syn
 */
public class DienThoaiService {
    ArrayList<DienThoai> danhSach = new ArrayList<>();
    
    public DienThoaiService() {
        danhSach.add(new DienThoai(1, "Nokia G3", "Nokia", 3.4f, true));
        danhSach.add(new DienThoai(2, "Iphone 15", "Iphone", 5.4f, false));
        danhSach.add(new DienThoai(3, "Samsung S24", "Samsung", 7.4f, false));
    }
    
    public ArrayList<DienThoai> getAll() {
        return danhSach;
    }
    
    public void themDienThoai(DienThoai dienThoai) {
        danhSach.add(dienThoai);
    }
    
    public void suaDienThoai(DienThoai dienThoai) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == dienThoai.getId()) {
                danhSach.set(i, dienThoai);
            }
        }
    }
    
    public void xoaDienThoai(int id) {
        // cach 1
        DienThoai dienThoaiCanXoa = null;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id) {
                dienThoaiCanXoa = danhSach.get(i);
            }
        }
        danhSach.remove(dienThoaiCanXoa);
        // cach 2
        // danhSach.removeIf(dienThoai -> dienThoai.getId() == id);
    }
    
    public void sapXep() {
        danhSach.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }
}
