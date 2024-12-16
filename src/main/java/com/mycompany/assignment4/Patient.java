/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4;

/**
 *
 * @author betty
 */
public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetName, city, state;
    private int address;
    private int zipCode;
    private String phoneNumber;
    private String emergencyFirstName, emergencyLastName;
    private String emergencyNum;
    
    public Patient(String firstname, String lastname, String middlename, String streetname, String cityname, 
            String statename, int addressnum, String phonenum, String emergencyfirst, String emergencylast,
            String emergencyphone){
        this.firstName = firstname;
        this.lastName = lastname;
        this.middleName = middlename;
        this.address = addressnum;
        this.city = cityname;
        this.state = statename;
        this.streetName = streetname;
        this.phoneNumber = phonenum;
        this.emergencyFirstName = emergencyfirst;
        this.emergencyLastName = emergencylast;
        this.emergencyNum = emergencyphone;
        
    }
    public Patient(){
           
    }
    //this gets the information that was passed into the constructor and returns when called. the mutator will 
    //modify the information using the setter options. 
     public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public int getAddressNum(){
        return this.address;
    }
    public String getStreetName(){
        return this.streetName;
    }
    public String getCityName(){
        return this.city;
    }
    public String getStateName(){
        return this.state;
    }
    public int getZipCode(){
        return this.zipCode;
    }
    public String getPhoneNum(){
        return this.phoneNumber;
    }
    public String getEmergencyFirstName(){
        return this.emergencyFirstName;
    }
    public String getEmergencyLastName(){
        return this.emergencyLastName;
    }
    public String getEmergencyPhoneNum(){
        return this.emergencyNum;
    }
    
    // following is the mutator methods
    public void setName(String firstname, String middlename, String lastname){
        this.firstName = firstname;
        this.middleName = middlename;
        this.lastName = lastname;
        
    }
    
    public void setaddress(int addressNum, String streetname, String cityName, String stateName, int zipcode){
       this.address = addressNum;
        this.streetName = streetname;
       this.city = cityName;
       this.state = stateName;
       this.zipCode = zipcode;
    }
    public void setPhoneNum(String phonenumber){
        this.phoneNumber = phonenumber;
        
    }
    public void setEmergencyName(String efirstname, String elastname){
        this.emergencyFirstName = efirstname;
        this.emergencyLastName = elastname;
        
    }
    public void setEmergencyPhone(String ephone){
        this.emergencyNum = ephone;
        
    }
    
    
   
   
    
    
    
}
