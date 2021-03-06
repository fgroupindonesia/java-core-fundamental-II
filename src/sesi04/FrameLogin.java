/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi04;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAwal
     */
    public FrameLogin() {
        initComponents();
    }

    private boolean isEmpty(JTextField comp) {
        return !(comp.getText().length() > 1);
    }

    private void toggleButtonLogin() {

        // jika kosong maka buttonLogin pun mati alias tidak bisa di click
        if (isEmpty(textfieldPassword) && isEmpty(textfieldUsername)) {
            buttonLogin.setEnabled(false);
        } else {
            buttonLogin.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textfieldUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textfieldPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        labelPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cridentials"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Username :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));

        textfieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldUsernameFocusLost(evt);
            }
        });
        textfieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(textfieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 79, 220, -1));

        jLabel1.setText("Password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        textfieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textfieldPasswordFocusLost(evt);
            }
        });
        textfieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(textfieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Forgot Password?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, -1));

        buttonLogin.setText("Login");
        buttonLogin.setEnabled(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        labelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sesi04/images/lock.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldUsernameFocusGained
        textfieldUsername.setBackground(Color.yellow);

    }//GEN-LAST:event_textfieldUsernameFocusGained

    private void textfieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldUsernameFocusLost
        textfieldUsername.setBackground(null);

    }//GEN-LAST:event_textfieldUsernameFocusLost

    private void textfieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPasswordFocusGained
        // TODO add your handling code here:
        textfieldPassword.setBackground(Color.yellow);
    }//GEN-LAST:event_textfieldPasswordFocusGained

    private void textfieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldPasswordFocusLost
        textfieldPassword.setBackground(null);
    }//GEN-LAST:event_textfieldPasswordFocusLost

    private void textfieldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldUsernameKeyTyped
        toggleButtonLogin();
    }//GEN-LAST:event_textfieldUsernameKeyTyped

    private void textfieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldPasswordKeyTyped
        toggleButtonLogin();
    }//GEN-LAST:event_textfieldPasswordKeyTyped

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // Menampilkan frame home dan meniadakan
        // frame login tadi (awal)
        FrameHome penampilan = new FrameHome(this);
        penampilan.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_buttonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPicture;
    private javax.swing.JTextField textfieldPassword;
    private javax.swing.JTextField textfieldUsername;
    // End of variables declaration//GEN-END:variables
}
