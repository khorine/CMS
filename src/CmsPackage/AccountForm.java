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

/**
 *
 * @author Horine
 */
public class AccountForm extends javax.swing.JFrame implements Runnable {

    String curDate;
    String receivedDate;
    String payDate;
    String member_id;
    String member_name;
    Object acc_type;
    String currentAm;
    String cname;
    Object env_type;
    String envAmount;
    String cName;
    Object accTy;
    String curPay;
    String donDate;
    String mName;
    String church_Name;
    Object donation;
    String amount_item;
    String dateDon;
    String FName;
    String contact;
    String address;
    Object don;
    String item_amount;
    String gDondate;
    String gname;
    String members;
    Object gdon;
    String items_amount;
    int hour, second, minute;
    int day, month, year;

    public AccountForm() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
        scaleIcon1();
        scaleIcon2();
        jTextField_CUSER.setText(String.valueOf(CurrentUser.currentUser));
    }
    byte[] member_image = null;

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel_LOGOUT = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField_CUSER = new javax.swing.JTextField();
        jLabel_ICON1 = new javax.swing.JLabel();
        jLabel_ICON2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_ACC_TYPE = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_NAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_CUR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser_DATE = new com.toedter.calendar.JDateChooser();
        jLabel_MEMBER_PICTURE = new javax.swing.JLabel();
        jButton_UPDATE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Ctime = new javax.swing.JLabel();
        jLabel_Cdate = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField_FULL_NAME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_CName = new javax.swing.JTextField();
        jButton_BACK = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_ENVELOPE_TYPE = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jTextField_CHURCH = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField_AMOUNT_ = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jDateChooser_T_DATE = new com.toedter.calendar.JDateChooser();
        jButton_UPDATE_ = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel_CTime = new javax.swing.JLabel();
        jLabel_CDate = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox_MEMBER = new javax.swing.JCheckBox();
        jCheckBox_NON_MEMBER = new javax.swing.JCheckBox();
        jCheckBox_GROUP = new javax.swing.JCheckBox();
        memberPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField_MFN = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField_MNAME = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jDateChooser_DDATE = new com.toedter.calendar.JDateChooser();
        jTextField_CNAME = new javax.swing.JTextField();
        jTextField_ITEM_AMOUNT = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jButton_MDUPDATE = new javax.swing.JButton();
        non_memberPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_FNAME = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_CONTACT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser_DATE_D = new com.toedter.calendar.JDateChooser();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField_AMOUNT_ITEM = new javax.swing.JTextField();
        jButton_NON_M_UPDATE = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField_ADDRESS = new javax.swing.JTextField();
        groupPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_GNAME = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_MEMBERS = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser_D_DATE = new com.toedter.calendar.JDateChooser();
        jComboBox = new javax.swing.JComboBox();
        jTextField_ITEMS_AMOUNT = new javax.swing.JTextField();
        jButton_G_UPDATE = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel_CTIME_ = new javax.swing.JLabel();
        jLabel_CDATE_ = new javax.swing.JLabel();
        jLabel_TIME = new javax.swing.JLabel();
        jLabel_DATE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_TYPE = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_CURPAY = new javax.swing.JTextField();
        jButton_CHURCH_ACCOUNT_UPDATE = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField_Cname = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel_CTIME = new javax.swing.JLabel();
        jLabel_CDATE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(31, 58, 147));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 750));

        jLabel_LOGOUT.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_LOGOUT.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel_LOGOUT.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_LOGOUT.setText("   Logout");
        jLabel_LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LOGOUTMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(31, 58, 147));
        jLabel24.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(36, 37, 42));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Current User:");

        jTextField_CUSER.setBackground(new java.awt.Color(228, 241, 254));
        jTextField_CUSER.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField_CUSER.setForeground(new java.awt.Color(36, 37, 42));
        jTextField_CUSER.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField_CUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_LOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ICON2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 750));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(900, 630));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel1.setText("           MEMBER ACCOUNT TYPE");

        jComboBox_ACC_TYPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Annual  Contribution ", "Family Day", "Service Offered (Mass)", "Project Contribution", "Other", " " }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" MEMBER ID");

        jTextField_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("          SEARCH MEMBER NAME");

        jTextField_NAME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_NAMEMouseReleased(evt);
            }
        });
        jTextField_NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_NAMEKeyReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField_CUR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("             TRANSACTION DATE");

        jDateChooser_DATE.setDateFormatString("d MMM yyyy");

        jLabel_MEMBER_PICTURE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_MEMBER_PICTURE.setEnabled(false);

        jButton_UPDATE.setBackground(new java.awt.Color(228, 241, 254));
        jButton_UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_UPDATE.setForeground(new java.awt.Color(0, 230, 64));
        jButton_UPDATE.setText("SAVE");
        jButton_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PAYMENT (KSh.)");

        jLabel_Ctime.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_Ctime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_Cdate.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_Cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("MEMBER FULL NAME");

        jTextField_FULL_NAME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_FULL_NAMEMouseClicked(evt);
            }
        });
        jTextField_FULL_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FULL_NAMEActionPerformed(evt);
            }
        });
        jTextField_FULL_NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_FULL_NAMEKeyReleased(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MEMBER CHURCH NAME");

        jTextField_CName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jTextField_FULL_NAME)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_CName))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jComboBox_ACC_TYPE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ID)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_NAME)
                            .addComponent(jTextField_CUR)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MEMBER_PICTURE, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jButton_BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Ctime, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel_Cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox_ACC_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextField_FULL_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jTextField_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_MEMBER_PICTURE, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_CUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_DATE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UPDATE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Ctime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_BACK)
                        .addGap(69, 69, 69))))
        );

        jTabbedPane1.addTab("Membership", jPanel2);

        jPanel5.setBackground(new java.awt.Color(232, 232, 232));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENVELOPE TYPE");

        jComboBox_ENVELOPE_TYPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easter Envelope", "Christmas Envelope", "New Year Envelope", " " }));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("CHURCH NAME");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("AMOUNT (KSh.)");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("TRANSACTION DATE");

        jDateChooser_T_DATE.setDateFormatString("d MMM yyyy");

        jButton_UPDATE_.setBackground(new java.awt.Color(228, 241, 254));
        jButton_UPDATE_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_UPDATE_.setForeground(new java.awt.Color(0, 230, 64));
        jButton_UPDATE_.setLabel("SAVE");
        jButton_UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 204));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Back To Menu");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel_CTime.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_CDate.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel_CTime, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_AMOUNT_)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_CHURCH)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_ENVELOPE_TYPE, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_T_DATE, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(112, 112, 112)
                        .addComponent(jButton_UPDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel_CDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_ENVELOPE_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CHURCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jTextField_AMOUNT_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_UPDATE_)
                    .addComponent(jDateChooser_T_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("Envelopes", jPanel5);

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DONATION BY:");

        jCheckBox_MEMBER.setText("Member");
        jCheckBox_MEMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MEMBERActionPerformed(evt);
            }
        });

        jCheckBox_NON_MEMBER.setText("Non-Member");
        jCheckBox_NON_MEMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_NON_MEMBERActionPerformed(evt);
            }
        });

        jCheckBox_GROUP.setText("Group");
        jCheckBox_GROUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_GROUPActionPerformed(evt);
            }
        });

        memberPanel.setBackground(new java.awt.Color(236, 236, 236));
        memberPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Member Full Name");

        jTextField_MFN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MFN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MFN.setEnabled(false);
        jTextField_MFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MFNActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel26.setText("        Search Member Name");

        jTextField_MNAME.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_MNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MNAME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_MNAMEMouseReleased(evt);
            }
        });
        jTextField_MNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MNAMEActionPerformed(evt);
            }
        });
        jTextField_MNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_MNAMEKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Church Name");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Donation Date");

        jDateChooser_DDATE.setDateFormatString("d MMM yyyy");

        jTextField_CNAME.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField_CNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField_ITEM_AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ITEM_AMOUNTActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amount (KSh.)", "Item (s)", "Both" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton_MDUPDATE.setBackground(new java.awt.Color(228, 241, 254));
        jButton_MDUPDATE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton_MDUPDATE.setForeground(new java.awt.Color(0, 230, 64));
        jButton_MDUPDATE.setText("SAVE");
        jButton_MDUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MDUPDATEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberPanelLayout = new javax.swing.GroupLayout(memberPanel);
        memberPanel.setLayout(memberPanelLayout);
        memberPanelLayout.setHorizontalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton_MDUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_MNAME)
                            .addComponent(jTextField_MFN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField_CNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(memberPanelLayout.createSequentialGroup()
                        .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_ITEM_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser_DDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(29, 29, 29))
        );
        memberPanelLayout.setVerticalGroup(
            memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jTextField_MFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jTextField_MNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_ITEM_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_DDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_MDUPDATE)
                .addGap(32, 32, 32))
        );

        non_memberPanel.setBackground(new java.awt.Color(236, 236, 236));
        non_memberPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("                    FULL NAME");

        jLabel11.setText("                        CONTACT");

        jTextField_CONTACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CONTACTActionPerformed(evt);
            }
        });

        jLabel15.setText("                 DONATION DATE");

        jDateChooser_DATE_D.setDateFormatString("d MMM yyyy");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amount (KSh.)", "Item (s)", "Both" }));

        jButton_NON_M_UPDATE.setBackground(new java.awt.Color(228, 241, 254));
        jButton_NON_M_UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton_NON_M_UPDATE.setForeground(new java.awt.Color(0, 230, 64));
        jButton_NON_M_UPDATE.setText("SAVE");
        jButton_NON_M_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NON_M_UPDATEActionPerformed(evt);
            }
        });

        jLabel20.setText("                       ADDRESS");

        javax.swing.GroupLayout non_memberPanelLayout = new javax.swing.GroupLayout(non_memberPanel);
        non_memberPanel.setLayout(non_memberPanelLayout);
        non_memberPanelLayout.setHorizontalGroup(
            non_memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(non_memberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(non_memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(non_memberPanelLayout.createSequentialGroup()
                        .addGroup(non_memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_FNAME, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_CONTACT)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jDateChooser_DATE_D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_AMOUNT_ITEM))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_ADDRESS))
                .addGap(37, 37, 37))
            .addGroup(non_memberPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton_NON_M_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        non_memberPanelLayout.setVerticalGroup(
            non_memberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(non_memberPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextField_FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jTextField_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_AMOUNT_ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_DATE_D, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_NON_M_UPDATE)
                .addGap(30, 30, 30))
        );

        groupPanel.setBackground(new java.awt.Color(236, 236, 236));
        groupPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setText("                  GROUP NAME");

        jLabel22.setText("                    MEMBERS");

        jTextArea_MEMBERS.setColumns(20);
        jTextArea_MEMBERS.setRows(5);
        jScrollPane1.setViewportView(jTextArea_MEMBERS);

        jLabel23.setText("                DONATION DATE");

        jDateChooser_D_DATE.setDateFormatString("d MMM yyyy");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amount (KSh.)", "Item (s)", "Both" }));

        jTextField_ITEMS_AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ITEMS_AMOUNTActionPerformed(evt);
            }
        });

        jButton_G_UPDATE.setBackground(new java.awt.Color(228, 241, 254));
        jButton_G_UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton_G_UPDATE.setForeground(new java.awt.Color(0, 230, 64));
        jButton_G_UPDATE.setText("SAVE");
        jButton_G_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_G_UPDATEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout groupPanelLayout = new javax.swing.GroupLayout(groupPanel);
        groupPanel.setLayout(groupPanelLayout);
        groupPanelLayout.setHorizontalGroup(
            groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupPanelLayout.createSequentialGroup()
                .addGroup(groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_GNAME)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser_D_DATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ITEMS_AMOUNT)))
                    .addGroup(groupPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton_G_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        groupPanelLayout.setVerticalGroup(
            groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jTextField_GNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_ITEMS_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser_D_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_G_UPDATE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Back To Menu");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel_TIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_DATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(memberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(non_memberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel_CTIME_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_CDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_MEMBER)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_NON_MEMBER)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_GROUP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel_TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jCheckBox_MEMBER)
                            .addComponent(jCheckBox_NON_MEMBER)
                            .addComponent(jCheckBox_GROUP))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_DATE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_TIME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(groupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(non_memberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CDATE_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel29))
                    .addComponent(jLabel_CTIME_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Donations", jPanel4);

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));

        jLabel12.setText("           CHURCH ACCOUNT TYPE");

        jComboBox_TYPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Offertory", "Tithe", "Family Day", "Priest Feeding", "Youth", "CWA", "CMA" }));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CHURCH NAME");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PAYMENT (KSh.)");

        jTextField_CURPAY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_CHURCH_ACCOUNT_UPDATE.setBackground(new java.awt.Color(228, 241, 254));
        jButton_CHURCH_ACCOUNT_UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_CHURCH_ACCOUNT_UPDATE.setForeground(new java.awt.Color(0, 230, 64));
        jButton_CHURCH_ACCOUNT_UPDATE.setText("SAVE");
        jButton_CHURCH_ACCOUNT_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CHURCH_ACCOUNT_UPDATEActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(" TRANSACTION DATE");

        jDateChooser2.setDateFormatString("d MMM yyyy");

        jTextField_Cname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Back To Menu");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel_CTIME.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CTIME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_CDATE.setForeground(new java.awt.Color(51, 102, 0));
        jLabel_CDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_CURPAY, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jButton_CHURCH_ACCOUNT_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel_CTIME, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_CDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jTextField_CURPAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CHURCH_ACCOUNT_UPDATE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_CDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_CTIME, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );

        jTabbedPane1.addTab("Church", jPanel3);

        jScrollPane2.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEActionPerformed
        // TODO add your handling code here:
        //String member_id = jTextField_ID.getText();
        String member_name = jTextField_FULL_NAME.getText();
        String church_name = jTextField_CName.getText();
        Object acc_type = jComboBox_ACC_TYPE.getSelectedItem();
        String currentAm = jTextField_CUR.getText();

        if (jDateChooser_DATE.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            curDate = dateformat.format(jDateChooser_DATE.getDate());
        }

        PreparedStatement pst;
        String query = "INSERT INTO `member_account`(`MEMBER_NAME`,`CHURCH_NAME`,`ACCOUNT_TYPE`,`PAYMENT`,`TRANSACTION_DATE`) VALUES (?,?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            pst = CmsConnection.getConnection().prepareStatement(query);

            //pst.setInt(0, Integer.parseInt(member_id));
            pst.setString(1, member_name);
            pst.setString(2, church_name);
            pst.setString(3, (String) acc_type);
            pst.setString(4, currentAm);
            pst.setString(5, curDate);

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Member Account saved");
            }

            //Clear all fields after saving to database
            ClearAllInputFields();
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_UPDATEActionPerformed

    private void jTextField_NAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NAMEKeyReleased
        // TODO add your handling code here:
        searchFname();
        searchSname();
    }//GEN-LAST:event_jTextField_NAMEKeyReleased

    private void jTextField_NAMEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_NAMEMouseReleased
        // TODO add your handling code here:
        searchFname();
        searchSname();
    }//GEN-LAST:event_jTextField_NAMEMouseReleased

    private void jTextField_FULL_NAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FULL_NAMEKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_FULL_NAMEKeyReleased

    private void jTextField_FULL_NAMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_FULL_NAMEMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_FULL_NAMEMouseClicked

    private void jButton_UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_ActionPerformed
        // TODO add your handling code here:
        String cname = jTextField_CHURCH.getText();
        Object env_type = jComboBox_ENVELOPE_TYPE.getSelectedItem();
        String envAmount = jTextField_AMOUNT_.getText();

        if (jDateChooser_T_DATE.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            receivedDate = dateformat.format(jDateChooser_T_DATE.getDate());
        }

        PreparedStatement ps1;
        String query1 = "INSERT INTO `envelopes` (`CHURCH_NAME`,`ENVELOPE_TYPE`,`AMOUNT`,`TRANSACTION_DATE`) VALUES (?, ?, ?, ?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps1 = CmsConnection.getConnection().prepareStatement(query1);

            ps1.setString(1, cname);
            ps1.setString(2, (String) env_type);
            ps1.setString(3, envAmount);
            ps1.setString(4, receivedDate);

            if (ps1.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Envelope Account saved");
            }
            //Clear all fields after saving to database
            ClearAllInputFields();
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UPDATE_ActionPerformed

    private void jButton_CHURCH_ACCOUNT_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CHURCH_ACCOUNT_UPDATEActionPerformed
        // TODO add your handling code here:
        String cName = jTextField_Cname.getText();
        Object accTy = jComboBox_TYPE.getSelectedItem();
        String curPay = jTextField_CURPAY.getText();

        if (jDateChooser2.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            payDate = dateformat.format(jDateChooser2.getDate());
        }

        PreparedStatement ps2;
        String query2 = "INSERT INTO `church_account` (`CHURCH_NAME`,`ACCOUNT_TYPE`,`AMOUNT`,`TRANSACTION_DATE`) VALUES (?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps2 = CmsConnection.getConnection().prepareStatement(query2);

            ps2.setString(1, cName);
            ps2.setString(2, (String) accTy);
            ps2.setString(3, curPay);
            ps2.setString(4, payDate);

            if (ps2.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Church Account saved");
            }
            //Clear all fields after saving to database
            ClearAllInputFields();

        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_CHURCH_ACCOUNT_UPDATEActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        groupPanel.setVisible(false);
        non_memberPanel.setVisible(false);
        memberPanel.setVisible(false);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jCheckBox_GROUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_GROUPActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_GROUP.isSelected()) {
            jCheckBox_NON_MEMBER.setSelected(false);
            jCheckBox_MEMBER.setSelected(false);
            groupPanel.setVisible(true);
            non_memberPanel.setVisible(false);
            memberPanel.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_GROUPActionPerformed

    private void jCheckBox_NON_MEMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_NON_MEMBERActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_NON_MEMBER.isSelected()) {
            jCheckBox_GROUP.setSelected(false);
            jCheckBox_MEMBER.setSelected(false);
            non_memberPanel.setVisible(true);
            memberPanel.setVisible(false);
            groupPanel.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_NON_MEMBERActionPerformed

    private void jCheckBox_MEMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_MEMBERActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_MEMBER.isSelected()) {
            jCheckBox_NON_MEMBER.setSelected(false);
            jCheckBox_GROUP.setSelected(false);
            memberPanel.setVisible(true);
            non_memberPanel.setVisible(false);
            groupPanel.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_MEMBERActionPerformed

    private void jButton_G_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_G_UPDATEActionPerformed
        // TODO add your handling code here:
        String gname = jTextField_GNAME.getText();
        String members = jTextArea_MEMBERS.getText();
        Object gdon = jComboBox.getSelectedItem();
        String items_amount = jTextField_ITEMS_AMOUNT.getText();

        if (jDateChooser_D_DATE.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            gDondate = dateformat.format(jDateChooser_D_DATE.getDate());
        }

        PreparedStatement ps5;
        String query5 = "INSERT INTO `group_donations`(`GROUP_NAME`,`MEMBERS`,`DONATION_TYPE`,`DONATION`,`DONATION_DATE`) VALUES (?,?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps5 = CmsConnection.getConnection().prepareStatement(query5);

            ps5.setString(1, gname);
            ps5.setString(2, members);
            ps5.setString(3, (String) gdon);
            ps5.setString(4, items_amount);
            ps5.setString(5, gDondate);

            if (ps5.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Group donation saved");
            }
            //Clear all fields after saving to database
            ClearAllInputFields();

        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_G_UPDATEActionPerformed

    private void jButton_MDUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MDUPDATEActionPerformed
        // TODO add your handling code here:
        String mName = jTextField_MFN.getText();
        String church_Name = jTextField_CNAME.getText();
        Object donation = jComboBox3.getSelectedItem();
        String amount_item = jTextField_ITEM_AMOUNT.getText();

        if (jDateChooser_DDATE.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            donDate = dateformat.format(jDateChooser_DDATE.getDate());
        }

        PreparedStatement ps3;
        String query3 = "INSERT INTO `member_donations`(`MEMBER_NAME`,`CHURCH_NAME`,`DONATION_TYPE`,`DONATION`,`DONATION_DATE`) VALUES (?,?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps3 = CmsConnection.getConnection().prepareStatement(query3);

            ps3.setString(1, mName);
            ps3.setString(2, church_Name);
            ps3.setString(3, (String) donation);
            ps3.setString(4, amount_item);
            ps3.setString(5, donDate);

            if (ps3.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Member donation saved");
            }
            //Clear all fields after saving to database
            ClearAllInputFields();

        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_MDUPDATEActionPerformed

    private void jTextField_MNAMEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MNAMEKeyReleased
        // TODO add your handling code here:
        searchFName();
        searchSName();

    }//GEN-LAST:event_jTextField_MNAMEKeyReleased

    private void jTextField_MNAMEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_MNAMEMouseReleased
        // TODO add your handling code here:
        searchFName();
        searchSName();
    }//GEN-LAST:event_jTextField_MNAMEMouseReleased

    private void jTextField_MFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MFNActionPerformed

    private void jTextField_MNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MNAMEActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton_NON_M_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NON_M_UPDATEActionPerformed
        // TODO add your handling code here:
        String FName = jTextField_FNAME.getText();
        String contact = jTextField_CONTACT.getText();
        String address = jTextField_ADDRESS.getText();
        Object don = jComboBox4.getSelectedItem();
        String item_amount = jTextField_AMOUNT_ITEM.getText();

        if (jDateChooser_DATE_D.getDate() != null) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            dateDon = dateformat.format(jDateChooser_DATE_D.getDate());
        }

        PreparedStatement ps4;
        String query4 = "INSERT INTO `non_member_donations`(`FULL_NAME`,`CONTACT`,`ADDRESS`,`DONATION_TYPE`,`DONATION`,`DONATION_DATE`) VALUES (?,?,?,?,?,?)";

        try {

            //InputStream prof = new FileInputStream(imageFile);
            ps4 = CmsConnection.getConnection().prepareStatement(query4);

            ps4.setString(1, FName);
            ps4.setString(2, contact);
            ps4.setString(3, address);
            ps4.setString(4, (String) don);
            ps4.setString(5, item_amount);
            ps4.setString(6, dateDon);

            if (ps4.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Non-member donation saved");
            }
            //Clear all fields after saving to database
            ClearAllInputFields();

        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_NON_M_UPDATEActionPerformed

    private void jTextField_CONTACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CONTACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CONTACTActionPerformed

    private void jTextField_ITEMS_AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ITEMS_AMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ITEMS_AMOUNTActionPerformed

    private void jTextField_ITEM_AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ITEM_AMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ITEM_AMOUNTActionPerformed

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        MenuForm mf = new MenuForm();
        mf.setVisible(true);
        mf.pack();
        //mf.setLocationRelativeTo(null);
        mf.setLocationRelativeTo(mf);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        MenuForm mf = new MenuForm();
        mf.setVisible(true);
        mf.pack();
        //mf.setLocationRelativeTo(null);
        mf.setLocationRelativeTo(mf);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        MenuForm mf = new MenuForm();
        mf.setVisible(true);
        mf.pack();
        //mf.setLocationRelativeTo(null);
        mf.setLocationRelativeTo(mf);
        // mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel_LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LOGOUTMouseClicked
        // TODO add your handling code here:
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jLabel_LOGOUTMouseClicked

    private void jTextField_FULL_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FULL_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FULL_NAMEActionPerformed

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
            java.util.logging.Logger.getLogger(AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel groupPanel;
    private javax.swing.JButton jButton_BACK;
    private javax.swing.JButton jButton_CHURCH_ACCOUNT_UPDATE;
    private javax.swing.JButton jButton_G_UPDATE;
    private javax.swing.JButton jButton_MDUPDATE;
    private javax.swing.JButton jButton_NON_M_UPDATE;
    private javax.swing.JButton jButton_UPDATE;
    private javax.swing.JButton jButton_UPDATE_;
    private javax.swing.JCheckBox jCheckBox_GROUP;
    private javax.swing.JCheckBox jCheckBox_MEMBER;
    private javax.swing.JCheckBox jCheckBox_NON_MEMBER;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox_ACC_TYPE;
    private javax.swing.JComboBox jComboBox_ENVELOPE_TYPE;
    private javax.swing.JComboBox jComboBox_TYPE;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser_DATE;
    private com.toedter.calendar.JDateChooser jDateChooser_DATE_D;
    private com.toedter.calendar.JDateChooser jDateChooser_DDATE;
    private com.toedter.calendar.JDateChooser jDateChooser_D_DATE;
    private com.toedter.calendar.JDateChooser jDateChooser_T_DATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CDATE;
    private javax.swing.JLabel jLabel_CDATE_;
    private javax.swing.JLabel jLabel_CDate;
    private javax.swing.JLabel jLabel_CTIME;
    private javax.swing.JLabel jLabel_CTIME_;
    private javax.swing.JLabel jLabel_CTime;
    private javax.swing.JLabel jLabel_Cdate;
    private javax.swing.JLabel jLabel_Ctime;
    private javax.swing.JLabel jLabel_DATE;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JLabel jLabel_LOGOUT;
    private javax.swing.JLabel jLabel_MEMBER_PICTURE;
    private javax.swing.JLabel jLabel_TIME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea_MEMBERS;
    private javax.swing.JTextField jTextField_ADDRESS;
    private javax.swing.JTextField jTextField_AMOUNT_;
    private javax.swing.JTextField jTextField_AMOUNT_ITEM;
    private javax.swing.JTextField jTextField_CHURCH;
    private javax.swing.JTextField jTextField_CNAME;
    private javax.swing.JTextField jTextField_CName;
    private javax.swing.JTextField jTextField_CONTACT;
    private javax.swing.JTextField jTextField_CUR;
    private javax.swing.JTextField jTextField_CURPAY;
    private javax.swing.JTextField jTextField_CUSER;
    private javax.swing.JTextField jTextField_Cname;
    private javax.swing.JTextField jTextField_FNAME;
    private javax.swing.JTextField jTextField_FULL_NAME;
    private javax.swing.JTextField jTextField_GNAME;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ITEMS_AMOUNT;
    private javax.swing.JTextField jTextField_ITEM_AMOUNT;
    private javax.swing.JTextField jTextField_MFN;
    private javax.swing.JTextField jTextField_MNAME;
    private javax.swing.JTextField jTextField_NAME;
    private javax.swing.JPanel memberPanel;
    private javax.swing.JPanel non_memberPanel;
    // End of variables declaration//GEN-END:variables

    private void searchFname() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where FIRST_NAME = ?";

            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_NAME.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("MEMBER_ID"));
                jTextField_FULL_NAME.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));
                jTextField_CNAME.setText(rs.getString("CHURCH_NAME"));
                jTextField_MFN.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));

                if (rs.getBytes("MEMBER_IMAGE") == null) {
                    jLabel_MEMBER_PICTURE.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("MEMBER_IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_MEMBER_PICTURE.getWidth(), jLabel_MEMBER_PICTURE.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_MEMBER_PICTURE.setIcon(imageIcon);
                    member_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchSname() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where SURNAME = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_NAME.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                jTextField_ID.setText(rs.getString("MEMBER_ID"));
                jTextField_FULL_NAME.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));
                jTextField_CName.setText(rs.getString("CHURCH_NAME"));
                jTextField_MFN.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));
                if (rs.getBytes("MEMBER_IMAGE") == null) {
                    jLabel_MEMBER_PICTURE.setIcon(null);
                } else {
                    byte[] img = rs.getBytes("MEMBER_IMAGE");
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel_MEMBER_PICTURE.getWidth(), jLabel_MEMBER_PICTURE.getHeight(), Image.SCALE_SMOOTH));
                    jLabel_MEMBER_PICTURE.setIcon(imageIcon);
                    member_image = img;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchFName() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where FIRST_NAME = ?";

            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_MNAME.getText());
            rs = ps.executeQuery();

            if (rs.next()) {

                jTextField_CNAME.setText(rs.getString("CHURCH_NAME"));
                jTextField_MFN.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchSName() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "Select * from members where SURNAME = ?";
            ps = CmsConnection.getConnection().prepareStatement(sql);
            ps.setString(1, jTextField_MNAME.getText());
            rs = ps.executeQuery();

            if (rs.next()) {

                jTextField_CNAME.setText(rs.getString("CHURCH_NAME"));
                jTextField_MFN.setText(rs.getString("FIRST_NAME") + " " + rs.getString("SURNAME"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ClearAllInputFields() {
        jTextField_FNAME.setText("");
        jTextField_CONTACT.setText("");
        jTextField_ADDRESS.setText("");
        jComboBox4.setSelectedIndex(0);
        jTextField_AMOUNT_ITEM.setText("");
        jDateChooser_DATE_D.setDate(null);
        jTextField_MFN.setText("");
        jTextField_CNAME.setText("");
        jComboBox3.setSelectedIndex(0);
        jTextField_ITEM_AMOUNT.setText("");
        jDateChooser_DDATE.setDate(null);
        jTextField_GNAME.setText("");
        jTextArea_MEMBERS.setText("");
        jComboBox.setSelectedIndex(0);
        jTextField_ITEMS_AMOUNT.setText("");
        jDateChooser_D_DATE.setDate(null);
        jTextField_Cname.setText("");
        jComboBox_TYPE.setSelectedIndex(0);
        jTextField_CURPAY.setText("");
        jDateChooser2.setDate(null);
        jTextField_CHURCH.setText("");
        jComboBox_ENVELOPE_TYPE.setSelectedIndex(0);
        jTextField_AMOUNT_.setText("");
        jDateChooser_T_DATE.setDate(null);
        jTextField_FULL_NAME.setText("");
        jComboBox_ACC_TYPE.setSelectedIndex(0);
        jTextField_CUR.setText("");
        jDateChooser_DATE.setDate(null);
        jTextField_CName.setText("");
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
            jLabel_CTIME.setText(time12);
            jLabel_CDATE.setText(date);
            jLabel_Ctime.setText(time12);
            jLabel_Cdate.setText(date);
            jLabel_CTime.setText(time12);
            jLabel_CDate.setText(date);
            jLabel_TIME.setText(time12);
            jLabel_DATE.setText(date);

        }
    }

}
