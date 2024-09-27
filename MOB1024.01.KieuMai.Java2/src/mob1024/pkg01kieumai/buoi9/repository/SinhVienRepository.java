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
}
