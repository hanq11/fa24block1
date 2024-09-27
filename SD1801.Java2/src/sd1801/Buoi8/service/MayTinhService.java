/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi8.service;

import java.util.ArrayList;
import sd1801.Buoi8.model.MayTinh;

/**
 *
 * @author syn
 */
public class MayTinhService {
    ArrayList<MayTinh> danhSach = new ArrayList<>();
    
    public MayTinhService() {
        danhSach.add(new MayTinh(1, "Asus", 5.5f, "Do"));
        danhSach.add(new MayTinh(2, "Lenovo", 6.5f, "Xanh"));
        danhSach.add(new MayTinh(3, "Dell", 7.5f, "Den"));
    }
    
    public ArrayList<MayTinh> getAll() {
        return danhSach;
    }
    
    public void themMayTinh(MayTinh mt) {
        danhSach.add(mt);
    }
    
    public void suaMayTinh(MayTinh mt) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == mt.getId()) {
                danhSach.set(i, mt);
            }
        }
    }
    public void xoaMayTinh(int id) {
        MayTinh mayTinhCanXoa = null;
        for(MayTinh mt : danhSach) {
            if(mt.getId() == id) {
                mayTinhCanXoa = mt;
            }
        }
        danhSach.remove(mayTinhCanXoa);
    }
}
