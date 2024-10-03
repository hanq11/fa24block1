/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi11.model;

/**
 *
 * @author syn
 */
public class DienThoai {
    private int id;
    private String ten;
    private String hang;
    private float gia;
    private boolean kheSim;

    public DienThoai() {
    }

    public DienThoai(int id, String ten, String hang, float gia, boolean kheSim) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.kheSim = kheSim;
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

    public boolean isKheSim() {
        return kheSim;
    }

    public void setKheSim(boolean kheSim) {
        this.kheSim = kheSim;
    }
    
    
}
