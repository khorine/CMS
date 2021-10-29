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
public class User {

    private int ID;
    private String username;
    private String password;
    private String role;
    private String firstname;
    private String lastname;
    private String gender;
    private int phone;
    private String address;
    private String churchname;
    private byte[] picture;

    //Constructor
    public User(){
    super();
    }
   /* public User(int ID, String username, String password, String role, String firstname, String lastname, String gender, int phone,
            String address, String churchname, byte[] photo) {
        super();
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.churchname = churchname;
        this.picture = photo;

    } */

// Getters and Setters
    public int getID(){
    return ID;
    }
    public void setID(int ID){
    this.ID = ID;
    }
    public String getUsername(){
    return username;
    }
    public void setUsername(String username){
    this.username = username;
    }
    public String getPassword(){
    return password;
    }
    public void setPassword(String password){
    this.password = password;
    }
    public String getRole(){
    return role;
    }
    public void setRole(String role){
    this.role = role;
    }
    public String getFirstName(){
    return firstname;
    }
    public void setFirstName(String firstname){
    this.firstname = firstname;
    }
    public String getLastName(){
    return lastname;
    }
    public void setLastName(String lastname){
    this.lastname = lastname;
    }
    public String getGender(){
    return gender;
    }
    public void setGender(String gender){
    this.gender = gender;
    }
    public int getPhone(){
    return phone;
    }
    public void setPhone(int phone){
    this.phone = phone;
    }
    public String getAddress(){
    return address;
    }
    public void setAddress(String address){
    this.address = address;
    }
    public String getChurchName(){
    return churchname;
    }
    public void setChurchName(String churchname){
    this.churchname = churchname;
    }
    public byte[] getPhoto(){
    return picture;
    }
    public void setPhoto(byte[] photoFile){
    this.picture = picture;
    }
    
}

 


 