/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

import static edu.hdsb.gwss.devika.u6.ArrayMethods.BubbleSortStrings.bubbleSortStrings;

/**
 *
 * @author drruh
 */
public class BinarySearchStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] array = {"sgasg", "ewg", "qwer", "abc", "word", "def"};
        
        System.out.print("Unsorted list: ");
        printArray(array);
        
        bubbleSortStrings(array);
        
        System.out.print("Sorted list: ");
        printArray(array);
        
        System.out.println("Index: " + binarySearchStrings(array, "word"));
    }
    
    public static int binarySearchStrings(String[]data, String word) {
        int left = 0;
        int right = data.length - 1;
        int index = -1;
        
        
        while(left <= right ) {
            int mid = ((right - left)/ 2) + left;
            
            if (data[mid].compareTo(word) == 0) {
                index = mid;
                return index;
                
            }
                
            if (word.compareTo(data[mid]) < 0) {
                right = mid - 1; 
            }
            
            else {
                left = mid + 1; 
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
