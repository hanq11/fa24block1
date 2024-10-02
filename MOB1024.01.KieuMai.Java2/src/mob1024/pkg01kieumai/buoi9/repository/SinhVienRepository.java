/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi9.repository;
import com.microsoft.sqlserver.jdbc.SQLServerStatementColumnEncryptionSetting;
import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi9.model.SinhVien;
import mob1024.pkg01kieumai.buoi9.utils.DbConnection;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author syn
 */
public class SinhVienRepository {
    private Connection conn = null;
    
    public SinhVienRepository() {
        conn = DbConnection.getConnection();
    }
    
    public ArrayList<SinhVien> getAll() {
        String sql = "SELECT * FROM sinh_vien";
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                danhSach.add(new SinhVien(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getBoolean(5)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
    
    public void themSinhVien(SinhVien sv) {
        String sql = """
                     INSERT INTO Sinh_Vien(ten, tuoi, diem, gioi_tinh)
                        VALUES (?, ?, ?, ?)
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, sv.getTen());
            ps.setInt(2, sv.getTuoi());
            ps.setFloat(3, sv.getDiem());
            ps.setBoolean(4, sv.isGioiTinh());
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void suaSinhVien(SinhVien sv) {
        String sql = """
                      UPDATE sinh_vien
                      SET ten = ?, tuoi = ?, diem = ?, gioi_tinh = ?
                      WHERE id = ?
                      """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, sv.getTen());
            ps.setInt(2, sv.getTuoi());
            ps.setFloat(3, sv.getDiem());
            ps.setBoolean(4, sv.isGioiTinh());
            ps.setInt(5, sv.getId());
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void xoaSinhVien(int id) {
        String sql = "DELETE FROM Sinh_Vien WHERE id = ?";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
