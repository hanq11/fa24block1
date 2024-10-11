/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi15.repository;
import com.microsoft.sqlserver.jdbc.SQLServerStatementColumnEncryptionSetting;
import java.sql.*;
import java.util.ArrayList;
import mob1024.pkg01kieumai.buoi15.model.SinhVien;
import mob1024.pkg01kieumai.buoi15.util.DbConnection;
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
        String sql = "SELECT Ma, Ten, GioiTinh, Tuoi FROM SinhVien";
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                danhSach.add(new SinhVien(
                       rs.getString(1),
                       rs.getString(2),
                       rs.getBoolean(3),
                       rs.getInt(4)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
}
