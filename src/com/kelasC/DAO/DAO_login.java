/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelasC.DAO;

import com.kelasC.Login.form_login;
import com.kelasC.Main.Main_Utama;
import com.kelasC.koneksi.koneksi;
import com.kelasC.model.model_login;
import com.kelasC.service.service_login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author teguh
 */
public class DAO_login implements service_login{
    
    private  Connection kon;
  
    public DAO_login(){
        kon = koneksi.konek();
    }

    @Override
    public void prosesLogin(model_login model_lg) {
        try {
            PreparedStatement at = null;
            ResultSet rs = null;
            String id = null;
            String nama = null;
            String level2 = null;
            
            String sql = "SELECT * FROM login WHERE(id_login='"+model_lg.getId_login()+"'OR username='"+model_lg.getUsername()+"')AND password='"+model_lg.getPassword()+"'";
            
            try {
                at = kon.prepareStatement(sql);
                rs = at.executeQuery();
                if (rs.next()) {
                    id = rs.getString("id_login");
                    nama = rs.getString("nama_pengguna");
                    level2 = rs.getString("lv");
                    Main_Utama home = new Main_Utama();
                    home.setVisible(true);
                    home.revalidate();
                    form_login lg = new form_login();
                    lg.tutup = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Username dan Password salah","Pesan",JOptionPane.INFORMATION_MESSAGE);
                    form_login lg = new form_login();
                    lg.tutup = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
            }finally{
                if(at !=null){
                    try {
                        at.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
                    }
                }
            }
            
        } catch (ExceptionInInitializerError ex) {
            Logger.getLogger(DAO_login.class.getName()).log(Level.SEVERE, null,ex);
        }
      
    }
    
}
