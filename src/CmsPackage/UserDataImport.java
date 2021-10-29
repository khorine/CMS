/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class UserDataImport extends javax.swing.JFrame {

    /**
     * Creates new form UserTable
     *
     */
    int insertedRows = 0;

    public UserDataImport() {
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_ICON2 = new javax.swing.JLabel();
        jLabel_ICON1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_USERTBL = new javax.swing.JTable();
        jButton_IMPORT = new javax.swing.JButton();
        jButton_RESET = new javax.swing.JButton();
        jButton_INSERT_TO_DB_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMPORTED USERS DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jLabel_ICON2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_USERTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER_ID", "USERNAME", "PASSWORD", "ROLE", "FIRSTNAME", "LASTNAME", "GENDER", "PHONE_NO", "ADDRESS", "CHURCHNAME"
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

        jButton_IMPORT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_IMPORT.setForeground(new java.awt.Color(0, 204, 102));
        jButton_IMPORT.setText("Import (Excel)");
        jButton_IMPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IMPORTActionPerformed(evt);
            }
        });

        jButton_RESET.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_RESET.setForeground(new java.awt.Color(255, 51, 51));
        jButton_RESET.setText("Reset/Clear Rows");
        jButton_RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RESETActionPerformed(evt);
            }
        });

        jButton_INSERT_TO_DB_.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_INSERT_TO_DB_.setForeground(new java.awt.Color(0, 102, 255));
        jButton_INSERT_TO_DB_.setText("Insert To DB");
        jButton_INSERT_TO_DB_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_TO_DB_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton_IMPORT)
                .addGap(41, 41, 41)
                .addComponent(jButton_RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton_INSERT_TO_DB_, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_IMPORT)
                    .addComponent(jButton_RESET)
                    .addComponent(jButton_INSERT_TO_DB_))
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

    DefaultTableModel ImportDataFromExcelModel;
    private void jButton_IMPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IMPORTActionPerformed
        // TODO add your handling code here:

        ImportDataFromExcelModel = (DefaultTableModel) jTable_USERTBL.getModel();

        //Clear JTable before importing excel file
        ImportDataFromExcelModel.setRowCount(0);

        //Default Directory path
        String currentDirectoryPath = "C:\\Users\\host\\Desktop";
        JFileChooser excelFileChooserImport = new JFileChooser(currentDirectoryPath);
        //Show only excel files
        FileNameExtensionFilter excelFileNameExtensionFilter = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xslm");
        excelFileChooserImport.setFileFilter(excelFileNameExtensionFilter);

        int excelChooser = excelFileChooserImport.showOpenDialog(null);

        //If open button is clicked
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                File excelFile = excelFileChooserImport.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportWorkbook = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportWorkbook.getSheetAt(0);

                for (int i = 0; i <= excelSheet.getLastRowNum(); i++) {
                    XSSFRow excelRow = excelSheet.getRow(i);

                    XSSFCell excelImportedID = excelRow.getCell(0);
                    XSSFCell excelImportedUsername = excelRow.getCell(1);
                    XSSFCell excelImportedRole = excelRow.getCell(2);
                    XSSFCell excelImportedPassword = excelRow.getCell(3);
                    XSSFCell excelImportedFirstName = excelRow.getCell(4);
                    XSSFCell excelImportedLastName = excelRow.getCell(5);
                    XSSFCell excelImportedGender = excelRow.getCell(6);
                    XSSFCell excelImportedPhone = excelRow.getCell(7);
                    XSSFCell excelImportedAddress = excelRow.getCell(8);
                    XSSFCell excelImportedChurchName = excelRow.getCell(9);

                    ImportDataFromExcelModel.addRow(new Object[]{excelImportedID, excelImportedUsername, excelImportedRole, excelImportedPassword, excelImportedFirstName, excelImportedLastName, excelImportedGender, excelImportedPhone, excelImportedAddress, excelImportedChurchName});

                }
                JOptionPane.showMessageDialog(null, "Data imported successfully.!!");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserDataImport.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(UserDataImport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton_IMPORTActionPerformed

    private void jButton_RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RESETActionPerformed
        // TODO add your handling code here:
        int rowCount = ImportDataFromExcelModel.getRowCount();
        //int rowCount2 = model.getColumnCount();

        //JOptionPane.showMessageDialog(null, rowCount);
        //Remove JTable rows from 
        for (int i = rowCount - 1; i >= 0; i--) {
            ImportDataFromExcelModel.removeRow(i);

        }
        /*for (int i = rowCount2 - 1; i >= 0; i--) {
         model.removeRow(i);
         }*/
    }//GEN-LAST:event_jButton_RESETActionPerformed

    private void jButton_INSERT_TO_DB_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_TO_DB_ActionPerformed
        // TODO add your handling code here:

        int jTableRows = jTable_USERTBL.getRowCount();
        String SQlInsertDataImportedFromExcel = "INSERT INTO `users` (`USERNAME`,`PASSWORD`,`ROLE`,`FIRST_NAME`,`LAST_NAME`,`GENDER`,`PHONE_NO`,`ADDRESS`,`CHURCH_NAME`) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst;

        for (int i = 0; i < jTableRows; i++) {
            String importedExcelID = ImportDataFromExcelModel.getValueAt(i, 0).toString();
            String importedExcelUsername = ImportDataFromExcelModel.getValueAt(i, 1).toString();
            String importedExcelRole = ImportDataFromExcelModel.getValueAt(i, 2).toString();
            String importedExcelPassword = ImportDataFromExcelModel.getValueAt(i, 3).toString();
            String importedExcelFirstname = ImportDataFromExcelModel.getValueAt(i, 4).toString();
            String importedExcelLastname = ImportDataFromExcelModel.getValueAt(i, 5).toString();
            String importedExcelGender = ImportDataFromExcelModel.getValueAt(i, 6).toString();
            String importedExcelPhone = ImportDataFromExcelModel.getValueAt(i, 7).toString();
            String importedExcelAddress = ImportDataFromExcelModel.getValueAt(i, 8).toString();
            String importedExcelChurchname = ImportDataFromExcelModel.getValueAt(i, 9).toString();

            try {
                pst = CmsConnection.getConnection().prepareStatement(SQlInsertDataImportedFromExcel);
                pst.setString(1, importedExcelUsername);
                pst.setString(2, importedExcelRole);
                pst.setString(3, importedExcelPassword);
                pst.setString(4, importedExcelFirstname);
                pst.setString(5, importedExcelLastname);
                pst.setString(6, importedExcelGender);
                pst.setInt(7, Integer.parseInt(importedExcelPhone));
                pst.setString(8, importedExcelAddress);
                pst.setString(9, importedExcelChurchname);
                int insertResult = pst.executeUpdate();

                if (insertResult > 0) {
                    insertedRows++;
                }
                JOptionPane.showMessageDialog(null, insertedRows + "Rows inserted");

            } catch (SQLException ex) {
                Logger.getLogger(UserDataImport.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(importedExcelLastname);

        }
    }//GEN-LAST:event_jButton_INSERT_TO_DB_ActionPerformed

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
            java.util.logging.Logger.getLogger(UserDataImport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UserDataImport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IMPORT;
    private javax.swing.JButton jButton_INSERT_TO_DB_;
    private javax.swing.JButton jButton_RESET;
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
