/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package toko.DAOImplement;

import toko.Model.Model_Login;

/**
 *
 * @author Pongo
 */
public interface Implement_Login {
    public boolean cekLogin(String username, String password);
    void registrasi(Model_Login login);
}
