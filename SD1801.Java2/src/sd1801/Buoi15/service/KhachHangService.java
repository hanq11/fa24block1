/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi15.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import sd1801.Buoi15.model.KhachHang;

/**
 *
 * @author syn
 */
public class KhachHangService {
    ArrayList<KhachHang> danhSach = new ArrayList<>();
    
    public KhachHangService() {
        danhSach.add(new KhachHang("KH01", "N V A", "Nam", 2000, "Khach Thuong"));
        danhSach.add(new KhachHang("KH02", "N V B", "Nu", 2000, "VIP"));
        danhSach.add(new KhachHang("KH03", "N V C", "Nam", 2000, "VVIP"));
    }
    
    public ArrayList<KhachHang> getAll() {
        return danhSach;
    }
    
    public void suaKhachHang(KhachHang khachHang) {
        for(int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getMaKhachHang().equals(khachHang.getMaKhachHang())) {
                danhSach.set(i, khachHang);
            }
        }
    }
    
    public void docFile() {
        File file = new File("file.txt");
        try {
            if(!file.exists()) {
                System.out.println("file khong ton tai");
            }
            danhSach.clear();
            try(FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while(fis.available() > 0) {
                    danhSach.add((KhachHang) ois.readObject());
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ghiFile() {
        File file = new File("file.txt");
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            try(FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for(KhachHang kh: danhSach) {
                    oos.writeObject(kh);
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
