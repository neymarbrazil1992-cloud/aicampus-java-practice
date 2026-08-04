package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFileMain_02 {
    public static void main(String[] args) {
        
   
        //반드시 !!         
        try(BufferedReader reader = new BufferedReader(new FileReader("output.txt"))); {
           String line;
           System.out.println("파일내용");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                
            }

          

        } catch (Exception e) { 
            e.printStackTrace();
            System.out.println(e.getMessage());
        } 

    }//main

}//class
