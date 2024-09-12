/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi2;

import java.util.Scanner;

/**
 *
 * @author Syn
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Nhap hoc sinh");
        System.out.println("2. In thong tin");
        System.out.println("3. Thoat");
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLyHocSinh qlhs = new QuanLyHocSinh();
        while(true) {
            System.out.print("Vui long nhap lua chon: ");
            luaChon = Integer.valueOf(scanner.nextLine());
            switch(luaChon) {
                case 1: {
                    qlhs.themHocSinh();
                    break;
                }
                case 2: {
                    qlhs.inDanhSach();
                    break;
                }
                case 3: {
                    System.exit(0);
                }
            }
        }
    }
}
