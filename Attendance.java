/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cp1.employee;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author athaliah
 */
public class Attendance {
    
     //-attendanceId:int
    private int attendanceId;
    //-employeeId:int
    private int employeeId;
    //-date : LocalDate
    private LocalDate date;
    //-timeIn : LocalTime
    private LocalTime timeIn;
    //-timeOut : LocalTime
    private LocalTime timeOut;
    
    //Constructor
    public Attendance ( int attendaceId, int employeeId, LocalDate date, 
           LocalTime timeIn,LocalTime timeOut) {
        
        this.attendanceId =attendanceId;
        this.employeeId = employeeId;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
}
   //+getAttendanceId():: int
    public int getAttendanceId() {
        return attendanceId;
}
   //+getEmployeeId:: int
    public int getEmployeeId () {
        return employeeId;
}
    //+getDate():: LocalDate
    public LocalDate getDate () {
        return date;
}
    //+setTimeIn(timeIn:LocalTime):: void
    public void setTimeIn (LocalTime timeIn) {
        this.timeIn = timeIn;
        System.out.println(" Enter Time In (HH:MM) : ");
}
    ////+setTimeOut(timeOut:LocalTime):: void
    public void setTimeOut (LocalTime timeOut) {
        this.timeOut = timeOut;
        System.out.println(" Enter Time Out (HH:MM) : ");
   
}
