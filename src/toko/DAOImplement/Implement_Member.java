/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package toko.DAOImplement;

import java.awt.List;
import toko.Model.Model_Member;

/**
 *
 * @author Pongo
 */
public interface Implement_Member {
    public void insert(Model_Member b);
    public void update(Model_Member b);
    public void delete(int id);
    
    public java.util.List<Model_Member> getALL();
    public java.util.List<Model_Member> getCariNama(String Nama);
}
