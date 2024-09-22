/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi5;

/**
 *
 * @author Syn
 */
public class BanhTrungThu {
    private int id;
    private String ten;
    private float gia;
    private String loaiNhan;

    public BanhTrungThu() {
    }

    public BanhTrungThu(int id, String ten, float gia, String loaiNhan) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.loaiNhan = loaiNhan;
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

    public String getLoaiNhan() {
        return loaiNhan;
    }

    public void setLoaiNhan(String loaiNhan) {
        this.loaiNhan = loaiNhan;
    }
    
    
}
