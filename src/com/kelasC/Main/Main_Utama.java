/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kelasC.Main;

import com.kelasC.Jpanel.ContenHome;
import com.kelasC.Jpanel.FormInputPengiriman;
import com.kelasC.Jpanel.Form_destinasi;
import com.kelasC.Jpanel.Form_kurir;
import com.kelasC.Jpanel.Laporan;
import com.kelasC.Jpanel.dikirim;
import com.kelasC.Login.form_login;
import com.kelasC.Widget.Menu_Item;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author teguh
 */
public class Main_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Main_Utama
     */
    public Main_Utama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PN_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PN_Content = new javax.swing.JPanel();
        mainpn = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        main_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PN_sidebar.setBackground(new java.awt.Color(43, 101, 252));
        PN_sidebar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), null, null));
        PN_sidebar.setPreferredSize(new java.awt.Dimension(250, 377));

        menus.setBackground(new java.awt.Color(43, 101, 252));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelasC/assets/image/Worldwide Delivery.png"))); // NOI18N
        jLabel1.setText(" LOGISTIK");

        javax.swing.GroupLayout PN_sidebarLayout = new javax.swing.GroupLayout(PN_sidebar);
        PN_sidebar.setLayout(PN_sidebarLayout);
        PN_sidebarLayout.setHorizontalGroup(
            PN_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_sidebarLayout.setVerticalGroup(
            PN_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_sidebarLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PN_sidebar, java.awt.BorderLayout.LINE_START);

        PN_Content.setBackground(new java.awt.Color(255, 255, 255));
        PN_Content.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));

        mainpn.setLayout(new java.awt.BorderLayout());

        main_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_utamaLayout = new javax.swing.GroupLayout(pn_utama);
        pn_utama.setLayout(pn_utamaLayout);
        pn_utamaLayout.setHorizontalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_utamaLayout.setVerticalGroup(
            pn_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainpn.add(pn_utama, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout PN_ContentLayout = new javax.swing.GroupLayout(PN_Content);
        PN_Content.setLayout(PN_ContentLayout);
        PN_ContentLayout.setHorizontalGroup(
            PN_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_ContentLayout.setVerticalGroup(
            PN_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(PN_Content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        main_panel.removeAll();
        main_panel.add(new ContenHome());
        main_panel.repaint();
        main_panel.revalidate();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PN_Content;
    private javax.swing.JPanel PN_sidebar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel mainpn;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Home.png"));
        ImageIcon iconKurir = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Delivery Boy.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Logout.png"));
        ImageIcon iconPengiriman = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Courier Lorry.png"));
        ImageIcon iconTambah = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Add properties.png"));
        ImageIcon iconTambahKar = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Badge.png"));
        ImageIcon iconTambahDes = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Map Marker.png"));
        ImageIcon iconDelivery = new ImageIcon(getClass().getResource("/com/kelasC/assets/image/delivery.png"));
        
        Menu_Item subtambah = new Menu_Item(null,true,iconTambah, "Input Pengiriman", (ActionEvent e) -> {
            main_panel.removeAll();
            main_panel.add(new FormInputPengiriman());
           main_panel.repaint();
            main_panel.revalidate();
        });
        
        Menu_Item subTambahDes = new Menu_Item(null,true,iconTambahDes, "Tambah Destinasi", (ActionEvent e) -> {
            main_panel.removeAll();
           main_panel.add(new Form_destinasi());
            main_panel.repaint();
            main_panel.revalidate();
        });
        Menu_Item subkaryawan = new Menu_Item(null,true,iconTambahKar, "Tambah Karyawan", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main_panel.removeAll();
                main_panel.add(new Form_kurir());
                main_panel.repaint();
                main_panel.revalidate();                                     
            }
        });
        Menu_Item subdelivery = new Menu_Item(null,true,iconDelivery, "Delivery", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main_panel.removeAll();
                main_panel.add(new dikirim());
                main_panel.repaint();
                main_panel.revalidate();                                     
            }
        });
        
        Menu_Item menuHome = new Menu_Item(iconHome,false,null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main_panel.removeAll();
                main_panel.add(new ContenHome());
                main_panel.repaint();
                main_panel.revalidate();
            }
        });
        Menu_Item menuPengiriman = new Menu_Item(iconPengiriman,false,null, "Pengiriman", null,subtambah,subTambahDes);
        Menu_Item menuKurir = new Menu_Item(iconKurir,false,null, "Kurir", null,subkaryawan,subdelivery);
        Menu_Item menuLogout = new Menu_Item(iconLogout,false,null, "Log Out", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form_login login = new form_login();
                login.setVisible(true);
                login.revalidate();
                dispose();
            }
        });
        addMenu(menuHome,menuPengiriman,menuKurir,menuLogout);
    }
    private void addMenu(Menu_Item... menu){
        for(int i = 0; i < menu.length; i++){
            menus.add(menu[i]);
            ArrayList<Menu_Item> subMenu =menu[i].getSubMenu();
            for(Menu_Item n : subMenu){
                addMenu(n);
            }
                    
        }
        menus.revalidate();
    }
}
