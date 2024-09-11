/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi1;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        
        System.out.print("Vui long nhap tuoi: ");
        int tuoi = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Vui long nhap ma: ");
        String ma = scanner.nextLine();
        
        System.out.print("Vui long nhap diem: ");
        double diem = scanner.nextDouble();
        
        HocSinh hs = new HocSinh(ma, diem, ten, tuoi);
        hs.hienThi();
    }
}
