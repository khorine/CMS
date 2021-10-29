/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Horine
 */
public class UserData extends javax.swing.JFrame {

    /**
     * Creates new form UserTable
     *
     */
    int insertedRows = 0;

    public UserData() {
        initComponents();
        //SelectUser();
        populateJTableFromDatabase();
        scaleIcon1();
        scaleIcon2();
    }

    Statement St1 = null;
    ResultSet Rs1 = null;
    Connection con = null;
    DefaultTableModel model;

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

    private ArrayList<User> usersList() {
        ArrayList<User> usersList = new ArrayList<>();
        String selectAllSQLQuery = "SELECT * FROM users";
        Statement stmt = null;
        ResultSet rs = null;
        //Connection con;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");
            stmt = con.createStatement();
            //stmt = CmsConnection.getConnection().prepareStatement(selectAllSQLQuery);
            //stmt = con.createStatement();
            rs = stmt.executeQuery(selectAllSQLQuery);
            //loop through the results
            while (rs.next()) {
                User user = new User();
                //populate User setters
                user.setID(rs.getInt("USER_ID"));
                user.setUsername(rs.getString("USERNAME"));
                //user.setPassword(rs.getString("PASSWORD"));
                user.setRole(rs.getString("ROLE"));
                user.setFirstName(rs.getString("FIRST_NAME"));
                user.setLastName(rs.getString("LAST_NAME"));
                user.setGender(rs.getString("GENDER"));
                user.setPhone(rs.getInt("PHONE_NO"));
                user.setAddress(rs.getString("ADDRESS"));
                user.setChurchName(rs.getString("CHURCH_NAME"));
                user.setPhoto(rs.getBytes("IMAGE"));
                usersList.add(user);

            }
        } catch (SQLException ex) {
        } finally {
            //Close variables to prevent java.sql.SQLException: Java heap space error
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException sQLException) {
                sQLException.getMessage();
            }
        }
        return usersList;
    }

    //Populate JTable with data from database
    private void populateJTableFromDatabase() {
        ArrayList<User> dataArray = usersList();
        model = (DefaultTableModel) jTable_USERTBL.getModel();
        //Clear JTable rows
        model.setRowCount(0);
        Object[] rows = new Object[9];

        //Loop through the arraylist to populate JTable
        for (int i = 0; i < dataArray.size(); i++) {
            rows[0] = dataArray.get(i).getID();
            rows[1] = dataArray.get(i).getUsername();
            //rows[2] = dataArray.get(i).getPassword();
            rows[2] = dataArray.get(i).getRole();
            rows[3] = dataArray.get(i).getFirstName();
            rows[4] = dataArray.get(i).getLastName();
            rows[5] = dataArray.get(i).getGender();
            rows[6] = dataArray.get(i).getPhone();
            rows[7] = dataArray.get(i).getAddress();
            rows[8] = dataArray.get(i).getChurchName();
            //rows[10] = dataArray.get(i).getPhoto();
            //rows[10] = dataArray.get(i).getID();
            model.addRow(rows);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel_ICON1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_USERTBL = new javax.swing.JTable();
        jButton_EXPORT_ = new javax.swing.JButton();
        jButton_PRINT_ = new javax.swing.JButton();
        jLabel_ICON2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 40, 27));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SYSTEM USERS DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_USERTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER_ID", "USERNAME", "ROLE", "FIRSTNAME", "LASTNAME", "GENDER", "PHONE_NO", "ADDRESS", "CHURCHNAME"
            }
        ));
        jTable_USERTBL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTable_USERTBLComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable_USERTBLComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_USERTBL);

        jButton_EXPORT_.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton_EXPORT_.setForeground(new java.awt.Color(0, 153, 51));
        jButton_EXPORT_.setText("Export (Excel)");
        jButton_EXPORT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EXPORT_ActionPerformed(evt);
            }
        });

        jButton_PRINT_.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_PRINT_.setText("Print");
        jButton_PRINT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PRINT_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jButton_EXPORT_)
                .addGap(122, 122, 122)
                .addComponent(jButton_PRINT_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_ICON2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_EXPORT_)
                    .addComponent(jButton_PRINT_))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   /*public void SelectUser() {
        
     try {
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");
     St1 = con.createStatement();
     Rs1 = St1.executeQuery("Select * from users");
     jTable_USERTBL.setModel(DbUtils.resultSetToTableModel(Rs1));
     } catch (SQLException e) {
     e.printStackTrace();
     }
     }*/


    private void jTable_USERTBLComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable_USERTBLComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_USERTBLComponentHidden

    private void jTable_USERTBLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable_USERTBLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_USERTBLComponentShown

    private void jButton_EXPORT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EXPORT_ActionPerformed
        // TODO add your handling code here:
        //Choose location for saving Excel file
        JFileChooser excelFileChooserExport = new JFileChooser("C:\\Users\\host\\Desktop");
        //Change Dialog box title
        excelFileChooserExport.setDialogTitle("Save As");
        //Only filter files with these extensions "xls","xlsx","xslm"
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xslm");
        excelFileChooserExport.setFileFilter(fnef);
        int excelChooser = excelFileChooserExport.showSaveDialog(null);

        //Check if save button is clicked
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            XSSFWorkbook excelJTableExporter = new XSSFWorkbook();
            XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
            for (int i = 0; i < model.getRowCount(); i++) {
                XSSFRow excelRow = excelSheet.createRow(i);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    XSSFCell excelCell = excelRow.createCell(j);

                    excelCell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
            FileOutputStream excelFOU;
            BufferedOutputStream excelBOU;
            try {
                excelFOU = new FileOutputStream(excelFileChooserExport.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                excelBOU.close();
                excelJTableExporter.close();
                JOptionPane.showMessageDialog(null, "Data export successful.!!");
            } catch (IOException iOException) {
            }
        }
    }//GEN-LAST:event_jButton_EXPORT_ActionPerformed

    private void jButton_PRINT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PRINT_ActionPerformed
        // TODO add your handling code here:

        try {
            boolean printJTable = jTable_USERTBL.print();
            if (!printJTable) {
                JOptionPane.showMessageDialog(null, "Unable to Print.!!");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_PRINT_ActionPerformed

    DefaultTableModel ImportDataFromExcelModel;

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
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EXPORT_;
    private javax.swing.JButton jButton_PRINT_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_USERTBL;
    // End of variables declaration//GEN-END:variables

    FileInputStream excelFIS = null;
    BufferedInputStream excelBIS = null;
    XSSFWorkbook excelImportWorkbook = null;
}
