/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author syn
 */
public class QuanLyHocSinh {
    Scanner scanner = new Scanner(System.in);
    ArrayList<HocSinh> danhSach = new ArrayList<>();
    
    // method:  nhập thông tin học sinh, sau mỗi lần nhập
    // thêm học sinh vừa nhập vào trong ArrayList
    public void nhapThongTin() {
        System.out.print("Vui long nhap ten: ");
        String ten = scanner.nextLine();
        
        System.out.print("Vui long nhap tuoi: ");
        int tuoi = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Vui long nhap ma: ");
        String ma = scanner.nextLine();
        
        System.out.print("Vui long nhap diem: ");
        double diem = Double.valueOf(scanner.nextLine());
        danhSach.add(new HocSinh(ma, diem, ten, tuoi));
    }
    // method: in tất cả thông tin học sinh trong danh sách ra màn hình
    public void inThongTin() {
        //danhSach.forEach(hs -> hs.hienThi());
        for(int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).hienThi();
        }
    }
    // method: xoá học sinh theo tên
    public void xoa() {
        System.out.print("Vui long nhap ten can xoa: ");
        String ten = scanner.nextLine();
        ArrayList<HocSinh> danhSachCanXoa = new ArrayList<>();
//        danhSach.forEach(hs -> {
//            if(hs.getTen().equals(ten)) {
//                danhSachCanXoa.add(hs);
//            }
//        });
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getTen().equals(ten)) {
                danhSachCanXoa.add(danhSach.get(i));
            }
        }
        danhSach.removeAll(danhSachCanXoa);
    }
    // method: sửa học sinh theo tên
    public void suaHocSinh() {
        System.out.println("Vui long nhap ten can sua: ");
        String tenCanSua = scanner.nextLine();
        for(HocSinh hs: danhSach) {
            if(hs.getTen().equals(tenCanSua)) {
                System.out.print("Vui long nhap tuoi moi: ");
                hs.setTuoi(Integer.valueOf(scanner.nextLine()));

                System.out.print("Vui long nhap ma moi: ");
                hs.setMa(scanner.nextLine());

                System.out.print("Vui long nhap diem moi: ");
                hs.setDiem(Double.valueOf(scanner.nextLine()));
            }
        }
    }
    // method: sắp xếp học sinh theo tên tăng dần
    public void sapXepTheoTen() {
        danhSach.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }
    // method: sắp xếp học sinh theo điểm giảm dần
    public void sapXepTheoDiem() {
        danhSach.sort((o1, o2) -> {
            return Double.compare(o2.getDiem(), o1.getDiem());
        });
    }
}
