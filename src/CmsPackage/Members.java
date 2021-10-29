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
public class Members {

    private int ID;
    private String father;
    private String mother;
    private String sacramental;
    private String mGroup;
    private String mAssign;
    private String sname;
    private String mname;
    private String fname;
    private String gender;
    private String village;
    private String phone;
    private String marital;
    private String occupation;
    private String email;
    private String residence;
    private String church;
    private String dob;
    private String yrofAdm;
    private byte[] picture;

    //Constructor
    public Members() {
        super();
    }
    
    //Getters and setters
    
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getFather(){
    return father;
    }
    public void setFather(String father){
    this.father = father;
    }
    public String getMother(){
    return mother;
    }
    public void setMother(String mother){
    this.mother = mother;
    }
    public String getSacramental(){
    return sacramental;
    }
    public void setSacramental(String sacramental){
    this.sacramental = sacramental;
    }
    public String getMgroup(){
    return mGroup;
    }
    public void setMgroup(String mGroup){
    this.mGroup = mGroup;
    }
     public String getMassign(){
    return mAssign;
    }
    public void setMassign(String mAssign){
    this.mAssign = mAssign;
    }
    public String getSname(){
    return sname;
    }
    public void setSname(String sname){
    this.sname = sname;
    }
    public String getMname(){
    return mname;
    }
    public void setMname(String mname){
    this.mname = mname;
    }
    public String getFname(){
    return fname;
    }
    public void setFname(String fname){
    this.fname = fname;
    }
    public String getGender(){
    return gender;
    }
    public void setGender(String gender){
    this.gender = gender;
    }
    public String getVillage(){
    return village;
    }
    public void setVillage(String village){
    this.village = village;
    }
    public String getPhone(){
    return phone;
    }
    public void setPhone(String phone){
    this.phone = phone;
    }
    public String getMarital(){
    return marital;
    }
    public void setMarital(String marital){
    this.marital = marital;
    }
    public String getOccupation(){
    return occupation;
    }
    public void setOccupation(String occupation){
    this.occupation = occupation;
    }
    public String getEmail(){
    return email;
    }
    public void setEmail(String email){
    this.email = email;
    }
    public String getResidence(){
    return residence;
    }
    public void setResidence(String residence){
    this.residence = residence;
    }
    public String getChurch(){
    return church;
    }
    public void setChurch(String church){
    this.church = church;
    }
    public String getDob(){
    return dob;
    }
    public void setDob(String dob){
    this.dob = dob;
    }
     public String getYrofAdm(){
    return yrofAdm;
    }
    public void setYrofAdm(String yrofAdm){
    this.yrofAdm = yrofAdm;
    }
     public byte[] getPhoto(){
    return picture;
    }
    public void setPhoto(byte[] photoFile){
    this.picture = picture;
    }
    
}
