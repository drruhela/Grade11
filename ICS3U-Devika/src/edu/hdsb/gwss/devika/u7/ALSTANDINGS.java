package edu.hdsb.gwss.devika.u7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Serializer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drruh
 */
public class ALSTANDINGS {
    
    static Document doc;
    static Element root;
    static Document doc2;
    static Element root2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File file = new File("AL.STANDINGS.xml");
        File file2 = new File("AL.EAST.STANDINGS.xml");
        
        readXML(file, file2);
        
        String first= root.getChildElements().get(0).getFirstChildElement("name").getValue();
        //System.out.println(first);
        
        System.out.println("American League East");
        System.out.println("--------------------");
        System.out.format("%-10s %8s\n", "Team", "record");
        for (int element = 0; element < root.getChildElements().size(); element++) {
            String name =  root.getChildElements().get(element).getFirstChildElement("name").getValue();
            String division =  root.getChildElements().get(element).getFirstChildElement("division").getValue();
            String record =  root.getChildElements().get(element).getFirstChildElement("record").getValue();
            
            if (division.compareTo("East") == 0) {
                
                System.out.format("%-10s %8s\n", name, record, "\n");
            }
            
        }
        System.out.println("");
        
        
        System.out.println("American League Central");
        System.out.println("--------------------");
        System.out.format("%-10s %8s\n", "Team", "record");
        for (int element = 0; element < root.getChildElements().size(); element++) {
            String name =  root.getChildElements().get(element).getFirstChildElement("name").getValue();
            String division =  root.getChildElements().get(element).getFirstChildElement("division").getValue();
            String record =  root.getChildElements().get(element).getFirstChildElement("record").getValue();
            
            if (division.compareTo("Central") == 0) {
                
                System.out.format("%-10s %8s\n", name, record, "\n");
            }
            
        }
        System.out.println("");
        
        
        System.out.println("American League West");
        System.out.println("--------------------");
        System.out.format("%-10s %8s\n", "Team", "record");
        for (int element = 0; element < root.getChildElements().size(); element++) {
            String name =  root.getChildElements().get(element).getFirstChildElement("name").getValue();
            String division =  root.getChildElements().get(element).getFirstChildElement("division").getValue();
            String record =  root.getChildElements().get(element).getFirstChildElement("record").getValue();
            
            if (division.compareTo("West") == 0) {
                
                System.out.format("%-10s %8s\n", name, record, "\n");
            }
            
        }
        
        writeXML();
        
        
        
        
        
        
        
     

    } 
    
    public static void readXML(File file, File file2) {
        
        Builder builder = new Builder();
        
        if(file.exists()) {

            try {
                doc = builder.build(file);
                root = doc.getRootElement();
                
                Elements ALListings = root.getChildElements();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            root = new Element("ALListings");
            doc = new Document(root);
        }
        
        if (file2.exists()) {
            try {
                doc2 = builder.build(file2);
                root2 = doc2.getRootElement();
                
                Elements ALEASTListings = root.getChildElements();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            root2 = new Element("ALEASTListings");
            doc2 = new Document(root2);
        }
        
    }
    
    public static void writeXML() {

        for (int element = 0; element < root.getChildElements().size(); element++) {
            Element team2 = new Element("team");
            Element name2 =  new Element(root.getChildElements().get(element).getFirstChildElement("name"));
            Element division2 =  new Element(root.getChildElements().get(element).getFirstChildElement("division"));
            Element record2 =  new Element(root.getChildElements().get(element).getFirstChildElement("record"));
            
            
            if ( (division2.getValue()).compareTo("East") == 0) {
                
                team2.appendChild(name2);
                team2.appendChild(division2);
                team2.appendChild(record2);
                
                root2.appendChild(team2);
                
                
            }
   
        }

        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(doc);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        try {
            FileWriter file = new FileWriter("AL.EAST.STANDINGS.xml");
            BufferedWriter writer = new BufferedWriter(file);
            writer.write(doc2.toXML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
        
    
    
}
