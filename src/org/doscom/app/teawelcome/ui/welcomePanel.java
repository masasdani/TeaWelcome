/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * welcomePanel.java
 *
 * Created on Mar 19, 2011, 1:23:00 AM
 */

package org.doscom.app.teawelcome.ui;

/**
 *
 * @author home
 */
public class welcomePanel extends javax.swing.JPanel {

    /** Creates new form welcomePanel */
    public welcomePanel() {
        initComponents();
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

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48));
        jLabel1.setText("Welcome to TeaLinuxOS 3.0");

        jLabel2.setText("<html>\n<head>\n<title>Welcome Whitetea</title>\n</head>\n<body>\n<font size=\"+1\">Rilis : 3 – White Tea<br>\n<br>\n<br>\nSelamat datang dan terima kasih kami ucapkan kepada anda yang sudah\nmemilih untuk menggunakan<br>\n<br>\nproduk kami. Kami harap anda dapat menikmati menggunakan sistem operasi\nini dan fitur-fitur spesial<br>\n<br>\nyang sudah kami persiapkan didalamnya. TeaLinuxOS dirancang dan\ndibangun sedemikian rupa untuk<br>\n<br>\nanda para programmer, sehingga memudahkan anda dalam membangun dan\nmengembangkan program<br>\n<br>\natau piranti lunak berteknologi terbaru. Kami berharap, sistem operasi\nini bermanfaat bagi anda. Dan<br>\n<br>\nkritik serta saran anda akan selalu kami terima untuk menjaga kualitas\nproduk ini.<br>\n<br>\nSelamat menggunakan.<br>\n</font>\n</body>\n</html>\n\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}