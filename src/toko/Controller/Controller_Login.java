package toko.Controller;

import javax.swing.JOptionPane;
import toko.DAO.DAO_Login;
import toko.Model.Model_Login;
import toko.View.View_Member;

public class Controller_Login {

    DAO_Login daoLogin;

    public Controller_Login() {
        daoLogin = new DAO_Login();
    }

    public void login(String username, String password) {
        boolean isValid = daoLogin.cekLogin(username, password);

        if (isValid) {
            JOptionPane.showMessageDialog(null, "Login berhasil!");
            new View_Member().setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Login gagal! Username atau password salah.");
        }
    }
    public boolean dologin(String username, String password){
        return daoLogin.cekLogin(username, password);
    }
    public void registrasi(String username, String password){
        Model_Login model = new Model_Login(username,password);
        daoLogin.registrasi(model);
    }
}