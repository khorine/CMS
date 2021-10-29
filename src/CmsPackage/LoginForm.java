/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Horine
 */
public class LoginForm extends javax.swing.JFrame implements Runnable {

    int hour, second, minute;
    int day, month, year;
    
    public LoginForm() {
        initComponents();
        
        Thread t = new Thread(this);
        t.start();
        scaleLoginIcon();
        
        
    }

    private void scaleLoginIcon() {
        ImageIcon icon1 = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\menu.jpg");
        //Scale iamge to fit the jbutton
        Image img = icon1.getImage();
        Image imgScale = img.getScaledInstance(jLabel_LOGIN.getWidth(), jLabel_LOGIN.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale);
        jLabel_LOGIN.setIcon(scaledIcon1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton_LOGIN = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabel_RESET = new javax.swing.JLabel();
        jLabel_TIME = new javax.swing.JLabel();
        jLabel_DATE = new javax.swing.JLabel();
        jLabel_LOGIN = new javax.swing.JLabel();
        jLabel_DATE1 = new javax.swing.JLabel();
        jLabel_TIME1 = new javax.swing.JLabel();
        jLabel_LOGIN1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 241, 254));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N
        Label1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Label1ComponentResized(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 15, 149));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ST. SEBASTIAN");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 15, 149));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARISH");

        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.jpg"))); // NOI18N
        Label2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Label2ComponentResized(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 15, 149));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KATHANGARI CATHOLIC");

        jPanel3.setBackground(new java.awt.Color(31, 58, 147));

        jLabel8.setBackground(new java.awt.Color(31, 58, 147));
        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(241, 231, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, -1));

        jTextField_UN.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jTextField_UN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(jTextField_UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 240, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 200, -1));

        jPasswordField_PASS.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPasswordField_PASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_PASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PASSActionPerformed(evt);
            }
        });
        jPanel4.add(jPasswordField_PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 240, -1));

        jButton_LOGIN.setBackground(new java.awt.Color(0, 0, 204));
        jButton_LOGIN.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton_LOGIN.setText("Login");
        jButton_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGINActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jButton_CANCEL.setBackground(new java.awt.Color(255, 0, 0));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel_RESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_RESET.setForeground(new java.awt.Color(83, 51, 237));
        jLabel_RESET.setText("     Change Password");
        jPanel4.add(jLabel_RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 160, 24));

        jLabel_TIME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_TIME.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_TIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 108, 20));

        jLabel_DATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_DATE.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_DATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 116, 20));

        jLabel_LOGIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 950, 310));

        jLabel_DATE1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_DATE1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_DATE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_DATE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 108, 20));

        jLabel_TIME1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_TIME1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_TIME1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_TIME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 116, 20));

        jLabel_LOGIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel_LOGIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 810, 290));

        jPanel5.setBackground(new java.awt.Color(241, 231, 254));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Label2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Label2ComponentResized
        ImageIcon icon = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\logo2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Label2.getWidth(), Label2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Label2.setIcon(scaledIcon);
    }//GEN-LAST:event_Label2ComponentResized

    private void jPasswordField_PASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PASSActionPerformed

    @SuppressWarnings("ConvertToStringSwitch")
    private void jButton_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGINActionPerformed
        // TODO add your handling code here:

        PreparedStatement ps;
        ResultSet rs;
        //int count = 0;
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());

        String query = "SELECT * FROM `users` WHERE `USERNAME`=? AND `PASSWORD`=?";

        try {
            ps = CmsConnection.getConnection().prepareStatement(query);

            ps.setString(1, uname);
            ps.setString(2, pass);
            //String Administrator,Treasurer,Secretary;

            rs = ps.executeQuery();

            //while (rs.next()){
            // }
            if (rs.next()) {
                String username = rs.getString("FIRST_NAME") + " " + rs.getString("LAST_NAME");
                CurrentUser.currentUser = username;
                //count = count + 1;
                String access = rs.getString("ROLE");
                UserAccess.userRole = access;
                
                if (access.equals("Administrator")) {
                    MenuForm mf = new MenuForm();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(mf);
                } else if (access.equals("Treasurer") || access.equals("Secretary")) {
                    MenuForm1 mf1 = new MenuForm1();
                    mf1.setVisible(true);
                    mf1.pack();
                    mf1.setLocationRelativeTo(mf1);
                } else {
                    MenuForm2 mf2 = new MenuForm2();
                    mf2.setVisible(true);
                    mf2.pack();
                    mf2.setLocationRelativeTo(mf2);
                }

                // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Login Failed", WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_LOGINActionPerformed

    private void Label1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Label1ComponentResized

        ImageIcon icon = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\logo3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Label1.getWidth(), Label1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        Label1.setIcon(scaledIcon);
    }//GEN-LAST:event_Label1ComponentResized

    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_CANCELActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_LOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_DATE;
    private javax.swing.JLabel jLabel_DATE1;
    private javax.swing.JLabel jLabel_LOGIN;
    private javax.swing.JLabel jLabel_LOGIN1;
    private javax.swing.JLabel jLabel_RESET;
    private javax.swing.JLabel jLabel_TIME;
    private javax.swing.JLabel jLabel_TIME1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            //get current hour, minute and second
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minute = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);
            day = cal.get(Calendar.DAY_OF_WEEK);
            month = cal.get(Calendar.MONTH);
            year = cal.get(Calendar.YEAR);

            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ss:aa");  //aa means AM & PM time
            SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
            Date dat = cal.getTime();

            String time12 = sdf12.format(dat);
            String date = sdf.format(dat);

            //set to label
            jLabel_DATE.setText(time12);
            jLabel_TIME.setText(date);

        }

    }
}
