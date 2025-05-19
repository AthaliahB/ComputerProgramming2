/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cp1.department;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author athaliah
 */
public class Department {

    //-departmetnId:int
    private int departmentId;
    //-departmentName: String
    private String departmentName;
    
    // List to hold the employees
    private List<Employee> employees;
    
    //Constructor
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
    
    //+getDepartmentName()::String
    public String getDepartmentName() {
    return departmentName;
}
    //+addEmployee(employee:Employee)::void
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
}
    //+removeEmployee(employeeId:int)::void
    public void removeEmployee (int employeeId) {
     Employee toRemove = null;
     for(Employee emp : employees) {
         if (emp.getId() == employeeId) {
             toRemove = emp;
             break;
         }
     }
     if (toRemove != null) {
         employees.remove(toRemove);
         System.out.println("Employee ID "+ + employeeId + " is removed!");
} else {
         System.out.println("Employee ID Number:" + employeeId + "not Found!");
     }
     
}
    //+listAllEmployeesInDepartment()::List
    public List<Employee> listAllEmployeeInDepartment () {
        return new ArrayList<>(employees);
    }
}

