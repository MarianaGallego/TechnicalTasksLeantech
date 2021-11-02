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
public class Multiples {
    
    Scanner in = new Scanner(System.in);
    
    int range;
    int firstNumber;
    int secondNumber;
    int sum = 0;
    
    public Multiples() {
    
        System.out.println("\nEnter the maximum number of the range");
        this.range = in.nextInt();
        
        System.out.println("\nEnter the numbers from you want to get the multiples");
        System.out.println("First number: ");
        this.firstNumber = in.nextInt();
        System.out.println("Second number: ");
        this.secondNumber = in.nextInt();
    
    }
    
    public void findAndSumMultiples() {
        
        System.out.println("\nThe multiples of " + firstNumber + " and " + secondNumber + " are: ");
    
        for(int i = 0; i < range; i++) {
  
        
            if((i%firstNumber == 0) || (i%secondNumber == 0)) {
            
                System.out.println(i);
                sum = sum + i;
            
            }
        
        }
        
        System.out.println("\nAnd the sum of those multiples are: " + sum);
    
    }
    
}
