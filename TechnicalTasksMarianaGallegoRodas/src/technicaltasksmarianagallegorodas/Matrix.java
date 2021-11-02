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
public class Matrix {
    
    Scanner in = new Scanner(System.in);
    
    int order;
    int sum = 0;
    
    public Matrix() {
    
        System.out.println("\nEnter the order you want for the matrix");
        this.order = in.nextInt();
    
    }
    
    public void createAndFillMatrix() {
    
        int[][] newMatrix = new int[order][order];
        int counter = order*order;
        int beggining = 0;
        int ending = order -1;
        
        while(counter <= (order*order) && counter >= 1) {
        
            for(int i = ending; i >= beggining; i--) {
            
                newMatrix[beggining][i] = counter;
                counter = counter - 1;
            
            }
            
            for(int i = beggining + 1; i <= ending; i++) {
            
                newMatrix[i][beggining] = counter;
                counter = counter - 1;
            
            }
            
            for(int i = beggining + 1; i <= ending; i++) {
            
                newMatrix[ending][i] = counter;
                counter = counter - 1;
            
            }
            
            for(int i = ending - 1; i >= beggining + 1; i--) {
            
                newMatrix[i][ending] = counter;
                counter = counter - 1;
            
            }
            
            beggining = beggining + 1;
            ending = ending - 1;
        
        }
        
        printMatrix(newMatrix);
        calculateSumDiagonals(newMatrix);
    
    }
    
    public void calculateSumDiagonals(int matrix[][]) {
        
        int sumPrincipalDiagonal = 0;
        int sumSecundaryDiagonal = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = matrix.length - 1;
        
        while(i < matrix.length) {
        
            sumPrincipalDiagonal = sumPrincipalDiagonal + matrix[i][i];
            i = i + 1;
        
        }
        
        while((j < matrix.length) && (k >= 0)) {
        
            sumSecundaryDiagonal = sumSecundaryDiagonal + matrix[j][k];
            j = j + 1;
            k = k - 1;
        
        }
        
        if(matrix.length % 2 == 0) {
        
            sum = sumPrincipalDiagonal + sumSecundaryDiagonal;
        
        } else {
        
            sum = (sumPrincipalDiagonal + sumSecundaryDiagonal) - 1;
        
        }
        
        System.out.println("The sum of the elements at the principal and secondary diagonals of the matrix are: " + sum);
    
    }
    
    public void printMatrix(int matrix[][]) {
        
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + "   ");

            }

            System.out.println();

        }

    }
    
}
