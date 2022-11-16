/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmarks;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class averagemarks {
     public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        
        System.out.println("WELCOME TO KABALE UNIVERSITY STUDENT  MARKING SYSTEM");
        
        System.out.println("Enter number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
 
        average = totalMarks / count;
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + average);
        System.out.println("Percentage : " + percentage);
        
        System.out.println("THANK YOU FOR CONTACTING OUR SYSTEM");
        System.out.println("Designed by Akandwanaho Gracious");
    }
}

