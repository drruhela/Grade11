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
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String direction1 = "";
        String direction2 = "";
        String output = "";
        
        int lastIndex;
        
        System.out.print("Enter a direction: ");
        String direction = input.nextLine().toLowerCase();
        lastIndex = direction.length() - 1;
        
        String degree = "";
        
        for (int i = 0; i < direction.length(); i++) {
            
            switch( direction.charAt(i) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    degree += direction.charAt(i);
        }
            
        }
       
        
        if (direction.charAt(0) == 'n') {
            direction1 = "North";
        }
        if (direction.charAt(0) == 'w') {
            direction1 = "West";
        }
        if (direction.charAt(0) == 'e') {
            direction1 = "East";
        }
        if (direction.charAt(0) == 's') {
            direction1 = "South";
        }
        
        
        if (direction.charAt(lastIndex) == 'n') {
            direction2 = "North";
        }
        if (direction.charAt(lastIndex) == 'w') {
            direction2 = "West";
        }
        if (direction.charAt(lastIndex) == 'e') {
            direction2 = "East";
        }
        if (direction.charAt(lastIndex) == 's') {
            direction2 = "South";
        }
        
        output = "Start facing " + direction1 + ". " + "Turn " + degree + " degrees " + direction2 + ".";
        System.out.println(output);
        
        
        
    }
    
}
