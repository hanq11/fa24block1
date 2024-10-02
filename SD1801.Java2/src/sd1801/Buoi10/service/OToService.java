/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi10.service;

import java.util.ArrayList;
import sd1801.Buoi10.model.OTo;

/**
 *
 * @author syn
 */
public class OToService {
    ArrayList<OTo> danhSach = new ArrayList<>();
    
    public OToService() {
        danhSach.add(new OTo(1, "LX600", "Lexus", 13000, false));
        danhSach.add(new OTo(2, "Audi Q8", "Audi", 4500, false));
        danhSach.add(new OTo(3, "Volvo XC90", "Volvo", 5000, false));
        danhSach.add(new OTo(4, "Porche 911", "Porsche", 16000, true));
    }
    
    public ArrayList<OTo> getAll() {return danhSach;};
    public void themOto(OTo oto) {danhSach.add(oto);};
    public void suaOto(OTo oto) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == oto.getId()) {
                danhSach.set(i, oto);
            }
        }  
    }
    public void xoaOto(int id) {
        OTo oToCanXoa = null;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id) {
                oToCanXoa = danhSach.get(i);
            }
        } 
        danhSach.remove(oToCanXoa);
    }
    public ArrayList<OTo> timKiemTheoTen(String ten) {
        ArrayList<OTo> danhSachTimKiem = new ArrayList<>();
        for(OTo oto: danhSach) {
            if(oto.getTen().contains(ten)) {
                danhSachTimKiem.add(oto);
            }
        }
        return danhSachTimKiem;
    };
    public void sapXepTheoTen() {
        danhSach.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }
}
