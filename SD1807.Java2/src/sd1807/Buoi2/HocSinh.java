/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi2;

import sd1807.Buoi2.*;

/**
 *
 * @author Syn
 */
public class HocSinh extends Nguoi {
    private String mssv;
    private double diem;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi, String mssv, double diem) {
        super(ten, tuoi);
        this.mssv = mssv;
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    
    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public void hienThi() {
        System.out.println(super.getTen() + " - " + super.getTuoi() + " - " + this.mssv + " - " + this.diem);
    }
}
