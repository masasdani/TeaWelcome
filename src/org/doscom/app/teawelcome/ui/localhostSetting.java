/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * localhostSetting.java
 *
 * Created on Mar 19, 2011, 1:31:18 AM
 */

package org.doscom.app.teawelcome.ui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.doscom.app.teawelcome.database.databaseUtilities;

/**
 *
 * @author home
 */
public class localhostSetting extends javax.swing.JPanel {

    /** Creates new form localhostSetting */
    public localhostSetting() {
        initComponents();
    }

    private boolean passwordCorrect(){
        boolean isCorrect=false;
        if(password1.getText().matches(password2.getText())){
            isCorrect=true;
        }else isCorrect=false;
        return isCorrect;
    }

    private void clearPassword(){
        password1.setText("");
        password2.setText("");
    }

    public void updatePassword(String password){
        try{
            Statement statement=databaseUtilities.getConnection().createStatement();
            statement.executeUpdate("update user set password=password(\'"+password+"\') where user=\'root\';");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void flush(){
        try{
            Statement statement=databaseUtilities.getConnection().createStatement();
            statement.executeUpdate("flush privileges;");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setText("Setup Your Localhost and mysql password");

        jLabel2.setText("untuk menggunakan fitur mysql dan phpmyadmin, anda perlu menyetel password mysql anda. ");

        jLabel3.setText("lakukan penyetelan dengan memasukkan password mysql baru disini :");

        jLabel4.setText("Create New Mysql Password for Root");

        jLabel5.setText("Repeat Password");

        jButton1.setText("save setting");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password2)
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(passwordCorrect()){
            updatePassword(password1.getText());
            flush();
            JOptionPane.showMessageDialog(this, "password berhasil disimpan. tekan Next");
            clearPassword();
        }else{
            clearPassword();
            JOptionPane.showMessageDialog(this, "password tidak cocok");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    // End of variables declaration//GEN-END:variables

}
