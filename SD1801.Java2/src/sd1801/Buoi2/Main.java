/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi2;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. nhập thông tin học sinh");
        System.out.println("2. in tất cả thông tin học sinh");
        System.out.println("3. xoá học sinh theo tên");
        System.out.println("4. sửa học sinh theo tên");
        System.out.println("5. sắp xếp học sinh theo ten tang dan");
        System.out.println("6. sắp xếp học sinh theo diem giam dan");
        System.out.println("7. Thoat");
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLyHocSinh qlhs = new QuanLyHocSinh();
        while(true) {
            System.out.print("Vui long nhap lua chon: ");
            luaChon = Integer.valueOf(scanner.nextLine());
            switch(luaChon) {
                case 1: {
                    qlhs.nhapThongTin();
                    break;
                }
                case 2: {
                    qlhs.inThongTin();
                    break;
                }
                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}
