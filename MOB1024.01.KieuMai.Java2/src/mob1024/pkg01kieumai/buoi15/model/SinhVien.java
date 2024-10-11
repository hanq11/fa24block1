/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi15.model;

/**
 *
 * @author syn
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private boolean gioiTinh;
    private Integer tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, boolean gioiTinh, Integer tuoi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
    
    
}
