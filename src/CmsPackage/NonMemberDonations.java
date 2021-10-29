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
public class NonMemberDonations {
    private int ID;
    private String fname;
    private String contact;
    private String address;
    private String donType;
    private String donation;
    private String donDate;
    
    //Constructor
    
    public NonMemberDonations(){
    super();
    }
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getFname(){
    return fname;
    }
    public void setFname(String fname){
    this.fname = fname;
    }
    public String getContact(){
    return contact;
    }
    public void setContact(String contact){
    this.contact = contact;
    }
    public String getAddress(){
    return address;
    }
    public void setAddress(String address){
    this.address = address;
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
