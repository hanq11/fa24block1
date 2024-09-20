/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi6.model;

/**
 *
 * @author syn
 */
public class NgheSi {
    private int id;
    private String ten;
    private float luong;

    public NgheSi() {
    }

    public NgheSi(int id, String ten, float luong) {
        this.id = id;
        this.ten = ten;
        this.luong = luong;
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

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
}
