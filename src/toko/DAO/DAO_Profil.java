package toko.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import toko.DAOImplement.Implement_Profil;
import toko.Koneksi.Koneksi_Member_Lama;
import toko.Model.Model_Profil;


public class DAO_Profil implements Implement_Profil {

    public void update(Model_Profil profil) {
        try {
            String sql = "UPDATE login SET username = ?, password = ? WHERE id = ?;";
            PreparedStatement pst = Koneksi_Member_Lama.connection().prepareStatement(sql);
            pst.setString(1, profil.getUser());
            pst.setString(2, profil.getPass());
            pst.setInt(3, profil.getIdLog());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Profil Sukses Diubah");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah profil: " + e.getMessage());
        }
    }
    @Override
    public Model_Profil getById(int id) {
        Model_Profil profil = null;
        try {
            String sql = "SELECT * FROM login WHERE id = ?";
            PreparedStatement pst = Koneksi_Member_Lama.connection().prepareStatement(sql);
            pst.setInt(1, id);
            var rs = pst.executeQuery();
            if (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                profil = new Model_Profil(id, username, password);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data profil: " + e.getMessage());
        }
        return profil;
    }
}
