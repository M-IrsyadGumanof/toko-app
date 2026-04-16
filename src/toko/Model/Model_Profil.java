/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko.Model;

/**
 *
 * @author Pongo
 */
public class Model_Profil {
    private String user;
    private String pass;
    private int idLog;
     
    public Model_Profil(int idLog, String user, String pass){
        this.idLog = idLog;
        this.user = user;
        this.pass = pass;
    }

    public String getUser() { return user; }
    public String getPass() { return pass; }
    public void setIdLog(int idLog) { this.idLog = idLog; }

    public int getIdLog() {
        return idLog;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }
}
