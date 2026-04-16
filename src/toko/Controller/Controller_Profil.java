/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko.Controller;

import toko.DAO.DAO_Profil;
import toko.Model.Model_Profil;

/**
 *
 * @author Pongo
 */
public class Controller_Profil {
    DAO_Profil daoProfil;

    public Controller_Profil() {
        daoProfil = new DAO_Profil();
    }
    public void profil(int idLog, String username, String password){
        Model_Profil model = new Model_Profil(idLog, username, password);
        daoProfil.update(model);
    }
    public Model_Profil getProfilById(int idLog) {
        return daoProfil.getById(idLog);
    }

}
