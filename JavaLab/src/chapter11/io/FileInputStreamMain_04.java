package chapter11.io;

import java.io.FileInputStream;

public class FileInputStreamMain_04 {
    public static void main(String[] args) {
        
     String filePath = "outputstram.txt";
     
     try(FileInputStream fis = new FileInputStream(filePath)) {
        int byteData;
        System.out.println("파일내용");

        while ((byteData=fis.read()) != -1) {
            System.out.print((char) byteData);
            
        }
        
     } catch (Exception e) {
        e.printStackTrace();
        System.out.println("파일을 읽는 도중 오류 발생: " + e.getMessage());
     }


    }//main
}//class
