/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.csc325mod14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Osmany
 */
public class CSC325Mod14Test {
    
    public CSC325Mod14Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of primeSumWithDigit method, of class CSC325Mod14.
     */
    @Test
    public void testPrimeSumWithDigit() {
        System.out.println("primeSumWithDigit");
        int n = 100;
        int expResult = 117;
        int result = CSC325Mod14.primeSumWithDigit(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test50(){
        System.out.println("primeSumWithDigit");
        int n = 50;
        int expResult = 5;
        int result = CSC325Mod14.primeSumWithDigit(n);
        assertEquals(expResult, result);
    }
    
     @Test
    public void test10(){
        System.out.println("primeSumWithDigit");
        int n = 10;
        int expResult = 5;
        int result = CSC325Mod14.primeSumWithDigit(n);
        assertEquals(expResult, result);
    }
    
     @Test
    public void test1(){
        System.out.println("primeSumWithDigit");
        int n = 1;
        int expResult = 0;
        int result = CSC325Mod14.primeSumWithDigit(n);
        assertEquals(expResult, result);
    }
    
}
