/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Pongo
 */
public class Koneksi_Member {
   static Connection conn;
   public static Connection connection(){
       if(conn==null){
        try {
            // URL database
            String url = "jdbc:h2:file:D:/DataToko/dataMember;AUTO_SERVER=TRUE"; // Menyimpan file di home folder (default: testdb.mv.db)
            // atau gunakan lokasi absolut
            // String url = "jdbc:h2:C:/dataku/dbku";

            // Buat koneksi
            conn = DriverManager.getConnection(url, "sa", ""); // default user: sa, password: kosong

            System.out.println("Koneksi berhasil!");

            // Contoh menjalankan query
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS member (id INT AUTO_INCREMENT PRIMARY KEY, nama VARCHAR(50), no_telp VARCHAR(15), alamat VARCHAR(255), paket VARCHAR(25))";
            stmt.executeUpdate(sql);
            String sql1 = "CREATE TABLE IF NOT EXISTS login (idLog INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50), password VARCHAR(15))";
            stmt.executeUpdate(sql1);
            System.out.println("Tabel berhasil dibuat atau sudah ada.");

        } catch (SQLException e) {
            e.printStackTrace();
        }   
       }
       return conn;
   }
}
