package toko.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import toko.DAOImplement.Implement_Login;
import toko.Koneksi.Koneksi_Member;
import toko.Model.Model_Login;


public class DAO_Login implements Implement_Login {

    Connection connection;
  
    public DAO_Login() {
        connection = Koneksi_Member.connection(); 
    }

    public boolean cekLogin(String username, String password) {
    String sql = "SELECT * FROM login WHERE username=? AND password=?";
    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();
        return rs.next(); 
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    public void registrasi(Model_Login login){
        try{
            String sql = "INSERT INTO login (username, password)VALUES(?,?);";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, login.getUser());
            pst.setString(2, login.getPass());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrasi Sukses");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Registrasi Gagal");
        }
    }

}
