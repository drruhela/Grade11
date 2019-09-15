package edu.hdsb.gwss.devika.u6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 1ruheladev
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        String wordLower;
        String wordBackwardsLower = "";
        String wordBackwards = "";
        String output1 = "";
        String output2 = "";
        
        System.out.print("Enter a word: ");
        word = input.nextLine();
        
        wordLower = word.toLowerCase();
        int lastIndex = wordLower.length() - 1;
        
        for (int i = lastIndex ; i >= 0; i--) {
            char letterLower = wordLower.charAt(i);
            char letter = word.charAt(i);
            wordBackwardsLower += letterLower;
            wordBackwards += letter;
        }
        
        output1 = word + " backwards is " + wordBackwards + ".";
        
        boolean match = true;
        
        for (int i = 0; i <= lastIndex; i++) {
            if (wordLower.charAt(i) != wordBackwardsLower.charAt(i)) {
                match = false;
            }
        }
        
        if (match) {
            output2 = word + " is a palindrome.";
        }
        else {
            output2 = word + " is not a palindrome.";
        }
        
        System.out.println(output1);
        System.out.println(output2);
        
    }
    
}
