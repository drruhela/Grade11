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
public class AverageValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {4, 7, 3, 5, 6, 7, 8};

        System.out.println(average(array));
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

}
