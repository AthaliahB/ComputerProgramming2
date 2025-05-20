package com.cp1.employee;

import java.util.ArrayList;
import java.util.List;

public class Department {

    //-departmentId:int
    private int departmentId;
    //-departmentName: String
    private String departmentName;
    
    // List to hold the employees
    private List<Employee> employees;
    
    //Constructor
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
}
    //+getDepartmentId():: int
    public int getDepartmentId() {
    return departmentId;
}
    //+getDepartmentName()::String
    public String getDepartmentName() {
    return departmentName;
}
    //+addEmployee(employee:Employee)::void
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getFirstName() + " " + employee.getLastName());
}
    //+removeEmployee(employeeId:int)::void
    public void removeEmployee (int employeeId) {
     Employee toRemove = null;
     for(Employee emp : employees) {
         if (emp.getEmployeeId() == employeeId) {
             toRemove = emp;
             break;
         }
     }
     if (toRemove != null) {
         employees.remove(toRemove);
         System.out.println("Employee ID "+ employeeId + " is removed!");
} else {
         System.out.println("Employee ID Number:" + employeeId + "not Found!");
     }
     
}
    //+listAllEmployeesInDepartment()::List
    public List<Employee> listAllEmployeeInDepartment () {
        return new ArrayList<>(employees);
    }
}



