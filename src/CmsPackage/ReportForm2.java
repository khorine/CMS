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
public class ReportForm2 extends javax.swing.JFrame implements Runnable {

    int hour, second, minute;
    int day, month, year;

    public ReportForm2() {
        initComponents();
        scaleIcon1();
        scaleIcon2();
        Thread t = new Thread(this);
        t.start();
        jTextField_CUSER.setText(String.valueOf(CurrentUser.currentUser));

    }

    UserData users = new UserData();
    MembersData members = new MembersData();
    MembersByChurchData membersChurchData = new MembersByChurchData();
    MembersByGenderData membersGenderData = new MembersByGenderData();
    MembersBySacramentalStatus sacramentalStatusData = new MembersBySacramentalStatus();
    MembersAccountData membersAcc = new MembersAccountData();
    MemberDonationsData memberDonations = new MemberDonationsData();
    NonMemberDonationsData nonmemberDonations = new NonMemberDonationsData();
    GroupDonationsData gDoantions = new GroupDonationsData();
    ChurchAccountsData churchAccount = new ChurchAccountsData();
    ChurchAccountsByAccTypeData churchAccByAccType = new ChurchAccountsByAccTypeData();
    ChurchAccountsByChurchData churchAccByChurchName = new ChurchAccountsByChurchData();
    EnvelopesData envelopes = new EnvelopesData();
    EnvelopesByChurchData churchEnvelopes = new EnvelopesByChurchData();

    private void scaleIcon1() {
        ImageIcon icon1 = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\logo3.png");
        //Scale iamge to fit the jbutton
        Image img = icon1.getImage();
        Image imgScale = img.getScaledInstance(jLabel_ICON1.getWidth(), jLabel_ICON1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale);
        jLabel_ICON1.setIcon(scaledIcon1);
    }

