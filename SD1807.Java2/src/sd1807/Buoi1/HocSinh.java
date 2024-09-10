/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi1;

/**
 *
 * @author syn
 */
public class HocSinh extends Nguoi {
    private String ma;
    private double diem;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi, String ma, double diem) {
        super(ten, tuoi);
        this.ma = ma;
        this.diem = diem;
    }
    
    public void hienThi() {
        System.out.println(super.getTen() + " - " 
                + super.getTuoi() + " - " 
                + this.ma + " - " 
                + this.diem);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }    
    
}
