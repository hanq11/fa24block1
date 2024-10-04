/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi11.DemoDocGhi;

import java.io.Serializable;

/**
 *
 * @author syn
 */
public class DongVat implements Serializable {
    private int id;
    private String ten;
    private boolean bietBoi;
    private float canNang;

    public DongVat() {
    }

    public DongVat(int id, String ten, boolean bietBoi, float canNang) {
        this.id = id;
        this.ten = ten;
        this.bietBoi = bietBoi;
        this.canNang = canNang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isBietBoi() {
        return bietBoi;
    }

    public void setBietBoi(boolean bietBoi) {
        this.bietBoi = bietBoi;
    }

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }
    
    
}
