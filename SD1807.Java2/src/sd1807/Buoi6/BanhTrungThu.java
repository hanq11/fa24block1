/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi6;

/**
 *
 * @author Syn
 */
public class BanhTrungThu {
    private int id;
    private String ten;
    private float gia;
    private String nhanBanh;

    public BanhTrungThu() {
    }

    public BanhTrungThu(int id, String ten, float gia, String nhanBanh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.nhanBanh = nhanBanh;
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

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getNhanBanh() {
        return nhanBanh;
    }

    public void setNhanBanh(String nhanBanh) {
        this.nhanBanh = nhanBanh;
    }
    
    
}
