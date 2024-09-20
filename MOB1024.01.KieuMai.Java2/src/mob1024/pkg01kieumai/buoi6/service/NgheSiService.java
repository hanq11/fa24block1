/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi6.service;

import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi6.model.NgheSi;

/**
 *
 * @author syn
 */
public class NgheSiService {
    ArrayList<NgheSi> danhSach = new ArrayList<>();
    
    public NgheSiService() {
        danhSach.add(new NgheSi(1, "A", 3.4f));
        danhSach.add(new NgheSi(2, "B", 4.4f));
        danhSach.add(new NgheSi(3, "C", 6.4f));
    }
    
    public ArrayList<NgheSi> getAll() {
        return danhSach;
    }
    
    public void add(NgheSi ngheSi) {
        danhSach.add(ngheSi);
    }
    
    public void updateById(NgheSi ngheSi) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == ngheSi.getId()) {
                danhSach.set(i, ngheSi);
            }
        }
    }
    
    public void deleteById(int id) {
        NgheSi ngheSiCanXoa = null;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id) {
                ngheSiCanXoa = danhSach.get(i);
            }
        }
        danhSach.remove(ngheSiCanXoa);
    }
}
