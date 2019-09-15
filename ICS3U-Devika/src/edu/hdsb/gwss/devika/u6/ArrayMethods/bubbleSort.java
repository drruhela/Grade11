/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

import static edu.hdsb.gwss.devika.u6.ArrayMethods.minValue.minValue;

/**
 *
 * @author 1ruheladev
 */
public class bubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {4,7,3,5,6,7,8};
        
        bubbleSortDescending(array);
        printArray(array);
    }
    
    
    public static void bubbleSort(int[] data) {
    
        int length = data.length;
        
        for (int i=0; i < length; i++) {
            
            for (int j=0; j < length-1; j++) {
                
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j+1] = data[j];
                    data[j] = temp;
                    

                }
            }
            
        }
               
        
    }
    
    public static void bubbleSortDescending(int[] data) {
    
        int length = data.length;
        
        for (int i=0; i < length; i++) {
            
            for (int j=0; j < length-1; j++) {
                
                if (data[j] < data[j + 1]) {
                    int temp = data[j + 1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }   
        }
    }
    
    
    public static void printArray(int[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
