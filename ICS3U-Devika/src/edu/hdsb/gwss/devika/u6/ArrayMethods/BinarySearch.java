/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6.ArrayMethods;

import static edu.hdsb.gwss.devika.u6.ArrayMethods.bubbleSort.bubbleSort;
import java.util.Random;

/**
 *
 * @author 1ruheladev
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = randList(1, 1000, 10);
        
        System.out.print("Unsorted list: ");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.print("Sorted list: ");
        printArray(array);
        System.out.println("Index: " + binarySearch(array,500));
    }
    
    public static int binarySearch(int[]data, int value) {
        int left = 0;
        int right = data.length - 1;
        int index = -1;
        
        
        while(left <= right ) {
            int mid = ((right - left)/ 2) + left;
            
            if (data[mid] == value) {
                index = mid;
                return index;
                
            }
                
            if (value < data[mid]) {
                right = mid - 1; 
            }
            
            else {
                left = mid + 1; 
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
