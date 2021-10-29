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
public class MemberDonations {
    private int ID;
    private String mName;
    private String cName;
    private String donType;
    private String donation;
    private String donDate;
    
    //Constructor
    
    public MemberDonations(){
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
    public String getCName(){
    return cName;
    }
    public void setCName(String cName){
    this.cName = cName;
    }
    public String getDonType(){
    return donType;
    }
    public void setDonType(String donType){
    this.donType = donType;
    }
    public String getDonation(){
    return donation;
    }
     public void setDonation(String donation){
    this.donation = donation;
    }
      public String getDonDate(){
    return donDate;
    }
     public void setDonDate(String donDate){
    this.donDate = donDate;
    }
}
