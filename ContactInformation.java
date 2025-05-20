/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cp1.employee;

/**
 *
 * @author athaliah
 */
public class ContactInformation {
    
    //-employeeId:int
    private int employeeId;
    //-address:String
    private String address;
    //city:String
    private String city;
    //-province String
    private String province;
    //-postalCode:String
    private String postalCode;
    
      //Constructor
    public ContactInformation ( int employeeId, String address, String city,String province, String postalCode ) {
        this.employeeId = employeeId;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
    
     //+getAddress()::String
    public String getAddress () {
        return address;
}
    //+setAddress(address:String)::void
    public void setAddress (String address) {
         this.address = address;
        System.out.println("Address: " );
}
    //+getCity()::String
    public String getCity () {
        return city;
}
    //+setCity(city:String)::void
    public void setCity (String city) {
         this.city = city;
        System.out.println("City: " );   
}
    //+getProvince()::String
    public String getProvince () {
        return province;
}
    //+setPorvince(address:String)::void
    public void setProvince (String province) {
         this.province = province;
        System.out.println("Province: " );
}
    //+getPostalCode()::String
    public String getPostalCode () {
        return postalCode;
}
    //+setPostalCode(address:String)::void
    public void setPostalCode (String postalCode) {
         this.postalCode = postalCode;
        System.out.println("Postal Code: " );
} 
    //For Displaying Purposes
    public void displayContactInfo() {
        System.out.println("----- CONTACT INFORMATION -----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Province: " + province);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("--------------------------------");  
    }
}
