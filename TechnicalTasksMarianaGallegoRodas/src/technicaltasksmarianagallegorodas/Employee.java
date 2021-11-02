/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicaltasksmarianagallegorodas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Employee extends Person {
    
    Scanner in = new Scanner(System.in);
    
    String charge;
    double salary;
    
    public Employee() {
    
        readInfoEmployee();
    
    }
    
    public void readInfoEmployee() {
    
        System.out.println();
        System.out.println("Enter name of the employee: ");
        this.name = in.nextLine();
        
        System.out.println("Enter id type: ");
        this.idType = in.nextLine();
        
        System.out.println("Enter id code: ");
        this.idCode = in.nextLine();
        
        System.out.println("Enter birth date: ");
        this.birthDate = in.nextLine();
        
        System.out.println("Enter phone number: ");
        this.phoneNumber = in.nextLine();
        
        System.out.println("Enter residential address: ");
        this.residentialAddress = in.nextLine();
        
        System.out.println("Enter charge: ");
        this.charge = in.nextLine();
        
        System.out.println("Enter salary: ");
        this.salary = in.nextDouble();
    
    }
    
    public void printEmployeeInfo(Employee employee) {
    
        System.out.println();
        System.out.println("Complete information of " + employee.name + ": ");
        System.out.println("Id type: " + employee.idType);
        System.out.println("Id code: " + employee.idCode);
        System.out.println("Bith date: " + employee.birthDate);
        System.out.println("Phone number: " + employee.phoneNumber);
        System.out.println("Residential address: " + employee.residentialAddress);
        System.out.println("Charge: " + employee.charge);
        System.out.println("Salary: " + employee.salary);
    
    }
    
}
