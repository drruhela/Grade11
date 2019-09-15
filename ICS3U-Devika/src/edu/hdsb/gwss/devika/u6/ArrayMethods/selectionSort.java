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
public class selectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {4,7,3,5,6,7,8};
        
        selectionSortDescending(array);
        printArray(array);

    }
    

    public static void selectionSort(int[] data) {
        
        for (int last=data.length - 1; last > 0;last-- ){
            
            int maxIndex = 0;
            int max = data[maxIndex];
            
            for (int index=0; index <= last; index++ ){
                
                if (data[index] > max) {
                    maxIndex = index;
                    max = data[maxIndex];
                    
                }
                
  
            }
            
            int temp = data[last];
            data[last] = max;
            data[maxIndex] = temp;
            
            
            
        }
        
        
    }
    
    public static void selectionSortDescending(int[] data) {
        
        for (int last=data.length - 1; last > 0;last-- ){
            
            int maxIndex = 0;
            int max = data[maxIndex];
            
            for (int index=0; index <= last; index++ ){
                
                if (data[index] < max) {
                    maxIndex = index;
                    max = data[maxIndex]; 
                }
            }
            
            int temp = data[last];
            data[last] = max;
            data[maxIndex] = temp;
        }  
    }
    
    public static void printArray(int[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
}
