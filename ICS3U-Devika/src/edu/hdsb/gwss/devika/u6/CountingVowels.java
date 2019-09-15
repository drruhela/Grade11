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
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String sentence;
        int vowels = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Sentence: ");
        sentence = input.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            
            
            
            switch( sentence.charAt(i) ) {
                case 'a':  
                case 'e': 
                case 'i': 
                case 'o':
                case 'u':
                    vowels += 1;
                    break;
                    
            }
            
        
        }
        System.out.println(vowels);

    }

}
