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
public class GroupDonations {
    private int ID;
    private String gname;
    private String members;
    private String donType;
    private String donation;
    private String donDate;
    
    //Constructor
    
    public GroupDonations(){
    super();
    }
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getGname(){
    return gname;
    }
    public void setGname(String gname){
    this.gname = gname;
    }
    public String getMembers(){
    return members;
    }
    public void setMembers(String members){
    this.members = members;
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
