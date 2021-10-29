/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Horine
 */
public class MemberForm extends javax.swing.JFrame implements Runnable {

    String father;
    String mother;
    Object sacramental;
    Object mGroup;
    Object mAssign;
    String sname;
    String dob = null;
    String yrofAdm = null;
    String mname;
    String fname;
    Object gender;
    String village;
    String phone;
    Object marital;
    String occupation;
    String email;
    String residence;
    String church;
    int hour, second, minute;
    int day, month, year;

    public MemberForm() {
        initComponents();
        MSearchPanel.setVisible(false);
        Thread t = new Thread(this);
        t.start();
        scaleIcon1();
        scaleIcon2();
        scaleProfile();
        jTextField_CUSER.setText(String.valueOf(CurrentUser.currentUser));

    }
    MemberDataImport members = new MemberDataImport();
    byte[] member_image = null;
    String filename = null;
    Connection conn = null;
    //Statement stmt = null;
    //ResultSet rs = null;

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

    private void scaleProfile() {
        ImageIcon iconP = new ImageIcon("C:\\Users\\host\\CMS\\src\\images\\profile.png");
        //Scale iamge to fit the jbutton
        Image img = iconP.getImage();
        Image imgScale = img.getScaledInstance(jLabel_PROFILE.getWidth(), jLabel_PROFILE.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledProfile = new ImageIcon(imgScale);
        jLabel_PROFILE.setIcon(scaledProfile);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_CUSER = new javax.swing.JTextField();
        jLabel_LOGOUT = new javax.swing.JLabel();
        jLabel_ICON1 = new javax.swing.JLabel();
        jLabel_ICON2 = new javax.swing.JLabel();
        jLabel_PROFILE = new javax.swing.JLabel();
        jButton_UPLOAD_PICTURE_ = new javax.swing.JButton();
        jButton_REMOVE_PICTURE = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_FATHER = new javax.swing.JTextField();
        jTextField_MOTHER = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox_SACRAMENTAL = new javax.swing.JComboBox();
        jComboBox_GROUP = new javax.swing.JComboBox();
        jComboBox_ASSIGNMENT = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser_YOA = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField_MN = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField_SN = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser_DOB = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jTextField_VIL = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField_PHONE = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField_OCC = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField_EM = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField_RES = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField_CN = new javax.swing.JTextField();
        jComboBox_GENDER = new javax.swing.JComboBox();
        jComboBox_MARITAL = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jButton_IMPORT_MEMBERS = new javax.swing.JButton();
        jButton_NEW_ = new javax.swing.JButton();
        jButton_ADD_ = new javax.swing.JButton();
        jButton_UPDATE_ = new javax.swing.JButton();
        jButton_SEARCH_ = new javax.swing.JButton();
        jButton_CLEAR_ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_FNME = new javax.swing.JTextField();
        MSearchPanel = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField_MID = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField_MPN = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField_MFN = new javax.swing.JTextField();
        jLabel_DATE = new javax.swing.JLabel();
        jLabel_TIME = new javax.swing.JLabel();
        jButton_BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1030, 1000));

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 950));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(31, 58, 147));
        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 37, 42));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Current User:");

        jTextField_CUSER.setBackground(new java.awt.Color(228, 241, 254));
        jTextField_CUSER.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField_CUSER.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_CUSER.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel_LOGOUT.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_LOGOUT.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_LOGOUT.setText("   Logout");
        jLabel_LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ICON2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel_PROFILE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jLabel_PROFILE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_UPLOAD_PICTURE_.setText("Upload Photo");
        jButton_UPLOAD_PICTURE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPLOAD_PICTURE_ActionPerformed(evt);
            }
        });

        jButton_REMOVE_PICTURE.setText("No Photo");
        jButton_REMOVE_PICTURE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REMOVE_PICTUREActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("   Membership Information");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setText("Sacramental status");

        jLabel7.setBackground(new java.awt.Color(255, 102, 153));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("                        Parents/Guardian Information");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setText("Father/Guardian");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setText("Mother/Guardian");

        jTextField_FATHER.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_MOTHER.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel10.setText("       Member Group");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel11.setText("      Member Assignment");

        jComboBox_SACRAMENTAL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baptism", "Holy Communion", "Confirmation", "Matrimony", "Other" }));

        jComboBox_GROUP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Legion of Mary", "St. Anthony", "St. Francis", "St. John", "St. Andrew", "St. Joseph", "Other" }));
        jComboBox_GROUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GROUPActionPerformed(evt);
            }
        });

        jComboBox_ASSIGNMENT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active Member", "Choir Member", "Drumer", "Instrumentalist", "Youth", "Other" }));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel28.setText("Admission Date");

        jDateChooser_YOA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jTextField_MOTHER)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_ASSIGNMENT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_GROUP, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_SACRAMENTAL, 0, 199, Short.MAX_VALUE)
                            .addComponent(jDateChooser_YOA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jDateChooser_YOA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_SACRAMENTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_MOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_GROUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_ASSIGNMENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 255));
        jLabel17.setText("                   Personal Information");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel18.setText("First Name");

        jTextField_FN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel15.setText("Middle Name");

        jTextField_MN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MNActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel19.setText("SurName");

        jTextField_SN.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel20.setText("Gender");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel21.setText("Date of Birth");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel22.setText("Village");

        jTextField_VIL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_VIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_VILActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel23.setText("Phone No.");

        jTextField_PHONE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PHONEActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel24.setText("Marital Status");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel25.setText("Occupation");

        jTextField_OCC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel26.setText("Email");

        jTextField_EM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EMActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel27.setText("Place of Residence");

        jTextField_RES.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel34.setText("Church Name");

        jTextField_CN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jComboBox_GENDER.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jComboBox_GENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GENDERActionPerformed(evt);
            }
        });

        jComboBox_MARITAL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married", "Divorced" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_CN)
                            .addComponent(jDateChooser_DOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_VIL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_PHONE, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_OCC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_EM, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_RES, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_SN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_MN)
                            .addComponent(jComboBox_GENDER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_MARITAL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_FN)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_MN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_SN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox_GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jDateChooser_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jTextField_VIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBox_MARITAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField_OCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField_EM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField_RES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 255));

        jButton_IMPORT_MEMBERS.setBackground(new java.awt.Color(228, 241, 254));
        jButton_IMPORT_MEMBERS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_IMPORT_MEMBERS.setForeground(new java.awt.Color(77, 19, 209));
        jButton_IMPORT_MEMBERS.setText("Import(Excel)");
        jButton_IMPORT_MEMBERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IMPORT_MEMBERSActionPerformed(evt);
            }
        });

        jButton_NEW_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_NEW_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_NEW_.setForeground(new java.awt.Color(0, 177, 106));
        jButton_NEW_.setText("New Member");
        jButton_NEW_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEW_ActionPerformed(evt);
            }
        });

        jButton_ADD_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_ADD_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_ADD_.setForeground(new java.awt.Color(0, 230, 64));
        jButton_ADD_.setText("Add/Save Member");
        jButton_ADD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_UPDATE_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_UPDATE_.setForeground(new java.awt.Color(46, 204, 113));
        jButton_UPDATE_.setText("Update Member");
        jButton_UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_ActionPerformed(evt);
            }
        });

        jButton_SEARCH_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_SEARCH_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_SEARCH_.setForeground(new java.awt.Color(58, 83, 155));
        jButton_SEARCH_.setText("Search Member");
        jButton_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCH_ActionPerformed(evt);
            }
        });

        jButton_CLEAR_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_CLEAR_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_CLEAR_.setForeground(new java.awt.Color(242, 38, 19));
        jButton_CLEAR_.setText("Clear Form");
        jButton_CLEAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CLEAR_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_UPDATE_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_ADD_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_NEW_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_CLEAR_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_IMPORT_MEMBERS, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ADD_)
                    .addComponent(jButton_NEW_)
                    .addComponent(jButton_IMPORT_MEMBERS))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_UPDATE_)
                    .addComponent(jButton_SEARCH_)
                    .addComponent(jButton_CLEAR_))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel14.setText("     Member ID");

        jTextField_ID.setEnabled(false);
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_FNME.setEnabled(false);

        MSearchPanel.setBackground(new java.awt.Color(102, 102, 102));
        MSearchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel36.setText("Search");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel37.setText("Member ID");

        jTextField_MID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_MIDMouseReleased(evt);
            }
        });
        jTextField_MID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MIDActionPerformed(evt);
            }
        });
        jTextField_MID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MIDKeyReleased(evt);
            }
        });

        jLabel38.setText("Phone No.");

        jTextField_MPN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_MPNMouseReleased(evt);
            }
        });
        jTextField_MPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MPNActionPerformed(evt);
            }
        });
        jTextField_MPN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MPNKeyReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel39.setText("First Name");

        jTextField_MFN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MFN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_MFNMouseReleased(evt);
            }
        });
        jTextField_MFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MFNActionPerformed(evt);
            }
        });
        jTextField_MFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MFNKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout MSearchPanelLayout = new javax.swing.GroupLayout(MSearchPanel);
        MSearchPanel.setLayout(MSearchPanelLayout);
        MSearchPanelLayout.setHorizontalGroup(
            MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MSearchPanelLayout.createSequentialGroup()
                .addGroup(MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MSearchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MSearchPanelLayout.createSequentialGroup()
                        .addGroup(MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MSearchPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel37))
                            .addGroup(MSearchPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_MID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_MPN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MSearchPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MSearchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField_MFN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MSearchPanelLayout.setVerticalGroup(
            MSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MSearchPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_MID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_MPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_MFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel_DATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_DATE.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_DATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_TIME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_TIME.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_TIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_BACK.setFont(new java.awt.Font("Sitka Display", 1, 13)); // NOI18N
        jButton_BACK.setForeground(new java.awt.Color(31, 58, 147));
        jButton_BACK.setText("Back To Menu");
        jButton_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_REMOVE_PICTURE, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_UPLOAD_PICTURE_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_PROFILE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_FNME, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MSearchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton_BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jTextField_FNME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(MSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton_UPLOAD_PICTURE_)
                                .addGap(46, 46, 46)
                                .addComponent(jButton_REMOVE_PICTURE))
                            .addComponent(jLabel_PROFILE, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_BACK))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UPLOAD_PICTURE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPLOAD_PICTURE_ActionPerformed
        // TODO add your handling code here:

        JFileChooser imageFileChooser = new JFileChooser();
        int imageChooser = imageFileChooser.showOpenDialog(null);
        // imageFileChooser.setCurrentDirectory(new File(System.getProperty("C:\\Users\\host\\Desktop")));

        imageFileChooser.setDialogTitle("Choose photo....");
        //Only choose "png","jpg","jpeg" files
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        imageFileChooser.setFileFilter(fnef);
        if (imageChooser == JFileChooser.APPROVE_OPTION) {
            File selectedFile = imageFileChooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
            //String imageFilePath = imageFile.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(filename);
            //Resize image to fit jlabel.
            Image img = imageIcon.getImage().getScaledInstance(jLabel_PROFILE.getWidth(), jLabel_PROFILE.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon resizedImageIcon = new ImageIcon(img);
            //Display image on jlabel
            jLabel_PROFILE.setIcon(resizedImageIcon);
            //Display name in a textbox
            //jTextField1.setText(filename);

            try {
                File photo = new File(filename);
                FileInputStream fis = new FileInputStream(photo);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);

                }
                member_image = bos.toByteArray();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_UPLOAD_PICTURE_ActionPerformed

    private void jButton_REMOVE_PICTUREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REMOVE_PICTUREActionPerformed
        // TODO add your handling code here:
        jLabel_PROFILE.setIcon(null);
    }//GEN-LAST:event_jButton_REMOVE_PICTUREActionPerformed

    private void jComboBox_GROUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GROUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_GROUPActionPerformed

    private void jTextField_MNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MNActionPerformed

    private void jTextField_VILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_VILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VILActionPerformed

    private void jTextField_PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PHONEActionPerformed

    private void jTextField_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EMActionPerformed

    private void jComboBox_GENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GENDERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_GENDERActionPerformed

    private void jButton_NEW_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEW_ActionPerformed
        // TODO add your handling code here:
        ClearAllInputFields();
        MSearchPanel.setVisible(false);
    }//GEN-LAST:event_jButton_NEW_ActionPerformed

    private void jButton_ADD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_ActionPerformed
        // TODO add your handling code here:
        String father = jTextField_FATHER.getText();
        String mother = jTextField_MOTHER.getText();
        Object sacramental = jComboBox_SACRAMENTAL.getSelectedItem();
        Object mGroup = jComboBox_GROUP.getSelectedItem();
        Object mAssign = jComboBox_ASSIGNMENT.getSelectedItem();
        String sname = jTextField_SN.getText();
        String mname = jTextField_MN.getText();
        String fname = jTextField_FN.getText();
        Object gender = jComboBox_GENDER.getSelectedItem();
        String village = jTextField_VIL.getText();
        String phone = jTextField_PHONE.getText();
        Object marital = jComboBox_MARITAL.getSelectedItem();
        String occupation = jTextField_OCC.getText();
        String email = jTextField_EM.getText();
        String residence = jTextField_RES.getText();
        String church = jTextField_CN.getText();

        if (jDateChooser_DOB.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            dob = dateformat.format(jDateChooser_DOB.getDate());
        }
        if (jDateChooser_YOA.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            yrofAdm = dateformat.format(jDateChooser_YOA.getDate());
        }

        if (father.equals("")) {
            JOptionPane.showMessageDialog(null, "Add Father name");
        } else if (mother.equals("")) {
            JOptionPane.showMessageDialog(null, "Add Mother name");
        } else if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "First name field cannot be empty");
        } else if (sname.equals("")) {
            JOptionPane.showMessageDialog(null, "Surname field cannot be empty");
        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select gender");
        } else if (church.equals("")) {
            JOptionPane.showMessageDialog(null, "Please add church name");
        }

        PreparedStatement pst;
        String query = "INSERT INTO `members`(`FIRST_NAME`,`MIDDLE_NAME`,`SURNAME`,`GENDER`,`DOB`,`VILLAGE`,`PHONE_NO`,`MARITAL_STATUS`,`OCCUPATION`,`EMAIL`,`PLACE_OF_RESIDENCE`,`ADMISSION_DATE`,`SACRAMENTAL_STATUS`,`FATHER_NAME`,`MOTHER_NAME`,`MEMBER_GROUP`,`MEMBER_ASSIGNMENT`,`CHURCH_NAME`,`MEMBER_IMAGE`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            pst = CmsConnection.getConnection().prepareStatement(query);

            pst.setString(1, fname);
            pst.setString(2, mname);
            pst.setString(3, sname);
            pst.setString(4, (String) gender);
            pst.setString(5, dob);
            pst.setString(6, village);
            pst.setString(7, phone);
            pst.setString(8, (String) marital);
            pst.setString(9, occupation);
            pst.setString(10, email);
            pst.setString(11, residence);
            pst.setString(12, yrofAdm);
            pst.setString(13, (String) sacramental);
            pst.setString(14, father);
            pst.setString(15, mother);
            pst.setString(16, (String) mGroup);
            pst.setString(17, (String) mAssign);
            pst.setString(18, church);
            pst.setBytes(19, member_image);

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New member added");
            }
            ClearAllInputFields();
            scaleProfile();

            //Refresh JTable after adding new entry to database.
        } catch (SQLException ex) {
            Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ADD_ActionPerformed

    private void jButton_UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_ActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst;
        String UpdateSQLQuery = "UPDATE `members` SET `FIRST_NAME`=?,`MIDDLE_NAME`=?,`SURNAME`=?,`GENDER`=?,`DOB`=?,`VILLAGE`=?,`PHONE_NO`=?,`MARITAL_STATUS`=?,`OCCUPATION`=?,`EMAIL`=?,`PLACE_OF_RESIDENCE`=?,`ADMISSION_DATE`=?,`SACRAMENTAL_STATUS`=?,`FATHER_NAME`=?,`MOTHER_NAME`=?,`MEMBER_GROUP`=?,`MEMBER_ASSIGNMENT`=?,`CHURCH_NAME`=?,`MEMBER_IMAGE`= ?";

        String father = jTextField_FATHER.getText();
        String mother = jTextField_MOTHER.getText();
        Object sacramental = jComboBox_SACRAMENTAL.getSelectedItem();
        Object mGroup = jComboBox_GROUP.getSelectedItem();
        Object mAssign = jComboBox_ASSIGNMENT.getSelectedItem();
        String sname = jTextField_SN.getText();
        String mname = jTextField_MN.getText();
        String fname = jTextField_FN.getText();
        Object gender = jComboBox_GENDER.getSelectedItem();
        String village = jTextField_VIL.getText();
        String phone = jTextField_PHONE.getText();
        Object marital = jComboBox_MARITAL.getSelectedItem();
        String occupation = jTextField_OCC.getText();
        String email = jTextField_EM.getText();
        String residence = jTextField_RES.getText();
        String church = jTextField_CN.getText();

        if (jDateChooser_DOB.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            dob = dateformat.format(jDateChooser_DOB.getDate());
        }
        if (jDateChooser_YOA.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            yrofAdm = dateformat.format(jDateChooser_YOA.getDate());
        }

        //File imageFile = new File(filename);
        try {
            // InputStream prof = new FileInputStream(imageFile);
            pst = CmsConnection.getConnection().prepareStatement(UpdateSQLQuery);

            //ps.setInt(0, Integer.parseInt(member_id));
            pst.setString(1, fname);
            pst.setString(2, mname);
            pst.setString(3, sname);
            pst.setString(4, (String) gender);
            pst.setString(5, dob);
            pst.setString(6, village);
            pst.setString(7, phone);
            pst.setString(8, (String) marital);
            pst.setString(9, occupation);
            pst.setString(10, email);
            pst.setString(11, residence);
            pst.setString(12, yrofAdm);
            pst.setString(13, (String) sacramental);
            pst.setString(14, father);
            pst.setString(15, mother);
            pst.setString(16, (String) mGroup);
            pst.setString(17, (String) mAssign);
            pst.setString(18, church);
            pst.setBytes(19, member_image);

            int userUpdated = pst.executeUpdate();
            if (userUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Member Updated!");
                //Clear input fields
                ClearAllInputFields();
                scaleProfile();
                //Refresh JTable
                //populateJTableFromDatabase();

            }

        } catch (SQLException | NumberFormatException | HeadlessException ex) {
            Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UPDATE_ActionPerformed

    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed
        // TODO add your handling code here:
        MSearchPanel.setVisible(true);
        ClearSearchFields();
    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    private void jButton_CLEAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLEAR_ActionPerformed
        // TODO add your handling code here:
        ClearAllInputFields();
        scaleProfile();
    }//GEN-LAST:event_jButton_CLEAR_ActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_MIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_MIDMouseReleased
        // TODO add your handling code here:
        searchID();
    }//GEN-LAST:event_jTextField_MIDMouseReleased

    private void jTextField_MIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MIDActionPerformed

    private void jTextField_MIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MIDKeyReleased
        // TODO add your handling code here:
        searchID();
    }//GEN-LAST:event_jTextField_MIDKeyReleased

    private void jTextField_MPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MPNActionPerformed

    private void jTextField_MPNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MPNKeyReleased
        // TODO add your handling code here:
        seachPhone();
    }//GEN-LAST:event_jTextField_MPNKeyReleased

    private void jTextField_MPNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_MPNMouseReleased
        // TODO add your handling code here:
        seachPhone();
    }//GEN-LAST:event_jTextField_MPNMouseReleased

    private void jTextField_MFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MFNActionPerformed

    private void jTextField_MFNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MFNKeyReleased
        // TODO add your handling code here:
        searchFname();
    }//GEN-LAST:event_jTextField_MFNKeyReleased

    private void jTextField_MFNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_MFNMouseReleased
        // TODO add your handling code here:
        searchFname();
    }//GEN-LAST:event_jTextField_MFNMouseReleased

    private void jLabel_LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LOGOUTMouseClicked
        // TODO add your handling code here:
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        
         this.dispose();
    }//GEN-LAST:event_jLabel_LOGOUTMouseClicked

    private void jButton_IMPORT_MEMBERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IMPORT_MEMBERSActionPerformed
        // TODO add your handling code here:

        members.setVisible(true);
        MSearchPanel.setVisible(false);
        members.setDefaultCloseOperation(UserForm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_IMPORT_MEMBERSActionPerformed

    private void jButton_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACKActionPerformed
         MenuForm mf = new MenuForm();
        mf.setVisible(true);
        mf.pack();
        //mf.setLocationRelativeTo(null);
        mf.setLocationRelativeTo(mf);
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
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MSearchPanel;
    private javax.swing.JButton jButton_ADD_;
    private javax.swing.JButton jButton_BACK;
    private javax.swing.JButton jButton_CLEAR_;
    private javax.swing.JButton jButton_IMPORT_MEMBERS;
    private javax.swing.JButton jButton_NEW_;
    private javax.swing.JButton jButton_REMOVE_PICTURE;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JButton jButton_UPDATE_;
    private javax.swing.JButton jButton_UPLOAD_PICTURE_;
    private javax.swing.JComboBox jComboBox_ASSIGNMENT;
    private javax.swing.JComboBox jComboBox_GENDER;
    private javax.swing.JComboBox jComboBox_GROUP;
    private javax.swing.JComboBox jComboBox_MARITAL;
    private javax.swing.JComboBox jComboBox_SACRAMENTAL;
    private com.toedter.calendar.JDateChooser jDateChooser_DOB;
    private com.toedter.calendar.JDateChooser jDateChooser_YOA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DATE;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JLabel jLabel_LOGOUT;
    private javax.swing.JLabel jLabel_PROFILE;
    private javax.swing.JLabel jLabel_TIME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_CN;
    private javax.swing.JTextField jTextField_CUSER;
    private javax.swing.JTextField jTextField_EM;
    private javax.swing.JTextField jTextField_FATHER;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_FNME;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_MFN;
    private javax.swing.JTextField jTextField_MID;
    private javax.swing.JTextField jTextField_MN;
    private javax.swing.JTextField jTextField_MOTHER;
    private javax.swing.JTextField jTextField_MPN;
    private javax.swing.JTextField jTextField_OCC;
    private javax.swing.JTextField jTextField_PHONE;
    private javax.swing.JTextField jTextField_RES;
    private javax.swing.JTextField jTextField_SN;
    private javax.swing.JTextField jTextField_VIL;
    // End of variables declaration//GEN-END:variables

    private void ClearAllInputFields() {
        jTextField_FATHER.setText("");
        jTextField_MOTHER.setText("");
        jComboBox_GENDER.setSelectedIndex(0);
        jComboBox_SACRAMENTAL.setSelectedIndex(0);
        jTextField_VIL.setText("");
        jTextField_PHONE.setText("");
        jComboBox_MARITAL.setSelectedIndex(0);
        jComboBox_GROUP.setSelectedIndex(0);
        jComboBox_ASSIGNMENT.setSelectedIndex(0);
        jTextField_OCC.setText("");
        jTextField_EM.setText("");
        jTextField_RES.setText("");
        jTextField_FN.setText("");
        jTextField_MN.setText("");
        jTextField_SN.setText("");
        jTextField_CN.setText("");
        jDateChooser_DOB.setDate(null);
        jDateChooser_YOA.setDate(null);
        jTextField_FNME.setText("");
        jLabel_PROFILE.setIcon(null);
        jTextField_ID.setText("");

    }

    private void ClearSearchFields() {
        jTextField_MID.setText("");
        jTextField_MPN.setText("");
        jTextField_MFN.setText("");

    }

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

    private void searchID() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where MEMBER_ID = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_MID.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("MEMBER_ID"));
                jTextField_FATHER.setText(rs.getString("FATHER_NAME"));
                jTextField_MOTHER.setText(rs.getString("MOTHER_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jComboBox_SACRAMENTAL.setSelectedItem(rs.getString("SACRAMENTAL_STATUS"));
                jTextField_VIL.setText(rs.getString("VILLAGE"));
                jTextField_PHONE.setText(rs.getString("PHONE_NO"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));
                jComboBox_MARITAL.setSelectedItem(rs.getString("MARITAL_STATUS"));
                jTextField_OCC.setText(rs.getString("OCCUPATION"));
                jTextField_EM.setText(rs.getString("EMAIL"));
                jTextField_RES.setText(rs.getString("PLACE_OF_RESIDENCE"));
                jComboBox_GROUP.setSelectedItem(rs.getString("MEMBER_GROUP"));
                jComboBox_ASSIGNMENT.setSelectedItem(rs.getString("MEMBER_ASSIGNMENT"));
                jTextField_FNME.setText(rs.getString("FIRST_NAME" + "SURNAME"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_MN.setText(rs.getString("MIDDLE_NAME"));
                jTextField_SN.setText(rs.getString("SURNAME"));
                jDateChooser_DOB.setDate(rs.getDate("DOB"));
                jDateChooser_YOA.setDate(rs.getDate("ADMISSION_DATE"));

                if (rs.getBytes("MEMBER_IMAGE") == null) {
                    jLabel_PROFILE.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("MEMBER_IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PROFILE.getWidth(), jLabel_PROFILE.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PROFILE.setIcon(imageIcon);
                    member_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void seachPhone() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where PHONE_NO = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(2, jTextField_MPN.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("MEMBER_ID"));
                jTextField_FATHER.setText(rs.getString("FATHER_NAME"));
                jTextField_MOTHER.setText(rs.getString("MOTHER_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jComboBox_SACRAMENTAL.setSelectedItem(rs.getString("SACRAMENTAL_STATUS"));
                jTextField_VIL.setText(rs.getString("VILLAGE"));
                jTextField_PHONE.setText(rs.getString("PHONE_NO"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));
                jComboBox_MARITAL.setSelectedItem(rs.getString("MARITAL_STATUS"));
                jTextField_OCC.setText(rs.getString("OCCUPATION"));
                jTextField_EM.setText(rs.getString("EMAIL"));
                jTextField_RES.setText(rs.getString("PLACE_OF_RESIDENCE"));
                jComboBox_GROUP.setSelectedItem(rs.getString("MEMBER_GROUP"));
                jComboBox_ASSIGNMENT.setSelectedItem(rs.getString("MEMBER_ASSIGNMENT"));
                jTextField_FNME.setText(rs.getString("FIRST_NAME" + "SURNAME"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_MN.setText(rs.getString("MIDDLE_NAME"));
                jTextField_SN.setText(rs.getString("SURNAME"));
                jDateChooser_DOB.setDate(rs.getDate("DOB"));
                jDateChooser_YOA.setDate(rs.getDate("ADMISSION_DATE"));

                if (rs.getBytes("MEMBER_IMAGE") == null) {
                    jLabel_PROFILE.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("MEMBER_IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PROFILE.getWidth(), jLabel_PROFILE.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PROFILE.setIcon(imageIcon);
                    member_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchFname() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where FIRST_NAME = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_MFN.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("MEMBER_ID"));
                jTextField_FATHER.setText(rs.getString("FATHER_NAME"));
                jTextField_MOTHER.setText(rs.getString("MOTHER_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jComboBox_SACRAMENTAL.setSelectedItem(rs.getString("SACRAMENTAL_STATUS"));
                jTextField_VIL.setText(rs.getString("VILLAGE"));
                jTextField_PHONE.setText(rs.getString("PHONE_NO"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));
                jComboBox_MARITAL.setSelectedItem(rs.getString("MARITAL_STATUS"));
                jTextField_OCC.setText(rs.getString("OCCUPATION"));
                jTextField_EM.setText(rs.getString("EMAIL"));
                jTextField_RES.setText(rs.getString("PLACE_OF_RESIDENCE"));
                jComboBox_GROUP.setSelectedItem(rs.getString("MEMBER_GROUP"));
                jComboBox_ASSIGNMENT.setSelectedItem(rs.getString("MEMBER_ASSIGNMENT"));
                jTextField_FNME.setText(rs.getString("FIRST_NAME" + "SURNAME"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_MN.setText(rs.getString("MIDDLE_NAME"));
                jTextField_SN.setText(rs.getString("SURNAME"));
                jDateChooser_DOB.setDate(rs.getDate("DOB"));
                jDateChooser_YOA.setDate(rs.getDate("ADMISSION_DATE"));

                if (rs.getBytes("MEMBER_IMAGE") == null) {
                    jLabel_PROFILE.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("MEMBER_IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PROFILE.getWidth(), jLabel_PROFILE.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PROFILE.setIcon(imageIcon);
                    member_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
