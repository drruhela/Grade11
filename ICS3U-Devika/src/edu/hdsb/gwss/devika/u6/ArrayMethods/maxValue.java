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
public class maxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {4,7,3,5,6,7,8};
        
        System.out.println(maxValue(array));
    }
    public static int maxValue(int[] data) {
        
        int max = data[0];
        
        for( int i=1; i < data.length; i++) {
            
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
        
    }
}
