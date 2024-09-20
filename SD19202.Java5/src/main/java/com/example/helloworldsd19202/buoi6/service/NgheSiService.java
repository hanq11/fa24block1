package com.example.helloworldsd19202.buoi6.service;

import com.example.helloworldsd19202.buoi6.model.NgheSi;

import java.util.ArrayList;

public class NgheSiService {
    ArrayList<NgheSi> danhSach = new ArrayList<>();

    public NgheSiService() {
        danhSach.add(new NgheSi(1, "A", 4.4f, true));
        danhSach.add(new NgheSi(2, "B", 5.4f, false));
        danhSach.add(new NgheSi(3, "C", 6.4f, true));
    }

    public ArrayList<NgheSi> getAll() {
        return danhSach;
    }

    public NgheSi findNgheSiById(int id) {
        for(NgheSi ngheSi: danhSach) {
            if(ngheSi.getId() == id) {
                return ngheSi;
            }
        }
        return null;
    }

    public void addNgheSi(NgheSi ngheSi) {
        danhSach.add(ngheSi);
    }

    public void updateNgheSi(NgheSi ngheSi) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == ngheSi.getId()){
                danhSach.set(i, ngheSi);
            }
        }
    }

    public void deleteNgheSi(int id) {
        NgheSi ngheSi = this.findNgheSiById(id);
        danhSach.remove(ngheSi);
    }
}
