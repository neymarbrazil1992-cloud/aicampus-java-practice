package chapter11.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFile_01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

		System.out.print("파일에 저장할 내용을 입력하세요: ");
		String content = scan.nextLine();

        //반드시 !!         
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"))) {
           
            writer.write(content);
            System.out.println("내용을 파일에 저장하였습니다.");

        } catch (Exception e) {  //Exception Error가 발생되면 
           
            e.printStackTrace();  //Explain the Error
            System.out.println("파일을 쓰는 도중 오류 발생" + e.getMessage());
        } finally {
            scan.close();            
        }


    }//main
    
}//class
