/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi3;

/**
 *
 * @author syn
 */
public class CaSi {
    private String ten;
    private int namSinh;
    private float luong;

    public CaSi() {
    }

    public CaSi(String ten, int namSinh, float luong) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.luong = luong;
    }

    public void hienThi() {
        System.out.println("Ten: " + ten + "-" + namSinh + "-" + luong);
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
}
