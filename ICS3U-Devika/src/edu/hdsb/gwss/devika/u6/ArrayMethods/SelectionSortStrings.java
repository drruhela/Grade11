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
public class SelectionSortStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] array = {"sgasg", "ewg", "qwer", "abc", "def"};
        
        selectionSortStringsDescending(array);
        printArray(array);
    }
    
    public static void selectionSortStrings(String[] data) {
        
        for (int last=data.length - 1; last > 0;last-- ){
            
            int maxIndex = 0;
            String max = data[maxIndex];
            
            for (int index=0; index <= last; index++ ){
                
                if (data[index].compareTo(max) > 0) {
                    maxIndex = index;
                    max = data[maxIndex];
                    
                }
                
  
            }
            
            String temp = data[last];
            data[last] = max;
            data[maxIndex] = temp;
            

        }
           
    }
    
    public static void selectionSortStringsDescending(String[] data) {
        
        for (int last=data.length - 1; last > 0;last-- ){
            
            int maxIndex = 0;
            String max = data[maxIndex];
            
            for (int index=0; index <= last; index++ ){
                
                if (data[index].compareTo(max) < 0) {
                    maxIndex = index;
                    max = data[maxIndex];
                }
            }
            
            String temp = data[last];
            data[last] = max;
            data[maxIndex] = temp;
        }   
    }
    
    public static void printArray(String[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
}
