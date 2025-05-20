/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cp1.employee;

/**
 *
 * @author athaliah
 */
public class Positions {
    
    //-positionId:int
    private int positionId;
    //positionName:String
    private String positionName;
    //-desscription:String
    private String description;
    
    //Constructor
    public Positions ( int positionId, String positioName, String description ) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.description = description;
    }
    
    //+getPositionId()::int
    public int getPositionId () {
        return positionId;
}
    //+getPositionName()::String
    public String getpositionName() {
        return positionName;
}
    //+getDescription()::String
    public String getDescription() {
        return description;
    }
    //+setDescription(desription:String)::void
    public void seDescription (String description) { 
       this.description = description;
        System.out.println("Job Description: " + description);
    }
}
