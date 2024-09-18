/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi5.service;

import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi5.model.Sach;

/**
 *
 * @author syn
 */
public class QuanLySach {
    ArrayList<Sach> danhSach = new ArrayList<>();
    
    public QuanLySach() {
        danhSach.add(new Sach(1, "Sach A", 10));
        danhSach.add(new Sach(2, "Sach B", 7));
        danhSach.add(new Sach(3, "Sach C", 9));
    }
    
    public ArrayList<Sach> findAll() { 
        return danhSach; 
    }
    
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }
    
    public void xoaSachTheoId(int id) {
        Sach sachCanXoa = null;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id) {
                sachCanXoa = danhSach.get(i);
            }
        }
        danhSach.remove(sachCanXoa);
    }
    
    public void suaSach(Sach sach) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == sach.getId()) {
                danhSach.set(i, sach);
            }
        }
    }
}
