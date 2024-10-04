/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1801.Buoi11.DemoDocGhi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author syn
 * 
 *  - Ghi - Output, Doc - Input
 *  - FileInputStream/FileOutputStream - Doc ghi file
 *  - DataInputStream/DataOutputStream - Doc ghi du lieu nguyen thuy
 *  - ObjectInputStream/ObjectOutputStream - Doc ghi object
 */
public class Main {
    public static void main(String[] args) {
        //ghiFile();
        docFile();
    }
    
    public static void ghiFile() {
        File file = new File("test.txt");
        ArrayList<DongVat> danhSach = new ArrayList<>();
        danhSach.add(new DongVat(1, "A", false, 4.5f));
        danhSach.add(new DongVat(2, "B", true, 7.5f));
        danhSach.add(new DongVat(3, "C", false, 4.5f));
        
        try {
           if(!file.exists()) {
            file.createNewFile();
           }
           try(FileOutputStream fos = new FileOutputStream(file);
                   ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                   for(DongVat dv: danhSach) {
                       oos.writeObject(dv);
                   }
           }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile() {
        File file = new File("test.txt");
        try {
            ArrayList<DongVat> danhSach = new ArrayList<>();
            DongVat dv = null;
            
            if(!file.exists()) {
                System.out.println("Khong tim thay file");
            }
            
            try(FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while(fis.available() > 0) {
                    dv = (DongVat) ois.readObject();
                    danhSach.add(dv);
                }
            }
            
            for(DongVat dongVat: danhSach) {
                System.out.println(dongVat.getTen() + " " + dongVat.getCanNang());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
