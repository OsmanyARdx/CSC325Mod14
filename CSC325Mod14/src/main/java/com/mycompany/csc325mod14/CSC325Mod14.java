/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.csc325mod14;

/**
 * Contains the main method
 * @author Osmany
 */
public class CSC325Mod14 {

    /**
     * Method to check if a number is a prime number
     * @param num1 takes in the number to check
     * @return returns true if the number is a prime
     */
    public static boolean prime(int num1){
        if(2 > num1){
            return false;
        }
        for(int i=2; i <= Math.sqrt(num1); i++){
            if(num1 % i == 0){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Method to check of the number has the digit 5
     * @param num1 takes in the number to check
     * @return returns true if the string value contains the character "5"
     */
    public static boolean hasADigit5(int num1){
        String numToString = String.valueOf(num1);
        if(numToString.contains("5")){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Method to get the sum of the prime numbers that contain the digit 5
     * @param n the limit range
     * @return returns the total sum of these numbers
     */
    public static int primeSumWithDigit(int n){
        int sum = 0;
        for(int i=2; i<=n; i++){
            if(prime(i) && hasADigit5(i)){
                sum += i;
            }
        }
        return sum;
    }
    
    /**
     * Runnable program
     * @param args contains strings
     */
    public static void main(String[] args) {
        System.out.println(primeSumWithDigit(50));
        System.out.println(prime(53));
    }
}
