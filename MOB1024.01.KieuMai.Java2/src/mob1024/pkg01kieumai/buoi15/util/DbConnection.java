/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1024.pkg01kieumai.buoi15.util;

import mob1024.pkg01kieumai.buoi13.util.*;
import java.sql.*;

/**
 *
 * @author syn
 */
public class DbConnection {
private static Connection conn;
    
    public static Connection getConnection()
    {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456a@",
                    dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=PTPM_FINALLY_JAVA_MOB1024;encrypt=true;trustServerCertificate=true;";
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(DbConnection.getConnection().toString());
    }
}
