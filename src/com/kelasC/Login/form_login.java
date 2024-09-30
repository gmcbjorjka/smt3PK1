
package com.kelasC.Login;
import com.kelasC.DAO.DAO_login;
import com.kelasC.model.model_login;
import com.kelasC.service.service_login;
import javax.swing.JOptionPane;

public class form_login extends javax.swing.JFrame {

    private service_login servis = new DAO_login();
    int xx,xy;
    public static boolean tutup = false;
    public form_login() {
        initComponents();
         btn_login.requestFocus();
    }
    void Bersih(){
        TF_username.setText("Username");
        TF_password.setText("Password");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_exit = new javax.swing.JLabel();
        Gb_Login = new javax.swing.JLabel();
        TF_username = new javax.swing.JTextField();
        TF_password = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelasC/assets/image/icon/Cancel.png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        getContentPane().add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        Gb_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelasC/assets/image/gambarlogin.png"))); // NOI18N
        getContentPane().add(Gb_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 530, 450));

        TF_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_username.setText("Username");
        TF_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        TF_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_usernameFocusLost(evt);
            }
        });
        TF_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(TF_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 310, 40));

        TF_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_password.setText("Password");
        TF_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        TF_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_passwordFocusLost(evt);
            }
        });
        TF_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(TF_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 40));

        btn_login.setBackground(new java.awt.Color(102, 153, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("Masuk");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x=xx,y=xy);
    }//GEN-LAST:event_formMouseDragged

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_exitMouseClicked

    private void TF_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_usernameActionPerformed
        // TODO add your handling code here:
        TF_password.requestFocus();
    }//GEN-LAST:event_TF_usernameActionPerformed

    private void TF_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_passwordActionPerformed
        // TODO add your handling code here:
        prosesLogin();
    }//GEN-LAST:event_TF_passwordActionPerformed

    private void TF_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_usernameFocusGained
        // TODO add your handling code here:
        String username = TF_username.getText();
        if(username.equals("Username")){
            TF_username.setText("");
        }
    }//GEN-LAST:event_TF_usernameFocusGained

    private void TF_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_passwordFocusGained
        String pass = TF_password.getText();
        if(pass.equals("Password")){
            TF_password.setText("");
        }
    }//GEN-LAST:event_TF_passwordFocusGained

    private void TF_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_usernameFocusLost
       String username = TF_username.getText();
       if(username.equals("")||username.equals("Username")){
           TF_username.setText("Username");
       }
    }//GEN-LAST:event_TF_usernameFocusLost

    private void TF_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_passwordFocusLost
        String pass = TF_password.getText();
       if(pass.equals("")||pass.equals("Password")){
           TF_password.setText("Password");
       }
    }//GEN-LAST:event_TF_passwordFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        prosesLogin();
    }//GEN-LAST:event_btn_loginActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gb_Login;
    private javax.swing.JTextField TF_password;
    private javax.swing.JTextField TF_username;
    private javax.swing.JLabel bt_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void prosesLogin() {
        if(validasiInput()== true){
            String id = TF_username.getText();
            String username = TF_username.getText();
            String password = TF_password.getText();

            model_login modlL = new model_login();

            modlL.setId_login(id);
            modlL.setUsername(username);
            modlL.setPassword(password);

            servis.prosesLogin(modlL);
            if(tutup){
                dispose();
            }
           
       }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if(TF_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if(TF_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;   
    }
}
