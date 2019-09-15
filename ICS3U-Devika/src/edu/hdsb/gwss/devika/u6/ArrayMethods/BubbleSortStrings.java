/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

/**
 *
 * @author 1ruheladev
 */
public class BubbleSortStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String[] array = {"sgasg", "ewg", "qwer", "abc", "def"};
        
        bubbleSortStringsDescending(array);
        printArray(array);
        
    }
    
    public static void bubbleSortStrings(String[] data) {
        
        int length = data.length;
        
        for (int i=0; i < length; i++) {
            
            for (int j=0; j < length-1; j++) {
                
                if (data[j].compareTo(data[j+1]) > 0) {
                    String temp = data[j + 1];
                    data[j+1] = data[j];
                    data[j] = temp;
                    

                }
            }
            
        }
    }
    
    public static void bubbleSortStringsDescending(String[] data) {
        
        int length = data.length;
        
        for (int i=0; i < length; i++) {
            
            for (int j=0; j < length-1; j++) {
                
                if (data[j].compareTo(data[j+1]) < 0) {
                    String temp = data[j + 1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    
    public static void printArray(String[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
}
