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
import java.sql.Statement;
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
public class UserForm extends javax.swing.JFrame implements Runnable {

    String address = "";
    String cname = "";
    String fname = "";
    String gender = "";
    String lname = "";
    String pass = "";
    String phone = "";
    String role = "";
    String uname = "";
    String user_id = "";

    int hour, second, minute;
    int day, month, year;

    /**
     * Creates new form UserForm
     */
    public UserForm() {
        initComponents();
        SearchPanel.setVisible(false);
        Thread t = new Thread(this);
        t.start();
        scaleIcon1();
        scaleIcon2();
        scaleProfile();
        jTextField_CUSER.setText(String.valueOf(CurrentUser.currentUser));
    }

    UserDataImport users = new UserDataImport();
    String filename = null;
    byte[] user_image = null;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

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
        Image imgScale = img.getScaledInstance(jLabel_PHOTO.getWidth(), jLabel_PHOTO.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledProfile = new ImageIcon(imgScale);
        jLabel_PHOTO.setIcon(scaledProfile);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jTextField_PASS = new javax.swing.JTextField();
        jComboBox_ROLE = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jTextField_LN = new javax.swing.JTextField();
        jTextField_PN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ADDRESS = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jTextField_CN = new javax.swing.JTextField();
        jComboBox_GENDER = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jButton_ADD_ = new javax.swing.JButton();
        jButton_NEW_ = new javax.swing.JButton();
        jButton_UPDATE_ = new javax.swing.JButton();
        jButton_SEARCH_ = new javax.swing.JButton();
        jButton_IMPORT_USERS = new javax.swing.JButton();
        jButton_CLEAR_ = new javax.swing.JButton();
        SearchPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_UID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField_PNN = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField_Fname = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_CUSER = new javax.swing.JTextField();
        jLabel_LOGOUT = new javax.swing.JLabel();
        jLabel_ICON1 = new javax.swing.JLabel();
        jLabel_ICON2 = new javax.swing.JLabel();
        jLabel_FNME = new javax.swing.JLabel();
        jButton_UPLOAD_ = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel_PHOTO = new javax.swing.JLabel();
        jLabel_DATE = new javax.swing.JLabel();
        jLabel_TIME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 232));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 116, 169));
        jLabel3.setText(" Login Information");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel5.setText(" Username");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setText(" Password");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel7.setText(" Role");

        jTextField_UN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_PASS.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jComboBox_ROLE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox_ROLE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Head Rev. Father", "Associate Rev. Father", "Chairperson", "Secretary", "V. Chairperson", "Catechist", "Treasurer" }));
        jComboBox_ROLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ROLEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_UN)
                    .addComponent(jTextField_PASS)
                    .addComponent(jComboBox_ROLE, 0, 178, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_ROLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 116, 169));
        jLabel8.setText(" Personl Information");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel9.setText(" First Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel10.setText(" Last Name");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel11.setText(" Gender");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel12.setText(" Phone No.");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel13.setText(" Address");

        jTextField_FN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_LN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextField_PN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jTextArea_ADDRESS.setColumns(20);
        jTextArea_ADDRESS.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea_ADDRESS.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ADDRESS);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel15.setText(" Church Name");

        jTextField_CN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jComboBox_GENDER.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox_GENDER.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_PN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jTextField_CN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_FN)
                    .addComponent(jComboBox_GENDER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox_GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_PN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_CN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_ADD_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_ADD_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_ADD_.setForeground(new java.awt.Color(0, 230, 64));
        jButton_ADD_.setText("Add User");
        jButton_ADD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_ActionPerformed(evt);
            }
        });

        jButton_NEW_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_NEW_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_NEW_.setForeground(new java.awt.Color(0, 177, 106));
        jButton_NEW_.setText("New User");
        jButton_NEW_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEW_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_UPDATE_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_UPDATE_.setForeground(new java.awt.Color(46, 204, 113));
        jButton_UPDATE_.setText("Update User");
        jButton_UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_ActionPerformed(evt);
            }
        });

        jButton_SEARCH_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_SEARCH_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_SEARCH_.setForeground(new java.awt.Color(58, 83, 155));
        jButton_SEARCH_.setText("Search User");
        jButton_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCH_ActionPerformed(evt);
            }
        });

        jButton_IMPORT_USERS.setBackground(new java.awt.Color(228, 241, 254));
        jButton_IMPORT_USERS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_IMPORT_USERS.setForeground(new java.awt.Color(77, 19, 209));
        jButton_IMPORT_USERS.setText("Import(Excel)");
        jButton_IMPORT_USERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IMPORT_USERSActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ADD_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UPDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton_NEW_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_IMPORT_USERS)
                    .addComponent(jButton_CLEAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ADD_)
                    .addComponent(jButton_NEW_)
                    .addComponent(jButton_IMPORT_USERS))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_UPDATE_)
                    .addComponent(jButton_SEARCH_)
                    .addComponent(jButton_CLEAR_))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        SearchPanel.setBackground(new java.awt.Color(102, 102, 102));
        SearchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("Search");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setText("User ID");

        jTextField_UID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_UID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_UIDMouseReleased(evt);
            }
        });
        jTextField_UID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UIDActionPerformed(evt);
            }
        });
        jTextField_UID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_UIDKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("Phone No.");

        jTextField_PNN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_PNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_PNNMouseReleased(evt);
            }
        });
        jTextField_PNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PNNActionPerformed(evt);
            }
        });
        jTextField_PNN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_PNNKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setText("First Name");

        jTextField_Fname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_Fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_FnameMouseReleased(evt);
            }
        });
        jTextField_Fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FnameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel18))
                            .addGroup(SearchPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_UID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_PNN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(SearchPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)))
                                    .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_UID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_PNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(31, 58, 147));
        jLabel21.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 37, 42));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Current User:");

        jTextField_CUSER.setBackground(new java.awt.Color(228, 241, 254));
        jTextField_CUSER.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField_CUSER.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_CUSER.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel_LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_LOGOUT.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_LOGOUT.setText("   Logout");
        jLabel_LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LOGOUT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_ICON1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jLabel_ICON2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel_FNME.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jButton_UPLOAD_.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton_UPLOAD_.setForeground(new java.awt.Color(0, 153, 153));
        jButton_UPLOAD_.setText("Upload Photo");
        jButton_UPLOAD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPLOAD_ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 102));
        jButton2.setText("No Photo");
        jButton2.setMaximumSize(new java.awt.Dimension(101, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(101, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(101, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel_PHOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jLabel_PHOTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_PHOTO.setMaximumSize(new java.awt.Dimension(208, 210));
        jLabel_PHOTO.setMinimumSize(new java.awt.Dimension(208, 210));
        jLabel_PHOTO.setPreferredSize(new java.awt.Dimension(208, 210));

        jLabel_DATE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_DATE.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_DATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_TIME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_TIME.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_TIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER ID:");

        jTextField_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_BACK.setFont(new java.awt.Font("Sitka Display", 1, 13)); // NOI18N
        jButton_BACK.setForeground(new java.awt.Color(31, 58, 147));
        jButton_BACK.setText("Back To Menu");
        jButton_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jLabel_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_UPLOAD_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_PHOTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_FNME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 56, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_FNME, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_PHOTO, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton_UPLOAD_)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_TIME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_DATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BACK)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ADD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_ActionPerformed
        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        Object gender = jComboBox_GENDER.getSelectedItem();
        String phone = jTextField_PN.getText();
        String address = jTextArea_ADDRESS.getText();
        String cname = jTextField_CN.getText();
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jTextField_PASS.getText());
        Object role = jComboBox_ROLE.getSelectedItem();
        //String photoPath = jTextField1.getText();

        if (uname.equals("")) {
            JOptionPane.showMessageDialog(null, "Add Username");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a Password");
        } else if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "First name cannot be empty");
        } else if (lname.equals("")) {
            JOptionPane.showMessageDialog(null, "Last name cannot be empty");
        } else if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Please add phone number");
        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select gender");
        } else if (cname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please add church name");
        } else if (checkUsername(uname)) {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }

        PreparedStatement ps;
        String query = "INSERT INTO `users` (`USERNAME`,`PASSWORD`,`ROLE`,`FIRST_NAME`,`LAST_NAME`,`GENDER`,`PHONE_NO`,`ADDRESS`,`CHURCH_NAME`,`IMAGE`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        // File imageFile = new File(filename);

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps = CmsConnection.getConnection().prepareStatement(query);

            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, (String) role);
            ps.setString(4, fname);
            ps.setString(5, lname);
            ps.setString(6, (String) gender);
            ps.setString(7, phone);
            ps.setString(8, address);
            ps.setString(9, cname);

            //FileInputStream img = new FileInputStream(new File(filename));
            // ps.setBlob(10, img);
            ps.setBytes(10, user_image);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New User Added");
            }
            ClearAllInputFields();

            //Refresh JTable after adding new entry to database.
        } catch (SQLException | HeadlessException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ADD_ActionPerformed

    private void jButton_UPLOAD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPLOAD_ActionPerformed
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
            Image img = imageIcon.getImage().getScaledInstance(jLabel_PHOTO.getWidth(), jLabel_PHOTO.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon resizedImageIcon = new ImageIcon(img);
            //Display image on jlabel
            jLabel_PHOTO.setIcon(resizedImageIcon);
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
                user_image = bos.toByteArray();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_UPLOAD_ActionPerformed

    private void jButton_UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_ActionPerformed

        PreparedStatement ps;
        String UpdateSQLQuery = "UPDATE `users` SET `USERNAME` = ?,`PASSWORD` = ?,`ROLE` = ?,`FIRST_NAME` = ?,`LAST_NAME` = ?,`GENDER` = ?,`PHONE_NO` = ?,`ADDRESS` = ?,`CHURCH_NAME` = ?,`IMAGE` = ?WHERE `USER_ID` = ?";

        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        Object gender = jComboBox_GENDER.getSelectedItem();
        String phone = jTextField_PN.getText();
        String address = jTextArea_ADDRESS.getText();
        String cname = jTextField_CN.getText();
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jTextField_PASS.getText());
        Object role = jComboBox_ROLE.getSelectedItem();
            //String photoPath = jTextField1.getText();

        //File imageFile = new File(filename);
        try {
            // InputStream prof = new FileInputStream(imageFile);
            ps = CmsConnection.getConnection().prepareStatement(UpdateSQLQuery);

            //ps.setInt(0, Integer.parseInt(user_id));
            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, (String) role);
            ps.setString(4, fname);
            ps.setString(5, lname);
            ps.setString(6, (String) gender);
            ps.setInt(7, Integer.parseInt(phone));
            ps.setString(8, address);
            ps.setString(9, cname);

            ps.setBytes(10, user_image);

            int userUpdated = ps.executeUpdate();
            if (userUpdated > 0) {
                JOptionPane.showMessageDialog(null, "User Updated!");
                //Clear input fields
                ClearAllInputFields();
                scaleProfile();
                //Refresh JTable
                //populateJTableFromDatabase();

            }

        } catch (SQLException | NumberFormatException | HeadlessException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UPDATE_ActionPerformed

    private void jButton_CLEAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CLEAR_ActionPerformed
        // TODO add your handling code here:
        ClearAllInputFields();
        scaleProfile();
        SearchPanel.setVisible(false);

    }//GEN-LAST:event_jButton_CLEAR_ActionPerformed

    private void jComboBox_ROLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ROLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_ROLEActionPerformed

    private void jButton_IMPORT_USERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IMPORT_USERSActionPerformed
        // TODO add your handling code here:
        users.setVisible(true);
        SearchPanel.setVisible(false);
        users.setDefaultCloseOperation(UserForm.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_IMPORT_USERSActionPerformed

    private void jButton_NEW_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEW_ActionPerformed
        // TODO add your handling code here:
        ClearAllInputFields();
        scaleProfile();
        SearchPanel.setVisible(false);
    }//GEN-LAST:event_jButton_NEW_ActionPerformed

    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed
        // TODO add your handling code here:
        SearchPanel.setVisible(true);
        ClearSearchFields();


    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabel_PHOTO.setIcon(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_UIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UIDKeyReleased
        // TODO add your handling code here
        searchID();

    }//GEN-LAST:event_jTextField_UIDKeyReleased

    private void jTextField_PNNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PNNKeyReleased
        // TODO add your handling code here:
        seachPhone();

    }//GEN-LAST:event_jTextField_PNNKeyReleased

    private void jTextField_PNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PNNActionPerformed

    private void jTextField_UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UIDActionPerformed

    private void jTextField_UIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_UIDMouseReleased
        // TODO add your handling code here:
        searchID();
    }//GEN-LAST:event_jTextField_UIDMouseReleased

    private void jTextField_PNNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_PNNMouseReleased
        // TODO add your handling code here:
        seachPhone();
    }//GEN-LAST:event_jTextField_PNNMouseReleased

    private void jTextField_FnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FnameKeyReleased
        // TODO add your handling code here:
        searchFname();
    }//GEN-LAST:event_jTextField_FnameKeyReleased

    private void jTextField_FnameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_FnameMouseReleased
        // TODO add your handling code here:
        searchFname();
    }//GEN-LAST:event_jTextField_FnameMouseReleased

    private void jLabel_LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LOGOUTMouseClicked
        // TODO add your handling code here:
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        
         this.dispose();
    }//GEN-LAST:event_jLabel_LOGOUTMouseClicked

    private void jButton_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACKActionPerformed
        MenuForm mf = new MenuForm();
        mf.setVisible(true);
        mf.pack();
        //mf.setLocationRelativeTo(null);
        mf.setLocationRelativeTo(mf);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jButton_BACKActionPerformed

    //function to check if the username already exist
    public boolean checkUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;

        String query = "SELECT * FROM `users` WHERE `USERNAME`=?";

        try {
            ps = CmsConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_ADD_;
    private javax.swing.JButton jButton_BACK;
    private javax.swing.JButton jButton_CLEAR_;
    private javax.swing.JButton jButton_IMPORT_USERS;
    private javax.swing.JButton jButton_NEW_;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JButton jButton_UPDATE_;
    private javax.swing.JButton jButton_UPLOAD_;
    private javax.swing.JComboBox jComboBox_GENDER;
    private javax.swing.JComboBox jComboBox_ROLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_DATE;
    private javax.swing.JLabel jLabel_FNME;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JLabel jLabel_LOGOUT;
    private javax.swing.JLabel jLabel_PHOTO;
    private javax.swing.JLabel jLabel_TIME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ADDRESS;
    private javax.swing.JTextField jTextField_CN;
    private javax.swing.JTextField jTextField_CUSER;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_Fname;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_PASS;
    private javax.swing.JTextField jTextField_PN;
    private javax.swing.JTextField jTextField_PNN;
    private javax.swing.JTextField jTextField_UID;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables
   //byte[] photo = null;
    // String filename = null;

    private void ClearAllInputFields() {
        jTextField_FN.setText("");
        jTextField_LN.setText("");
        jComboBox_GENDER.setSelectedIndex(0);
        jTextField_PN.setText("");
        jTextArea_ADDRESS.setText("");
        jTextField_CN.setText("");
        jTextField_ID.setText("");
        jTextField_UN.setText("");
        jTextField_PASS.setText("");
        jComboBox_ROLE.setSelectedIndex(0);
        //jTextField1.setText("");
        jLabel_PHOTO.setIcon(null);

    }

    private void ClearSearchFields() {
        jTextField_UID.setText("");
        jTextField_PNN.setText("");
        jTextField_Fname.setText("");

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
            String sql = "Select * from users where USER_ID = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_UID.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("USER_ID"));
                jTextField_UN.setText(rs.getString("USERNAME"));
                jTextField_PASS.setText(rs.getString("PASSWORD"));
                jComboBox_ROLE.setSelectedItem(rs.getString("ROLE"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_LN.setText(rs.getString("LAST_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jTextField_PN.setText(rs.getString("PHONE_NO"));
                jTextArea_ADDRESS.setText(rs.getString("ADDRESS"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));

                if (rs.getBytes("IMAGE") == null) {
                    jLabel_PHOTO.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PHOTO.getWidth(), jLabel_PHOTO.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PHOTO.setIcon(imageIcon);
                    user_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void seachPhone() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from users where PHONE_NO = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_PNN.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("USER_ID"));
                jTextField_UN.setText(rs.getString("USERNAME"));
                jTextField_PASS.setText(rs.getString("PASSWORD"));
                jComboBox_ROLE.setSelectedItem(rs.getString("ROLE"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_LN.setText(rs.getString("LAST_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jTextField_PN.setText(rs.getString("PHONE_NO"));
                jTextArea_ADDRESS.setText(rs.getString("ADDRESS"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));

                if (rs.getBytes("IMAGE") == null) {
                    jLabel_PHOTO.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PHOTO.getWidth(), jLabel_PHOTO.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PHOTO.setIcon(imageIcon);
                    user_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchFname() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from users where FIRST_NAME = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_Fname.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("USER_ID"));
                jTextField_UN.setText(rs.getString("USERNAME"));
                jTextField_PASS.setText(rs.getString("PASSWORD"));
                jComboBox_ROLE.setSelectedItem(rs.getString("ROLE"));
                jTextField_FN.setText(rs.getString("FIRST_NAME"));
                jTextField_LN.setText(rs.getString("LAST_NAME"));
                jComboBox_GENDER.setSelectedItem(rs.getString("GENDER"));
                jTextField_PN.setText(rs.getString("PHONE_NO"));
                jTextArea_ADDRESS.setText(rs.getString("ADDRESS"));
                jTextField_CN.setText(rs.getString("CHURCH_NAME"));

                if (rs.getBytes("IMAGE") == null) {
                    jLabel_PHOTO.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_PHOTO.getWidth(), jLabel_PHOTO.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_PHOTO.setIcon(imageIcon);
                    user_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
