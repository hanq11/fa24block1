/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi3;

import java.util.Scanner;

/**
 *
 * @author syn
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Nhập thông tin ca sĩ, với mỗi lần nhập, thêm 1 ca sĩ mới vào ArrayList");
        System.out.println("2. In danh sách tất cả các ca sĩ");
        System.out.println("3. Xoá ca sĩ theo tên");
        System.out.println("4. Sắp xếp ca sĩ theo tên tăng dần");
        System.out.println("5. Sắp xếp ca sĩ theo lương giảm dần");
        System.out.println("6. Sửa thông tin ca sĩ theo Ten");
        System.out.println("7. Tìm kiếm thông tin ca sĩ theo Ten");
        System.out.println("8. Thoat");
        QuanLyCaSi qlcs = new QuanLyCaSi();
        Scanner scanner = new Scanner(System.in); 
        int luaChon = 0;
        while(true) {
            System.out.print("Vui long nhap lua chon: ");
            luaChon = Integer.valueOf(scanner.nextLine());
            switch(luaChon) {
                case 1: {
                    qlcs.nhapThongTin();
                    break;
                }
                case 2: {
                    qlcs.inThongTin();
                        break;	
                }
                case 3: {
                    qlcs.xoaCaSi();
                        break;	
                }
                case 4: {
                    qlcs.sapXepTheoTenTangDan();
                        break;	
                }
                case 5: {
                    qlcs.sapXepTheoLuongGiamDan();
                        break;	
                }
                case 6: {
                    qlcs.suaTheoTen();
                        break;	
                }
                case 7: {
                    qlcs.timKiemTheoTen();
                        break;	
                }
                
                
            }
        }
    }
}
