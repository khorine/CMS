/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CmsPackage;

/**
 *
 * @author Horine
 */
public class MembersAccount {
    private int ID;
    private String mName;
    private String church;
    private String AccType;
    private String payment;
    private String TransDate;
    
    //Constructor
    
    public MembersAccount(){
    super();
    }
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getMName(){
    return mName;
    }
    public void setMName(String mName){
    this.mName = mName;
    }
    public String getChurch(){
    return church;
    }
    public void setChurch(String church){
    this.church = church;
    }
    public String getAccType(){
    return AccType;
    }
    public void setAccType(String AccType){
    this.AccType = AccType;
    }
    public String getPayment(){
    return payment;
    }
     public void setPayment(String payment){
    this.payment = payment;
    }
      public String getTransDate(){
    return TransDate;
    }
     public void setTransDate(String TransDate){
    this.TransDate = TransDate;
    }
}
