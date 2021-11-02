/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicaltasksmarianagallegorodas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Menu {
    
    Scanner in = new Scanner(System.in);
    
    public Menu() {
 
        printMenu();
    
    }
    
    public void printMenu(){ 
    
        String opt;
        
        System.out.println("C# challenge - Mariana Gallego Rodas\n");
        System.out.println("Select an option: ");
        System.out.println("1. Find and sum multiples of two numbers");
        System.out.println("2. Find power number");
        System.out.println("3. Make and fill a matrix and sum diagonals");
        System.out.println("4. Access to database");
        System.out.println("5. Instance Employee and Costumer objects");
        
        opt = in.nextLine();
        
        optionSolution(opt);
     
    }
    
    public void optionSolution(String option) {
        
        String opt;
    
        switch (option) {
        
            case "1": 
                //System.out.println("Quiero encontrar y sumar multiplos de dos números");
                Multiples newMultiples = new Multiples();
                newMultiples.findAndSumMultiples();
                break;
                
            case "2":
                System.out.println("Quiero encontrar un número expresado como suma de potencias de igual exponente");
                break;
                
            case "3": 
                //System.out.println("Quiero rellenar una matriz y sumar sus diagonales");
                Matrix newMatrix = new Matrix();
                newMatrix.createAndFillMatrix();
                break;
                
            case "4":
                System.out.println("Quiero acceder a una base de datos");
                break;
                
            case "5":
                //System.out.println("Quiero implementar empelados y clientes");
                System.out.println();
                System.out.println("Please enter the info for three new employees");
                Employee firstEmployee = new Employee();
                Employee secondEmployee = new Employee();
                Employee thirdEmployee = new Employee();
                
                firstEmployee.printEmployeeInfo(firstEmployee);
                secondEmployee.printEmployeeInfo(secondEmployee);
                thirdEmployee.printEmployeeInfo(thirdEmployee);
                
                System.out.println("Please enter the info for three new customers\n");
                Customer firstCustomer = new Customer();
                Customer secondCustomer = new Customer();
                Customer thirdCustomer = new Customer();
                
                firstCustomer.printCustomerInfo(firstCustomer);
                secondCustomer.printCustomerInfo(secondCustomer);
                thirdCustomer.printCustomerInfo(thirdCustomer);
                break;
        
        }
    
    }
    
}
