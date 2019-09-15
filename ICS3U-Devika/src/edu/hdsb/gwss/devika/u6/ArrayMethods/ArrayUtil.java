package edu.hdsb.gwss.devika.u6.ArrayMethods;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1ruheladev
 */
public class ArrayUtil {
    
    public static int maxValue(int[] data) {
        
        int max = data[0];
        
        for( int i=1; i < data.length; i++) {
            
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
        
    }
    
    public static int minValue(int[] data) {
        
        int min = data[0];
        
        for( int i=1; i < data.length; i++) {
            
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
        
    }
    
    public static int sum(int[] data) {
        
        int sum = 0;
        
        for (int index = 0; index < data.length; index ++) {
            
            sum += data[index];
        }
        
        return sum;
    }
    
    public static double average(int[] data) {

        double sum = 0;
        int length = data.length;
        for (int i = 0; i < length; i++) {

            sum += data[i];
        }

        double avg = sum / length;
        return avg;
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
    
    public static int[] randList(int min, int max, int size) {
        
        Random rand = new Random();
        int[] listOfRandoms = new int[size];
        
        for (int num = 0; num < size; num++) {
            int value = rand.nextInt(max) + min;
            listOfRandoms[num] = value;
            
        }
        return listOfRandoms;
    }
    
    public static void randomizeStrings(String[] data) {
        
        
    }
    
    public static void printArray(int[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
    public static void printArray(String[] data) {
        
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
