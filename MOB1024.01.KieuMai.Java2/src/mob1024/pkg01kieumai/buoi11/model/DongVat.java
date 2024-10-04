/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi11.model;

/**
 *
 * @author syn
 */
public class DongVat {
    private int id;
    private String ten;
    private float canNang;
    private boolean quyHiem;

    public DongVat() {
    }

    public DongVat(int id, String ten, float canNang, boolean quyHiem) {
        this.id = id;
        this.ten = ten;
        this.canNang = canNang;
        this.quyHiem = quyHiem;
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

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public boolean isQuyHiem() {
        return quyHiem;
    }

    public void setQuyHiem(boolean quyHiem) {
        this.quyHiem = quyHiem;
    }
    
    
}
