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
public class ChurchAccounts {
    private int ID;
    private String church;
    private String accType;
    private String amount;
    private String transDate;
    
    //Constructor
    
    public ChurchAccounts(){
    super();
    }
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getChurch(){
    return church;
    }
    public void setChurch(String church){
    this.church = church;
    }
    public String getAccType(){
    return accType;
    }
    public void setAccType(String accType){
    this.accType = accType;
    }
    public String getAmount(){
    return amount;
    }
     public void setAmount(String amount){
    this.amount = amount;
    }
      public String getTransDate(){
    return transDate;
    }
     public void setTransDate(String transDate){
    this.transDate = transDate;
    }
}
