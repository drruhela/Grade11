/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.devika.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1ruheladev
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        File file = new File("example.txt");
        
        Scanner input = new Scanner( file);
        
        PrintWriter output = new PrintWriter( file );
        
        output.print("A");
        output.print("B");
        output.println("C");
        output.println("123");
        
        output.close();
        
        while (input.hasNext() ) {
            System.out.println( input.nextLine() );
        }
        
        input.close();
    }
    
}
