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
public class Envelopes {
    private int ID;
    private String cname;
    private String envType;
    private String amount;
    private String transDate;
    
    //Constructor
    
    public Envelopes(){
    super();
    }
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getCname(){
    return cname;
    }
    public void setCname(String cname){
    this.cname = cname;
    }
    public String getEnvType(){
    return envType;
    }
    public void setEnvType(String envType){
    this.envType = envType;
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
