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
public class EnvelopesData extends javax.swing.JFrame {

    int insertedRows = 0;

    public EnvelopesData() {
        initComponents();
        scaleIcon1();
        scaleIcon2();
        populateJTableFromDatabase();

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

    private ArrayList<Envelopes> envelopeList() {
        ArrayList<Envelopes> envelopeList = new ArrayList<>();

        Statement stmt = null;
        ResultSet rs = null;
        //Connection con;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");
            stmt = con.createStatement();
            //stmt = CmsConnection.getConnection().prepareStatement(selectAllSQLQuery);
            //stmt = con.createStatement();
            String query = "SELECT * FROM envelopes";
            rs = stmt.executeQuery(query);

            //loop through the results
            while (rs.next()) {
                Envelopes envelope = new Envelopes();
                //populate User setters
                envelope.setID(rs.getInt("CHURCH_ID"));
                envelope.setCname(rs.getString("CHURCH_NAME"));
                envelope.setEnvType(rs.getString("ENVELOPE_TYPE"));
                envelope.setAmount(rs.getString("AMOUNT"));
                envelope.setTransDate(rs.getString("TRANSACTION_DATE"));
                envelopeList.add(envelope);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnvelopesData.class.getName()).log(Level.SEVERE, null, ex);
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
        return envelopeList;

    }

    //Populate JTable with data from database
    private void populateJTableFromDatabase() {
        ArrayList<Envelopes> dataArray = envelopeList();
        model = (DefaultTableModel) jTable_ENVELOPETable.getModel();
        //Clear JTable rows
        model.setRowCount(0);
        Object[] rows = new Object[5];

        //Loop through the arraylist to populate JTable
        for (int i = 0; i < dataArray.size(); i++) {
            rows[0] = dataArray.get(i).getID();
            rows[1] = dataArray.get(i).getCname();
            rows[2] = dataArray.get(i).getEnvType();
            rows[3] = dataArray.get(i).getAmount();
            rows[4] = dataArray.get(i).getTransDate();
            
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
        jLabel_ICON2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ENVELOPETable = new javax.swing.JTable();
        jButton_EXPORT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 40, 27));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENVELOPES DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_ICON1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel_ICON2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_ICON1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jLabel_ICON2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jTable_ENVELOPETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CHURCH ID", "CHURCH NAME", "ENVELOPE TYPE", "AMOUNT", "TRANSACTION DATE"
            }
        ));
        jScrollPane1.setViewportView(jTable_ENVELOPETable);

        jButton_EXPORT.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton_EXPORT.setForeground(new java.awt.Color(0, 153, 51));
        jButton_EXPORT.setText("Export (Excel)");
        jButton_EXPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EXPORTActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jButton_EXPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_EXPORT)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel ImportDataFromExcelModel;
    private void jButton_EXPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EXPORTActionPerformed
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
    }//GEN-LAST:event_jButton_EXPORTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            boolean printJTable = jTable_ENVELOPETable.print();
            if (!printJTable) {
                JOptionPane.showMessageDialog(null, "Unable to Print.!!");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnvelopesData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_EXPORT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ICON1;
    private javax.swing.JLabel jLabel_ICON2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ENVELOPETable;
    // End of variables declaration//GEN-END:variables

    FileInputStream excelFIS = null;
    BufferedInputStream excelBIS = null;
    XSSFWorkbook excelImportWorkbook = null;

}
