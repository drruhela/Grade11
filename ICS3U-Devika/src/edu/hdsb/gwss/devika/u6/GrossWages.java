/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6;

import java.util.Scanner;

/**
 *
 * @author 1ruheladev
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         *Write a method that will accept a number of 
         *hours and an hourly rate of pay and then calculate
         *the gross wages.  Gross wages is calculated by 
         *multiplying the hourly rate of pay by the number of hours.
         *Overtime (when hours exceed 40) pay is calculated by 
         *paying the hourly rate of pay for the first 40 hours 
         *and adding to that the hours exceeding 40 at the hourly
         *rate times 1.5.
         */       
       
        Scanner input = new Scanner(System.in);
        
        int hoursWorked;
        double hourlyRate;
        
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = input.nextInt();
        
        System.out.print("Enter the hourly rate: ");
        hourlyRate = input.nextDouble();
        
        System.out.println(grossWage(hoursWorked, hourlyRate));
    }
    
    public static double grossWage(int hours, double hourlyRate) {
        int overtimeHours = 0;
        double overtimeRate = 0;
        double totalPay = 0;
        double normalPay = 0;
        double overtimePay = 0;
        
        if (hours > 40) {
            overtimeHours = hours - 40;
            hours = 40;
            overtimeRate = hourlyRate * 1.5;
            
        }    
        
        normalPay = hours * hourlyRate;
        overtimePay = overtimeHours * overtimeRate;
        totalPay = normalPay + overtimePay;
        
        return totalPay;
    }
    
    
}
