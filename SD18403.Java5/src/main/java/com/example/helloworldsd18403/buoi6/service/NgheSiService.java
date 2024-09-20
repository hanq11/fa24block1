package com.example.helloworldsd18403.buoi6.service;

import com.example.helloworldsd18403.buoi6.model.NgheSi;

import java.util.ArrayList;

public class NgheSiService {
    ArrayList<NgheSi> danhSach = new ArrayList<>();

    public NgheSiService() {
        danhSach.add(new NgheSi(1, "A", 1.1f, true));
        danhSach.add(new NgheSi(2, "B", 1.1f, false));
        danhSach.add(new NgheSi(3, "C", 1.1f, true));
    }

    public ArrayList<NgheSi> getAll() {
        return danhSach;
    }

    public NgheSi getById(int id) {
        NgheSi ngheSi = null;
        for(NgheSi ns: danhSach) {
            if(ns.getId() == id) {
                ngheSi = ns;
            }
        }
        return ngheSi;
    }

    public void add(NgheSi ns) {
        danhSach.add(ns);
    }

    public void update(NgheSi ngheSi) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == ngheSi.getId()) {
                danhSach.set(i, ngheSi);
            }
        }
    }

    public void delete(int id) {
        NgheSi ngheSi = this.getById(id);
        if(ngheSi != null) {
            danhSach.remove(ngheSi);
        }
    }
}
