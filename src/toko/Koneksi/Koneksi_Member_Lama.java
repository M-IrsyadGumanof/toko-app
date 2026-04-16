/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko.Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection; 
import java.sql.SQLException;


/**
 *
 * @author Pongo
 */
public class Koneksi_Member_Lama {
   static Connection con;
   public static Connection connection(){
       if(con==null){
           MysqlDataSource data = new MysqlDataSource();
           data.setServerName("localhost");
           data.setPortNumber(3306);
           data.setDatabaseName("toko");
           data.setUser("root");
           data.setPassword("");
           try{
               con = data.getConnection();
           }catch (SQLException ex){
               ex.printStackTrace();
           }
       }
       return con;
   }
}
