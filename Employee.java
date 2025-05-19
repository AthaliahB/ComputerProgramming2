/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cp1.department;



import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author athaliah
 */
class Employee {
   
    //-employeeId:int
    private int employeeId;
     //-firstName:String
    private String firstName;
    //-lastName: String
    private String lastName;
    //-birthDate:Date
    private LocalDate birthDate;
    //-hireDate: Date
    private LocalDate hireDate;
    //departmentId:int
    private int departmentId;
    //-positionId:int
    private int positionId;
    //-salary:double
    private double salary;
    //-email:String
    private String email;
    //-phoneNumber:String
    private String phoneNumber;
    
    public Employee (int employeeId,String firstName, String lastName, LocalDate birthdate, 
            LocalDate hireDate, int positionId, double salary, String email, String phoneNumber) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.positionId = positionId;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
  
    }
    
    //+getEmployeeId()::int
    public int getEmployeeId() {
    return employeeId;
}
    //+getFirstName()::String
    public String getFirstName() {
    return firstName;
}
    //+getLastName()::String
    public String getLastName() {
    return lastName;  
}
    //+setLastName(lastName:String) :: void
    public void setLastName (String lastName) {
        this.lastName = lastName;
}
    //+getBirthDate()::Date
    public LocalDate getBirthDate() {
        return birthDate;
}
    //+getHireDate()::Date
    public LocalDate getHireDate() {
        return hireDate;
}
    //+getPositionId()::int
    public int getPositionId() {
        return positionId;
}
    //+getSalary()::double
    public double getSalary() {
        return salary; 
}
    //+setSalary(newSalary:double)::void
    public void setSalary (double newSalary) {
        this.salary = newsalary;
}
    //+getEmail()::String
    public String getEmail() {
        return email;
} 
    //+setEmail(email:String)::void
    public void setEmail (String email) {
        this.email = email;
}
    //+getPhoneNumber():String
    public String getPhoneNumber () { 
        return phoneNumber;
}
    //+setPhoneNumber(phoneNumber:String)::void
    public void setPhoneNumber ( String phoneNumber) {
        this.phoneNumber = phoneNumber;
}
    //+displayEmployeeDetails()::void
    public void displayEmployeeDetails () {
        System.out.println("----- EMPLOYEE DETAILS -----");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Position ID: " + positionId);
        System.out.println("Salary: ₱" + salary);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("----------------------------");
        
}
    //+calculateYearsofService()::int
    public int calculateYearsOfService () {
        return Period.between(hireDate, LocalDate.now()).getYears();      
}
    //changeDepartment(newDepartmentId:int)::void
    public void changeDepartment (int newDepartment) {
     this.departmentId = newDepartmentId;
        System.out.println("Department changed to: " + newDepartmentId);   
}
}
