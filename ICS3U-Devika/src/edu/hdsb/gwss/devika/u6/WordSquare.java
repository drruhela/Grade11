/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6;

/**
 *
 * @author 1ruheladev
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String word = "computers";
        int lastIndex = word.length();
        

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
            
            word = word.substring(1, lastIndex) + word.charAt(0);
        }
              
    }
    
}
