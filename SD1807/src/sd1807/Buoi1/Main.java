/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi1;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vui long nhap ten: ");
        String ten = sc.nextLine();
        
        System.out.print("Vui long nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        
        System.out.print("Vui long nhap ma hoc sinh: ");
        String ma = sc.nextLine();
        
        System.out.print("Vui long nhap diem: ");
        double diem = Double.valueOf(sc.nextLine());
        
        //sout
        // Cach 1
//        HocSinh hs = new HocSinh();
//        hs.setTen(ten);
//        hs.setTuoi(tuoi);
//        hs.setMa(ma);
//        hs.setDiem(diem);
//        hs.hienThi();
        // Cach 2
        HocSinh hs = new HocSinh(ten, tuoi, ma, diem);
        hs.hienThi();
    }
}
