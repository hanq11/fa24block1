/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi11.repository;
import java.sql.*;
import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi11.model.DongVat;
import mob1024.pkg01kieumai.buoi11.util.DbConnection;
/**
 *
 * @author syn
 */
public class DongVatRepository {
    private Connection conn = null;
    
    public DongVatRepository() {
        conn = DbConnection.getConnection();
    }
    
    public ArrayList<DongVat> getAll() {
        String sql = "SELECT * FROM dong_vat";
        ArrayList<DongVat> danhSach = new ArrayList<>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                danhSach.add(new DongVat(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getBoolean(4)
                ));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
    
    public void themDongVat(DongVat dv) {
        String sql = """
                     INSERT INTO dong_vat (ten, can_nang, quy_hiem)
                     VALUES (?, ?, ?);
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, dv.getTen());
            ps.setFloat(2, dv.getCanNang());
            ps.setBoolean(3, dv.isQuyHiem());
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void suaDongVat(DongVat dv) {
        String sql = """
                     UPDATE dong_vat
                     SET ten = ?, can_nang = ?, quy_hiem = ?
                     WHERE id = ?;
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, dv.getTen());
            ps.setFloat(2, dv.getCanNang());
            ps.setBoolean(3, dv.isQuyHiem());
            ps.setInt(4, dv.getId());
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void xoaDongVat(int id) {
        String sql = "DELETE FROM dong_vat WHERE id = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
