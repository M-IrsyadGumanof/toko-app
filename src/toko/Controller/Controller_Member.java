/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toko.Controller;

import javax.swing.JOptionPane;
import toko.DAO.DAO_Member;
import toko.DAOImplement.Implement_Member;
import toko.Model.Model_Member;
import toko.Model.Tabel_Model_Member;
import toko.View.View_Member;

/**
 *
 * @author Pongo
 */
public class Controller_Member {
    View_Member frame_member;
    Implement_Member implement_member;
    java.util.List<Model_Member> list_member;
    
    public Controller_Member(View_Member frame_member){
        this.frame_member = frame_member;
        implement_member = new DAO_Member();
        list_member = implement_member.getALL();
    }
    
    //tombol reset
    public void reset(){
        String selectedPaket = frame_member.getTxtPaket().getSelectedItem().toString();
        if (selectedPaket.equals("===Pilih Paket Member===")) {
            JOptionPane.showMessageDialog(null, "Silakan pilih paket member");
            return;
        }
        Model_Member b = new Model_Member();
        b.setNama(frame_member.getTxtNama().getText());
        b.setNo_telp(frame_member.getTxtTelp().getText());
        b.setAlamat(frame_member.getTxtAlamat().getText());
        b.setPaket(selectedPaket);
    }
    
    //Tampil data ke Table
    public void isiTable(){
        list_member = implement_member.getALL();
        Tabel_Model_Member tmb = new Tabel_Model_Member(list_member);
        frame_member.getTblDataMember().setModel(tmb);
    }
    
    //Menampilkan data ke Form
    public void isiField(int row){
        frame_member.getTxtIDKode().setText(String.valueOf(list_member.get(row).getId()));
        frame_member.getTxtNama().setText(list_member.get(row).getNama());
        frame_member.getTxtTelp().setText(list_member.get(row).getNo_telp());
        frame_member.getTxtAlamat().setText(list_member.get(row).getAlamat());
        frame_member.getTxtPaket().setSelectedItem(list_member.get(row).getPaket());
    }
    
    //Insert data
    public void insert(){
        if(!frame_member.getTxtNama().getText().trim().isEmpty()&&!frame_member.getTxtTelp().getText().trim().isEmpty()&&!frame_member.getTxtAlamat().getText().trim().isEmpty()){
            Model_Member b = new Model_Member();
            b.setNama(frame_member.getTxtNama().getText());
            b.setNo_telp(frame_member.getTxtTelp().getText());
            b.setAlamat(frame_member.getTxtAlamat().getText());
            b.setPaket(frame_member.getTxtPaket().getSelectedItem().toString());
            
            implement_member.insert(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        } 
    }
    
    //update data
    public void update(){
        if(!frame_member.getTxtIDKode().getText().trim().isEmpty()){
            Model_Member b = new Model_Member();
            b.setNama(frame_member.getTxtNama().getText());
            b.setNo_telp(frame_member.getTxtTelp().getText());
            b.setAlamat(frame_member.getTxtAlamat().getText());
            b.setPaket(frame_member.getTxtPaket().getSelectedItem().toString());
            b.setId(Integer.parseInt(frame_member.getTxtIDKode().getText()));
            
            implement_member.update(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Yang Mau Diedit");
        } 
        
    }
    
    //delete data
    public void delete(){
        if(!frame_member.getTxtIDKode().getText().trim().isEmpty()){
            int id = Integer.parseInt(frame_member.getTxtIDKode().getText());
            implement_member.delete(id);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Yang Mau Dihapus");
        } 
    }
    
    //cari data
    public void isiTableCariNama(){
        list_member = implement_member.getCariNama(frame_member.getTxtCari().getText());
        Tabel_Model_Member tmb = new Tabel_Model_Member(list_member);
        frame_member.getTblDataMember().setModel(tmb);
    }
    
    public void carinama(){
        if(!frame_member.getTxtCari().getText().trim().isEmpty()){
            implement_member.getCariNama(frame_member.getTxtCari().getText());
            isiTableCariNama();
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Yang Mau Dicari");
        }
    }
}
