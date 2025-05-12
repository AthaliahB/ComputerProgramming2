/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cp1.umlclass;

/**
 *
 * @author athaliah
 */
public class Employee {
    private String employeeNumber;
    private String name;
    private String birthday;
    private double hourlyRate;
    private String department;
    
    public Employee(String employeeNumber,String name, String birthday, double hourlyRate,String department ) 
    
    {
           
            this.employeeNumber = employeeNumber;
            this.name = name;
            this.birthday = birthday;
            this.hourlyRate = hourlyRate;
            this.department = department;
}

    public String getEmployeeNumber() {
        return employeeNumber;
    }
    
public double getHourlyRate() {
        return hourlyRate;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + " (" + employeeNumber + ")");
    }
}