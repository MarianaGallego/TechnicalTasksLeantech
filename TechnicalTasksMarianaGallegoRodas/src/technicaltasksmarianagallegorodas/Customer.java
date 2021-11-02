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
public class Customer extends Person {
    
    Scanner in = new Scanner(System.in);
    
    int accumulatedPoints;
    
    public Customer() {

        readInfoCustomer();
    
    }
    
    public void readInfoCustomer() {
    
        System.out.println();
        System.out.println("Enter name of the customer: ");
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
        
        System.out.println("Enter accumulated points: ");
        this.accumulatedPoints = in.nextInt();
        
        in.nextLine();
    
    }
    
    public void printCustomerInfo(Customer customer) {
    
        System.out.println();
        System.out.println("Complete information of " + customer.name + ": ");
        System.out.println("Id type: " + customer.idType);
        System.out.println("Id code: " + customer.idCode);
        System.out.println("Bith date: " + customer.birthDate);
        System.out.println("Phone number: " + customer.phoneNumber);
        System.out.println("Residential address: " + customer.residentialAddress);
        System.out.println("Accumulated points: "  + customer.accumulatedPoints);
    
    }
    
}
