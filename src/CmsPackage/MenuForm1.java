/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Horine
 */
public class MenuForm1 extends javax.swing.JFrame implements Runnable{

    int hour, second, minute;
    int day, month, year;
    
    public MenuForm1() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
        scaleMemberImage();
        scaleAccountImage();
        scaleReportImage();
        scaleMenuIcon();
        jTextField_CUSER.setText(String.valueOf(CurrentUser.currentUser));
    }

    private void scaleMemberImage() {
        ImageIcon iconMemb = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\mrole.png");
        //Scale iamge to fit the jbutton
        Image img = iconMemb.getImage();
        Image imgScale = img.getScaledInstance(jButton_MEMBER_ICON.getWidth(), jButton_MEMBER_ICON.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledMemberIcon = new ImageIcon(imgScale);
        jButton_MEMBER_ICON.setIcon(scaledMemberIcon);
    }

    private void scaleAccountImage() {
        ImageIcon iconAcc = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\account.png");
        //Scale iamge to fit the jbutton
        Image img = iconAcc.getImage();
        Image imgScale = img.getScaledInstance(jButton_ACCOUNT_ICON.getWidth(), jButton_ACCOUNT_ICON.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledAccountIcon = new ImageIcon(imgScale);
        jButton_ACCOUNT_ICON.setIcon(scaledAccountIcon);
    }

    private void scaleReportImage() {
        ImageIcon iconAcc = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\reports.jpg");
        //Scale iamge to fit the jbutton
        Image img = iconAcc.getImage();
        Image imgScale = img.getScaledInstance(jButton_REPORT_ICON.getWidth(), jButton_REPORT_ICON.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledReportIcon = new ImageIcon(imgScale);
        jButton_REPORT_ICON.setIcon(scaledReportIcon);
    }
    
    private void scaleMenuIcon() {
        ImageIcon iconAcc = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\alter.jpg");
        //Scale iamge to fit the jbutton
        Image img = iconAcc.getImage();
        Image imgScale = img.getScaledInstance(jLabel_MENU.getWidth(), jLabel_MENU.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledReportIcon = new ImageIcon(imgScale);
        jLabel_MENU.setIcon(scaledReportIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_CUSER = new javax.swing.JTextField();
        jLabel_LOGOUT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_MEMBER_ICON = new javax.swing.JButton();
        jButton_ACCOUNT_ICON = new javax.swing.JButton();
        jButton_REPORT_ICON = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_TIME = new javax.swing.JLabel();
        jLabel_DATE = new javax.swing.JLabel();
        jLabel_MENU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N
        Label1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Label1ComponentResized(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 15, 149));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ST. SEBASTIAN");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 15, 149));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARISH");

        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.jpg"))); // NOI18N
        Label2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Label2ComponentResized(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 15, 149));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KATHANGARI CATHOLIC");

        jPanel3.setBackground(new java.awt.Color(31, 58, 147));

        jLabel8.setBackground(new java.awt.Color(31, 58, 147));
        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 37, 42));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Current User:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Menu");

        jTextField_CUSER.setBackground(new java.awt.Color(228, 241, 254));
        jTextField_CUSER.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField_CUSER.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_CUSER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_CUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CUSERActionPerformed(evt);
            }
        });

        jLabel_LOGOUT.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel_LOGOUT.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_LOGOUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LOGOUT.setText("Logout");
        jLabel_LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_MEMBER_ICON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MEMBER_ICONActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_MEMBER_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 141, 134));

        jButton_ACCOUNT_ICON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ACCOUNT_ICONActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_ACCOUNT_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 11, 141, 134));

        jButton_REPORT_ICON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REPORT_ICONActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_REPORT_ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 11, 133, 139));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reports");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 168, 133, 24));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Membership");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 141, 23));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Accounts");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 163, 141, 23));

        jLabel_TIME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_TIME.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel_TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 112, 24));

        jLabel_DATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DATE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 115, 24));
        jPanel2.add(jLabel_MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 360));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Label2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Label1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Label1ComponentResized

    }//GEN-LAST:event_Label1ComponentResized

    private void Label2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Label2ComponentResized

    }//GEN-LAST:event_Label2ComponentResized

    private void jTextField_CUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CUSERActionPerformed

    private void jButton_REPORT_ICONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REPORT_ICONActionPerformed
        // TODO add your handling code here:
        ReportForm1 rf1 = new ReportForm1();
        rf1.setVisible(true);
        rf1.pack();
        rf1.setLocationRelativeTo(null);
        //rf.setLocationRelativeTo(rf);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jButton_REPORT_ICONActionPerformed

    private void jButton_MEMBER_ICONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MEMBER_ICONActionPerformed
        // TODO add your handling code here:
        MemberForm1 fm1 = new MemberForm1();
        fm1.setVisible(true);
        fm1.pack();
        fm1.setLocationRelativeTo(null);
        //fm.setLocationRelativeTo(fm);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jButton_MEMBER_ICONActionPerformed

    private void jButton_ACCOUNT_ICONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ACCOUNT_ICONActionPerformed
        // TODO add your handling code here:
        AccountForm1 af1 = new AccountForm1();
        af1.setVisible(true);
        af1.pack();
        af1.setLocationRelativeTo(null);
        //af.setLocationRelativeTo(af);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jButton_ACCOUNT_ICONActionPerformed

    private void jLabel_LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LOGOUTMouseClicked
        // TODO add your handling code here:
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jLabel_LOGOUTMouseClicked

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
            java.util.logging.Logger.getLogger(MenuForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton jButton_ACCOUNT_ICON;
    private javax.swing.JButton jButton_MEMBER_ICON;
    private javax.swing.JButton jButton_REPORT_ICON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DATE;
    private javax.swing.JLabel jLabel_LOGOUT;
    private javax.swing.JLabel jLabel_MENU;
    private javax.swing.JLabel jLabel_TIME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField_CUSER;
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
            jLabel_TIME.setText(time12);
            jLabel_DATE.setText(date);

        }
    }

    }
