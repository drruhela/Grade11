/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

/**
 *
 * @author drruh
 */
public class LinearSearchStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] array = {"sgasg", "ewg", "qwer", "abc", "word", "def"};
        
        printArray(array);
        System.out.println("Index: " + linearSearchStrings(array,"word"));
        
    }
    
    public static int linearSearchStrings(String[] data, String word) {
        
        int index = -1;
        
        for (int i = 0 ; i < data.length; i++ ) {
            
            
            if (data[i].compareTo(word) == 0) {
                index = i;
                return index;
            }
 
        }
        
        return index;
    }
    
    public static void printArray(String[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
}
