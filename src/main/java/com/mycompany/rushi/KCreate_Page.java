
package com.mycompany.rushi;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KCreate_Page extends javax.swing.JFrame {
                
                private final String user="root";
                private final  String pass="Rushikesh@5046";
                private final  String sqlcon="jdbc:mysql://localhost:3306/rushi"; 
                Connection con=null;
                PreparedStatement pst =null;
                ResultSet rs=null;
    public KCreate_Page() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        curvesPanel11 = new com.mycompany.rushi.CurvesPanel1();
        circlesPanel121 = new com.mycompany.rushi.CirclesPanel12();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Password2 = new com.mycompany.rushi.TextField();
        Emailid2 = new com.mycompany.rushi.TextField();
        Username2 = new com.mycompany.rushi.TextField();
        jLabel5 = new javax.swing.JLabel();
        Account_Type2 = new javax.swing.JComboBox<>();
        Skip = new javax.swing.JButton();
        Sign_up2 = new javax.swing.JButton();
        Login1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C reatpage");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create-account-6333606-5230166.png"))); // NOI18N

        javax.swing.GroupLayout circlesPanel121Layout = new javax.swing.GroupLayout(circlesPanel121);
        circlesPanel121.setLayout(circlesPanel121Layout);
        circlesPanel121Layout.setHorizontalGroup(
            circlesPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlesPanel121Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        circlesPanel121Layout.setVerticalGroup(
            circlesPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circlesPanel121Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout curvesPanel11Layout = new javax.swing.GroupLayout(curvesPanel11);
        curvesPanel11.setLayout(curvesPanel11Layout);
        curvesPanel11Layout.setHorizontalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addComponent(circlesPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        curvesPanel11Layout.setVerticalGroup(
            curvesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvesPanel11Layout.createSequentialGroup()
                .addComponent(circlesPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-login-45.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-forgot-password-40.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-choose-40.png"))); // NOI18N

        Password2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Password2.setLabelText("Password");

        Emailid2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Emailid2.setLabelText("Email Id");

        Username2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Username2.setLabelText("Username");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-database-mail-40.png"))); // NOI18N

        Account_Type2.setBackground(new java.awt.Color(255, 255, 255));
        Account_Type2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Account_Type2.setForeground(new java.awt.Color(204, 204, 204));
        Account_Type2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Type", "Admin", "User", " " }));
        Account_Type2.setToolTipText("Account Typee");

        Skip.setBackground(new java.awt.Color(188, 237, 105));
        Skip.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Skip.setForeground(new java.awt.Color(0, 0, 0));
        Skip.setText("Skip");
        Skip.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        Skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SkipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SkipMouseExited(evt);
            }
        });
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });

        Sign_up2.setBackground(new java.awt.Color(188, 237, 105));
        Sign_up2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Sign_up2.setForeground(new java.awt.Color(0, 0, 0));
        Sign_up2.setText("Sign Up");
        Sign_up2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Sign_up2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sign_up2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sign_up2MouseExited(evt);
            }
        });
        Sign_up2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_up2ActionPerformed(evt);
            }
        });

        Login1.setBackground(new java.awt.Color(188, 237, 105));
        Login1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Login1.setForeground(new java.awt.Color(0, 0, 0));
        Login1.setText("Back to Login");
        Login1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login1MouseExited(evt);
            }
        });
        Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(curvesPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Account_Type2, 0, 219, Short.MAX_VALUE)
                            .addComponent(Emailid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Username2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sign_up2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Skip, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Login1)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(curvesPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Username2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Emailid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Account_Type2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sign_up2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Skip, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SkipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseEntered
        Skip.setBackground(new Color(80, 66, 112));
    }//GEN-LAST:event_SkipMouseEntered

    private void SkipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseExited
        Skip.setBackground(new Color(188,237,105));  
    }//GEN-LAST:event_SkipMouseExited

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
        setVisible(false);
        new Main_Page().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_SkipActionPerformed

    private void Sign_up2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sign_up2MouseEntered
        Sign_up2.setBackground(new Color(80, 66, 112));
    }//GEN-LAST:event_Sign_up2MouseEntered

    private void Sign_up2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sign_up2MouseExited
        Sign_up2.setBackground(new Color(188,237,105));  
    }//GEN-LAST:event_Sign_up2MouseExited

    private void Sign_up2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_up2ActionPerformed

        String username=Username2.getText().trim();
        String password=Password2.getText().trim();
        String Email_id=Emailid2.getText().trim();
        String Account_Type=Account_Type2.getSelectedItem().toString();

        if(username.isEmpty() ||Email_id.isEmpty()|| password.isEmpty()|| Account_Type.isEmpty()||username.isBlank()||Email_id.isBlank()||password.isBlank()|| Account_Type.isBlank())
        {
            JOptionPane.showMessageDialog(rootPane, "Please Insert The Information", "Failure",JOptionPane.ERROR_MESSAGE);
        }

        else if(Account_Type2.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please Select The Account Type", "Failure",JOptionPane.ERROR_MESSAGE);
        }

        else if (!Email_id.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]*$"))
        {
            JOptionPane.showMessageDialog(rootPane, "Please  Enter  The Correct Mail ID ...", "failure",JOptionPane.ERROR_MESSAGE);                                                                                                                                                                  //  data valdition cheak
            Emailid2.setText("");
            Emailid2.grabFocus();
        }
        else
        {
            try
            {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection(sqlcon,user,pass);

                pst=con.prepareStatement("INSERT INTO create_account values (?,?,?,?)");
                pst.setString(1, username);
                pst.setString(2,password);
                pst.setString(3,Email_id);
                pst.setString(4,Account_Type);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Successfully Create Account...", "Welcome",JOptionPane.INFORMATION_MESSAGE);
                new Main_Page().setVisible(rootPaneCheckingEnabled);
                setVisible(false);

            }

            catch (Exception ex)
            {

                JOptionPane.showMessageDialog(rootPane, "Username Has Alredy Exist/Mail Alreay use it ...", "Welcome",JOptionPane.INFORMATION_MESSAGE);

            }

            finally
            {
                try {
                    con.close();

                }
                catch (SQLException ex)
                {
                 ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_Sign_up2ActionPerformed

    private void Login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Login1MouseEntered

    private void Login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Login1MouseExited

    private void Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1ActionPerformed
        setVisible(false);
        new Login_Page().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_Login1ActionPerformed

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
            java.util.logging.Logger.getLogger(KCreate_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KCreate_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KCreate_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KCreate_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KCreate_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Account_Type2;
    private com.mycompany.rushi.TextField Emailid2;
    private javax.swing.JButton Login1;
    private com.mycompany.rushi.TextField Password2;
    private javax.swing.JButton Sign_up2;
    private javax.swing.JButton Skip;
    private com.mycompany.rushi.TextField Username2;
    private com.mycompany.rushi.CirclesPanel12 circlesPanel121;
    private com.mycompany.rushi.CurvesPanel1 curvesPanel11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
