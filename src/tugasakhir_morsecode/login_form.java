/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir_morsecode;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Zulfa Fatah Akbar A
 */
public class login_form extends javax.swing.JFrame {

    /**
     * Creates new form login_form
     */
    public login_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        showCheckBox = new javax.swing.JCheckBox();
        passField = new javax.swing.JPasswordField();
        title1 = new javax.swing.JLabel();
        banckground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("McD");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setForeground(new java.awt.Color(255, 51, 51));
        userLabel.setText(" Username :");
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        passLabel.setForeground(new java.awt.Color(255, 51, 51));
        passLabel.setText(" Password :");
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        userField.setBackground(new java.awt.Color(51, 51, 51));
        userField.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, -1));

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        showCheckBox.setText("Show password");
        showCheckBox.setAlignmentX(0.5F);
        showCheckBox.setContentAreaFilled(false);
        showCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(showCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        passField.setBackground(new java.awt.Color(51, 51, 51));
        passField.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 150, -1));

        title1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 0, 102));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Morse Code Decipher");
        title1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        banckground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zulfa Fatah Akbar A\\Pictures\\Ingredients\\2018-09-16_071129 (2).png")); // NOI18N
        getContentPane().add(banckground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
            String userText;
            String pwdText;
            userText = userField.getText();
            pwdText = passField.getText();
            if (userText.equalsIgnoreCase("Abams") && pwdText.equals("Abams13")) {
                JOptionPane.showMessageDialog(this, "Welcome! Abams");
                App_MorseCode mf = new App_MorseCode();
                mf.setVisible(true);
//                mf.pack();
//                mf.setLocationRelativeTo(null);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCheckBoxActionPerformed
        if (showCheckBox.isSelected()) {
                passField.setEchoChar((char)0);
            } else {
                passField.setEchoChar('*');
            }
    }//GEN-LAST:event_showCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banckground;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JCheckBox showCheckBox;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
