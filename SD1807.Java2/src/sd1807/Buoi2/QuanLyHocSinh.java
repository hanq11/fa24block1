/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Syn
 */
public class QuanLyHocSinh {
    ArrayList<HocSinh> danhSach = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void themHocSinh() {
        System.out.print("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Vui long nhap tuoi: ");
        int tuoi = Integer.valueOf(scanner.nextLine());
        System.out.print("Vui long nhap mssv: ");
        String mssv = scanner.nextLine();
        System.out.print("Vui long nhap diem: ");
        double diem = Double.valueOf(scanner.nextLine());
        HocSinh hs = new HocSinh(ten, tuoi, mssv, diem);
        danhSach.add(hs);
    }
            
    public void inDanhSach() {
        for(int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).hienThi();
        }
    }
}