    private void scaleIcon2() {
        ImageIcon icon2 = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\logo2.jpg");
        //Scale iamge to fit the jbutton
        Image img = icon2.getImage();
        Image imgScale = img.getScaledInstance(jLabel_ICON2.getWidth(), jLabel_ICON2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale);
        jLabel_ICON2.setIcon(scaledIcon2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_ICON2 = new javax.swing.JLabel();
        jLabel_ICON1 = new javax.swing.JLabel();
        jLabel_LOGOUT = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_CUSER = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel_CTime = new javax.swing.JLabel();
        jLabel_CDate = new javax.swing.JLabel();
        jRadioButton_VIEW_MEMBERS = new javax.swing.JRadioButton();
        jRadioButton_M_BY_GENDER = new javax.swing.JRadioButton();
        jRadioButton_SACR_STATUS = new javax.swing.JRadioButton();
        jRadioButton_M_ACCOUNTS = new javax.swing.JRadioButton();
        jRadioButton_M_BY_CHURCH = new javax.swing.JRadioButton();
        jRadioButton_M_DONATIONS = new javax.swing.JRadioButton();
        jRadioButton_CHURCH_ACCOUNT_ALL = new javax.swing.JRadioButton();
        jRadioButton_CHURCH_ACC_BY_CHURCH = new javax.swing.JRadioButton();
        jRadioButton_ENVELOPES_ALL = new javax.swing.JRadioButton();
        jRadioButton_ENV_BY_CHURCH = new javax.swing.JRadioButton();
        jRadioButton_GROUP_DONS = new javax.swing.JRadioButton();
        jRadioButton_NON_MEMBER_DONS = new javax.swing.JRadioButton();
        jRadioButton_ACCTYPE = new javax.swing.JRadioButton();
        jButton_BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_LOGOUT.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_LOGOUT.setText("   Logout");
        jLabel_LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LOGOUTMouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(31, 58, 147));
        jLabel21.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 37, 42));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Current User:");

        jTextField_CUSER.setBackground(new java.awt.Color(228, 241, 254));
        jTextField_CUSER.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField_CUSER.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_CUSER.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_ICON2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LOGOUT))
                .addGap(63, 63, 63))
        );

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel_CTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_CTime.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_CDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_CDate.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jRadioButton_VIEW_MEMBERS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_VIEW_MEMBERS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_VIEW_MEMBERS.setText("Members (All)");
        jRadioButton_VIEW_MEMBERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_VIEW_MEMBERSActionPerformed(evt);
            }
        });

        jRadioButton_M_BY_GENDER.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_M_BY_GENDER.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_M_BY_GENDER.setText("Members by Gender");
        jRadioButton_M_BY_GENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_M_BY_GENDERActionPerformed(evt);
            }
        });

        jRadioButton_SACR_STATUS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_SACR_STATUS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_SACR_STATUS.setText("Sacramental Status");
        jRadioButton_SACR_STATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SACR_STATUSActionPerformed(evt);
            }
        });

        jRadioButton_M_ACCOUNTS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_M_ACCOUNTS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_M_ACCOUNTS.setText("Member Accounts");
        jRadioButton_M_ACCOUNTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_M_ACCOUNTSActionPerformed(evt);
            }
        });

        jRadioButton_M_BY_CHURCH.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_M_BY_CHURCH.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_M_BY_CHURCH.setText("Members by Church");
        jRadioButton_M_BY_CHURCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_M_BY_CHURCHActionPerformed(evt);
            }
        });

        jRadioButton_M_DONATIONS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_M_DONATIONS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_M_DONATIONS.setText("Member Donations");
        jRadioButton_M_DONATIONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_M_DONATIONSActionPerformed(evt);
            }
        });

        jRadioButton_CHURCH_ACCOUNT_ALL.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_CHURCH_ACCOUNT_ALL.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_CHURCH_ACCOUNT_ALL.setText("Church Account (All)");
        jRadioButton_CHURCH_ACCOUNT_ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CHURCH_ACCOUNT_ALLActionPerformed(evt);
            }
        });

        jRadioButton_CHURCH_ACC_BY_CHURCH.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_CHURCH_ACC_BY_CHURCH.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_CHURCH_ACC_BY_CHURCH.setText("Church Accounts by Church");
        jRadioButton_CHURCH_ACC_BY_CHURCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CHURCH_ACC_BY_CHURCHActionPerformed(evt);
            }
        });

        jRadioButton_ENVELOPES_ALL.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_ENVELOPES_ALL.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_ENVELOPES_ALL.setText("Envelopes (All)");
        jRadioButton_ENVELOPES_ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ENVELOPES_ALLActionPerformed(evt);
            }
        });

        jRadioButton_ENV_BY_CHURCH.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_ENV_BY_CHURCH.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_ENV_BY_CHURCH.setText("Envelopes by Church");
        jRadioButton_ENV_BY_CHURCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ENV_BY_CHURCHActionPerformed(evt);
            }
        });

        jRadioButton_GROUP_DONS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_GROUP_DONS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_GROUP_DONS.setText("Group Donations");
        jRadioButton_GROUP_DONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_GROUP_DONSActionPerformed(evt);
            }
        });

        jRadioButton_NON_MEMBER_DONS.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_NON_MEMBER_DONS.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_NON_MEMBER_DONS.setText("Non-Member Donations");
        jRadioButton_NON_MEMBER_DONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_NON_MEMBER_DONSActionPerformed(evt);
            }
        });

        jRadioButton_ACCTYPE.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jRadioButton_ACCTYPE.setForeground(new java.awt.Color(135, 211, 124));
        jRadioButton_ACCTYPE.setText("Church Accounts by Account Type");
        jRadioButton_ACCTYPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ACCTYPEActionPerformed(evt);
            }
        });

        jButton_BACK.setFont(new java.awt.Font("Sitka Display", 1, 13)); // NOI18N
        jButton_BACK.setForeground(new java.awt.Color(31, 58, 147));
        jButton_BACK.setText("Back To Menu");
        jButton_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton_VIEW_MEMBERS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_SACR_STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_M_BY_CHURCH, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jRadioButton_M_BY_GENDER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_M_ACCOUNTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton_BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel_CTime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton_CHURCH_ACCOUNT_ALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton_ACCTYPE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton_NON_MEMBER_DONS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton_M_DONATIONS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_ENVELOPES_ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_CHURCH_ACC_BY_CHURCH, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_ENV_BY_CHURCH, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_GROUP_DONS, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton_CHURCH_ACC_BY_CHURCH))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_M_DONATIONS)
                            .addComponent(jRadioButton_VIEW_MEMBERS))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jRadioButton_ENV_BY_CHURCH))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton_CHURCH_ACCOUNT_ALL)
                                    .addComponent(jRadioButton_M_BY_GENDER))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jRadioButton_ACCTYPE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton_SACR_STATUS))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton_NON_MEMBER_DONS)
                                    .addComponent(jRadioButton_ENVELOPES_ALL)
                                    .addComponent(jRadioButton_M_BY_CHURCH))
                                .addGap(98, 98, 98)
                                .addComponent(jRadioButton_GROUP_DONS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jRadioButton_M_ACCOUNTS)
                        .addGap(71, 71, 71)
                        .addComponent(jButton_BACK)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LOGOUTMouseClicked

        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        
         this.dispose();
    }//GEN-LAST:event_jLabel_LOGOUTMouseClicked

    private void jRadioButton_VIEW_MEMBERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_VIEW_MEMBERSActionPerformed

        if (jRadioButton_VIEW_MEMBERS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            members.setVisible(true);
            members.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);

        }
    }//GEN-LAST:event_jRadioButton_VIEW_MEMBERSActionPerformed

    private void jRadioButton_M_BY_CHURCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_M_BY_CHURCHActionPerformed
        if (jRadioButton_M_BY_CHURCH.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            membersChurchData.setVisible(true);
            membersChurchData.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);

        }

    }//GEN-LAST:event_jRadioButton_M_BY_CHURCHActionPerformed

    private void jRadioButton_M_BY_GENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_M_BY_GENDERActionPerformed
        if (jRadioButton_M_BY_GENDER.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            membersGenderData.setVisible(true);
            membersGenderData.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_M_BY_GENDERActionPerformed

    private void jRadioButton_SACR_STATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SACR_STATUSActionPerformed
        if (jRadioButton_SACR_STATUS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            sacramentalStatusData.setVisible(true);
            sacramentalStatusData.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }

    }//GEN-LAST:event_jRadioButton_SACR_STATUSActionPerformed

    private void jRadioButton_M_ACCOUNTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_M_ACCOUNTSActionPerformed
        if (jRadioButton_M_ACCOUNTS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            membersAcc.setVisible(true);
            membersAcc.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_M_ACCOUNTSActionPerformed

    private void jRadioButton_M_DONATIONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_M_DONATIONSActionPerformed
        if (jRadioButton_M_DONATIONS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            memberDonations.setVisible(true);
            memberDonations.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_M_DONATIONSActionPerformed

    private void jRadioButton_NON_MEMBER_DONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_NON_MEMBER_DONSActionPerformed
        if (jRadioButton_NON_MEMBER_DONS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            nonmemberDonations.setVisible(true);
            nonmemberDonations.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_NON_MEMBER_DONSActionPerformed

    private void jRadioButton_GROUP_DONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_GROUP_DONSActionPerformed
        if (jRadioButton_GROUP_DONS.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            gDoantions.setVisible(true);
            gDoantions.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_GROUP_DONSActionPerformed

    private void jRadioButton_CHURCH_ACCOUNT_ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CHURCH_ACCOUNT_ALLActionPerformed
        if (jRadioButton_CHURCH_ACCOUNT_ALL.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            churchAccount.setVisible(true);
            churchAccount.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_CHURCH_ACCOUNT_ALLActionPerformed

    private void jRadioButton_CHURCH_ACC_BY_CHURCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CHURCH_ACC_BY_CHURCHActionPerformed
         if (jRadioButton_CHURCH_ACC_BY_CHURCH.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);

            churchAccByChurchName.setVisible(true);
            churchAccByChurchName.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_CHURCH_ACC_BY_CHURCHActionPerformed

    private void jRadioButton_ACCTYPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ACCTYPEActionPerformed
        if (jRadioButton_ACCTYPE.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            churchAccByAccType.setVisible(true);
            churchAccByAccType.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_ACCTYPEActionPerformed

    private void jRadioButton_ENVELOPES_ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ENVELOPES_ALLActionPerformed
       if (jRadioButton_ENVELOPES_ALL.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENV_BY_CHURCH.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            envelopes.setVisible(true);
            envelopes.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jRadioButton_ENVELOPES_ALLActionPerformed

    private void jRadioButton_ENV_BY_CHURCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ENV_BY_CHURCHActionPerformed
        if (jRadioButton_ENV_BY_CHURCH.isSelected()) {
            jRadioButton_VIEW_MEMBERS.setSelected(false);
            jRadioButton_M_BY_CHURCH.setSelected(false);
            jRadioButton_M_BY_GENDER.setSelected(false);
            jRadioButton_SACR_STATUS.setSelected(false);
            jRadioButton_M_ACCOUNTS.setSelected(false);
            jRadioButton_GROUP_DONS.setSelected(false);
            jRadioButton_ACCTYPE.setSelected(false);
            jRadioButton_ENVELOPES_ALL.setSelected(false);
            jRadioButton_M_DONATIONS.setSelected(false);
            jRadioButton_NON_MEMBER_DONS.setSelected(false);
            jRadioButton_CHURCH_ACCOUNT_ALL.setSelected(false);
            jRadioButton_CHURCH_ACC_BY_CHURCH.setSelected(false);

            churchEnvelopes.setVisible(true);
            churchEnvelopes.setDefaultCloseOperation(ReportForm2.DISPOSE_ON_CLOSE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_ENV_BY_CHURCHActionPerformed

    private void jButton_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACKActionPerformed
        MenuForm2 mf2 = new MenuForm2();
        mf2.setVisible(true);
        mf2.pack();
        //mf.setLocationRelativeTo(null);
        mf2.setLocationRelativeTo(mf2);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jButton_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(ReportForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ReportForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BACK;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel_CDate;
    private javax.swing.JLabel jLabel_CTime;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JLabel jLabel_LOGOUT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_ACCTYPE;
    private javax.swing.JRadioButton jRadioButton_CHURCH_ACCOUNT_ALL;
    private javax.swing.JRadioButton jRadioButton_CHURCH_ACC_BY_CHURCH;
    private javax.swing.JRadioButton jRadioButton_ENVELOPES_ALL;
    private javax.swing.JRadioButton jRadioButton_ENV_BY_CHURCH;
    private javax.swing.JRadioButton jRadioButton_GROUP_DONS;
    private javax.swing.JRadioButton jRadioButton_M_ACCOUNTS;
    private javax.swing.JRadioButton jRadioButton_M_BY_CHURCH;
    private javax.swing.JRadioButton jRadioButton_M_BY_GENDER;
    private javax.swing.JRadioButton jRadioButton_M_DONATIONS;
    private javax.swing.JRadioButton jRadioButton_NON_MEMBER_DONS;
    private javax.swing.JRadioButton jRadioButton_SACR_STATUS;
    private javax.swing.JRadioButton jRadioButton_VIEW_MEMBERS;
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
            jLabel_CTime.setText(time12);
            jLabel_CDate.setText(date);

        }

    }

}
