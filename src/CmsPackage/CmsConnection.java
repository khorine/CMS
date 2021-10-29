/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Horine
 */
public class CmsConnection {
   
     //public static void main(String[] args) {
        //CmsConnection pro = new CmsConnection();
        //pro.createConnection();
    //}
   public static Connection getConnection(){
   Connection con =null;
    //void createConnection(){
   try 
   {
   Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
    //System.out.println("Database Connection Success");
   } catch (ClassNotFoundException | SQLException ex){
       System.out.println(ex.getMessage());
   }
   return con;
  } 
}

