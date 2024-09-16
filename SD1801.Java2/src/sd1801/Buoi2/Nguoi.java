/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi2;

import sd1801.Buoi1.*;

/**
 *
 * @author syn
 */
public class Nguoi {
    private String ten;
    private int tuoi;

    // Constructor khong tham so
    public Nguoi() {
    }
    // Constructor co tham so
    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    // Getter
    public String getTen() {
        return ten;
    }
    // Setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
}
