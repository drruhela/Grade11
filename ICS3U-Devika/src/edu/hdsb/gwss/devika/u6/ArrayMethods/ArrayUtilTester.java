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
public class ArrayUtilTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] dataSet = ArrayUtil.randList(-100, 500, 100);

        //1A
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1A      : Selection Sort" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        // SORT DATA
        ArrayUtil.selectionSort( dataSet );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( dataSet );
        
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for( int i = 0; i < dataSet.length - 1; i++ ) {
            assert( dataSet[i] <= dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #1A RESULTS - passed" );
        
        
        //1B
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1B      : Bubble Sort" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        // SORT DATA
        ArrayUtil.bubbleSort(dataSet );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( dataSet );
        
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for( int i = 0; i < dataSet.length - 1; i++ ) {
            assert( dataSet[i] <= dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #1B RESULTS - passed" );
        
        //1C
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1C      : Selection Sort Descending" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, highest to lowest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        // SORT DATA
        ArrayUtil.selectionSortDescending( dataSet );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( dataSet );
        
        // CONFIRM; the value at index i must be greater than the value at index i+1
        for( int i = 0; i < dataSet.length - 1; i++ ) {
            assert( dataSet[i] >= dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #1C RESULTS - passed" );
        
        
        //1D
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1D      : Bubble Sort Descending" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : array sorted, highest to lowest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        // SORT DATA
        ArrayUtil.bubbleSortDescending(dataSet );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( dataSet );
        
        // CONFIRM; the value at index i must be greater than the value at index i+1
        for( int i = 0; i < dataSet.length - 1; i++ ) {
            assert( dataSet[i] >= dataSet[i+1] );
        }
        
        System.out.println( "TEST CASE #1D RESULTS - passed" );
        
        //1E
        
        String[] stringSet1 = {"sgasg", "ewg", "qwer", "abc", "def", "wgerg", "tyes", "zbdf", "usetyj", "ghsh"};
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1E      : Selection Sort Strings" );
        System.out.println( "PRE CONDITION      : unsorted array; mixed strings" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( stringSet1 );
        
        // SORT DATA
        ArrayUtil.selectionSortStrings( stringSet1 );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( stringSet1 );
        
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for( int i = 0; i < stringSet1.length - 1; i++ ) {
            assert( stringSet1[i].compareTo(stringSet1[i+1]) <= 0);
        }
        
        System.out.println( "TEST CASE #1E RESULTS - passed" );
        
        
        //1F
        
        String[] stringSet2 = {"sgasg", "ewg", "qwer", "abc", "def", "wgerg", "tyes", "zbdf", "usetyj", "ghsh"};
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1F      : Bubble Sort Strings" );
        System.out.println( "PRE CONDITION      : unsorted array; mixed strings" );
        System.out.println( "POST CONDITION     : array sorted, lowest to highest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( stringSet2 );
        
        // SORT DATA
        ArrayUtil.bubbleSortStrings( stringSet2 );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( stringSet2 );
        
        // CONFIRM; the value at index i must be lest than the value at index i+1
        for( int i = 0; i < stringSet2.length - 1; i++ ) {
            assert( stringSet2[i].compareTo(stringSet2[i+1]) <= 0);
        }
        
        System.out.println( "TEST CASE #1F RESULTS - passed" );
        
        
        //1G
        
        String[] stringSet3 = {"sgasg", "ewg", "qwer", "abc", "def", "wgerg", "tyes", "zbdf", "usetyj", "ghsh"};
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1G      : Selection Sort Strings Descending" );
        System.out.println( "PRE CONDITION      : unsorted array; mixed strings" );
        System.out.println( "POST CONDITION     : array sorted, highest to lowest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( stringSet3 );
        
        // SORT DATA
        ArrayUtil.selectionSortStringsDescending( stringSet3 );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( stringSet3 );
        
        // CONFIRM; the value at index i must be greater than the value at index i+1
        for( int i = 0; i < stringSet3.length - 1; i++ ) {
            assert( stringSet3[i].compareTo(stringSet3[i+1]) >= 0);
        }
        
        System.out.println( "TEST CASE #1G RESULTS - passed" );
        
        
        //1H
        
        String[] stringSet4 = {"sgasg", "ewg", "qwer", "abc", "def", "wgerg", "tyes", "zbdf", "usetyj", "ghsh"};
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1H      : Selection Sort Strings" );
        System.out.println( "PRE CONDITION      : unsorted array; mixed strings" );
        System.out.println( "POST CONDITION     : array sorted, highest to lowest" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( stringSet4 );
        
        // SORT DATA
        ArrayUtil.bubbleSortStringsDescending( stringSet4 );

        // DISPLAY SORTED ARRAY
        System.out.println( "DATA AFTER: " );
        ArrayUtil.printArray( stringSet4 );
        
        // CONFIRM; the value at index i must be greater than the value at index i+1
        for( int i = 0; i < stringSet4.length - 1; i++ ) {
            assert( stringSet4[i].compareTo(stringSet4[i+1]) >= 0);
        }
        
        System.out.println( "TEST CASE #1H RESULTS - passed" );
        
        
        //1I
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1I      : Minimum Value" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : minimum of the array" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        

        // DISPLAY Minimum value in list
        int min = ArrayUtil.minValue( dataSet );
        
        System.out.print( "Minimum Value: " );
        System.out.println(min);
        
        // CONFIRM; the value minimum is less than the value at index i
        for( int i = 0; i < dataSet.length; i++ ) {
            assert(  min <= dataSet[i] );
        }
        
        System.out.println( "TEST CASE #1I RESULTS - passed" );
        
        
        //1I
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1J      : Maximum Value" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : maximum of the array" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        // DISPLAY Maximum value in list
        int max = ArrayUtil.maxValue( dataSet );
        
        System.out.print( "Maximum Value: " );
        System.out.println(max);
        
        // CONFIRM; the value maximum is greater than the value at index i
        for( int i = 0; i < dataSet.length; i++ ) {
            assert(  max >= dataSet[i] );
        }
        
        System.out.println( "TEST CASE #1J RESULTS - passed" );
        
        
        //1K
        
        dataSet = ArrayUtil.randList(-100, 500, 100);
        
        System.out.println( "-------------------------------" );
        System.out.println( "TEST CASE #1K      : Average Value" );
        System.out.println( "PRE CONDITION      : unsorted array; + and - numbers" );
        System.out.println( "POST CONDITION     : Average of the array" );
                
        // DISPLAY ARRAY
        System.out.println( "DATA BEFORE: " );
        ArrayUtil.printArray( dataSet );
        
        

        // DISPLAY Minimum value in list
        int average = ArrayUtil.average( dataSet );
        
        System.out.print( "Average Value: " );
        System.out.println(min);
        
        // CONFIRM; the value minimum is less than the value at index i
        for( int i = 0; i < dataSet.length; i++ ) {
            assert(  min <= dataSet[i] );
        }
        
        System.out.println( "TEST CASE #1K RESULTS - passed" );
        

        
    }
    
    
    
}
