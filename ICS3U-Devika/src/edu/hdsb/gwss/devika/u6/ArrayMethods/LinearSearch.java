/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

import java.util.Random;

/**
 *
 * @author 1ruheladev
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = randList(1, 1000, 10);
        printArray(array);
        System.out.println("Index: " + linearSearch(array,5));
    }
    
    public static int linearSearch(int[] data, int num) {
        
        int index = -1;
        
        for (int i = 0 ; i < data.length; i++ ) {
            
            
            if (data[i] == num) {
                index = i;
                return index;
            }
 
        }
        
        return index;
    }
    
    public static void printArray(int[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
    public static int[] randList(int min, int max, int size) {
        
        Random rand = new Random();
        int[] listOfRandoms = new int[size];
        
        for (int num = 0; num < size; num++) {
            int value = rand.nextInt(max) + min;
            listOfRandoms[num] = value;
            
        }
        
        return listOfRandoms;
    }
    
}
