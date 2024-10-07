/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi13.repository;
import java.sql.*;
import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi13.model.MayTinh;
import mob1024.pkg01kieumai.buoi13.util.DbConnection;
/**
 *
 * @author syn
 */
public class MayTinhRepository {
    private Connection conn = null;
    
    public MayTinhRepository() {
        conn = DbConnection.getConnection();
    }
    
    public ArrayList<MayTinh> getAll() {
        String sql = "SELECT * FROM MayTinh";
        ArrayList<MayTinh> danhSach = new ArrayList<>();
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                danhSach.add(new MayTinh(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getInt(5)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
    
    public void them(MayTinh mayTinh) {
        String sql = """
                     INSERT INTO MayTinh
                     VALUES (?, ?, ?, ?);
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, mayTinh.getTen());
            ps.setString(2, mayTinh.getNgayTao());
            ps.setFloat(3, mayTinh.getGia());
            ps.setInt(4, mayTinh.getTrangThai());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void sua(MayTinh mayTinh) {
        String sql = """
                     UPDATE MayTinh
                     SET ten = ?, ngay_tao = ?, gia = ?, trang_thai = ?
                     WHERE id = ?
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, mayTinh.getTen());
            ps.setString(2, mayTinh.getNgayTao());
            ps.setFloat(3, mayTinh.getGia());
            ps.setInt(4, mayTinh.getTrangThai());
            ps.setInt(5, mayTinh.getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void xoa(int id) {
        String sql = """
                     DELETE FROM MayTinh WHERE id = ?
                     """;
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
