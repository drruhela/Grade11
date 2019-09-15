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
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {4, 7, 3, 5, 6, 7, 8};
        
        System.out.println(sum(array));
    }
    
    public static int sum(int[] data) {
        
        int sum = 0;
        
        for (int index = 0; index < data.length; index ++) {
            
            sum += data[index];
        }
        
        return sum;
    }
    
}
