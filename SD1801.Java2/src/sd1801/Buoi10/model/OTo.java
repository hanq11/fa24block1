/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi10.model;

/**
 *
 * @author syn
 */
public class OTo {
    private int id;
    private String ten;
    private String hang;
    private float gia;
    private boolean muiTran;

    public OTo() {
    }

    public OTo(int id, String ten, String hang, float gia, boolean muiTran) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.muiTran = muiTran;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public boolean isMuiTran() {
        return muiTran;
    }

    public void setMuiTran(boolean muiTran) {
        this.muiTran = muiTran;
    }
    
    
}
