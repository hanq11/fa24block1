/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1807.Buoi3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author syn
 */
public class QuanLyCaSi {
    ArrayList<CaSi> danhSach = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void nhapThongTin() {
        System.out.println("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        System.out.println("Vui long nhap nam sinh: ");
        int namSinh = Integer.valueOf(scanner.nextLine());
        System.out.println("Vui long nhap luong: ");
        float luong = Float.valueOf(scanner.nextLine());
        CaSi caSi = new CaSi(ten, namSinh, luong);
        danhSach.add(caSi);
    }
    
    public void inThongTin() {
        danhSach.forEach(cs -> cs.hienThi());
    }
    
    public void xoaCaSi() {
        System.out.println("Nhap ten ca si can xoa: ");
        String ten = scanner.nextLine();
        ArrayList<CaSi> danhSachCanXoa = new ArrayList<>();
        danhSach.forEach(cs -> {
            if(cs.getTen().equals(ten)) {
                danhSachCanXoa.add(cs);
            }
        });
        danhSach.removeAll(danhSachCanXoa);
    }
    
    public void sapXepTheoTenTangDan() {
        danhSach.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }
    
    public void sapXepTheoLuongGiamDan() {
        danhSach.sort((o1, o2) -> {
            return Float.compare(o2.getLuong(), o1.getLuong());
        });
    }
    
    public void suaTheoTen() {
        System.out.println("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        
        System.out.println("Vui long nhap nam sinh: ");
        int namSinh = Integer.valueOf(scanner.nextLine());
        System.out.println("Vui long nhap luong: ");
        float luong = Float.valueOf(scanner.nextLine());
        CaSi caSi = new CaSi(ten, namSinh, luong);
        
        int indexCaSiCanTim = -1;
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getTen().equals(ten)) {
                indexCaSiCanTim = i;
            }
        }
        danhSach.set(indexCaSiCanTim, caSi);
    }
    
    public void timKiemTheoTen() {
        System.out.println("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        danhSach.forEach(cs -> {
            if(cs.getTen().equals(ten)) {
                cs.hienThi();
            }
        });
    }
}
