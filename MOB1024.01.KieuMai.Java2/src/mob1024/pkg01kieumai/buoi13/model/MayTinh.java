/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi13.model;

/**
 *
 * @author syn
 */
public class MayTinh {
    private int id;
    private String ten;
    private String ngayTao;
    private float gia;
    private int trangThai;

    public MayTinh(int id, String ten, String ngayTao, float gia, int trangThai) {
        this.id = id;
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public MayTinh() {
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
