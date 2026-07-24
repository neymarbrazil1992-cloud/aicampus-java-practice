package example;

import java.util.Scanner;

public class whileexam01 {
    public static void main(String[] args) {
        
    /*
    
    */
   Scanner scan = new Scanner(System.in);
   System.out.println("메세지를 입력하세요");
   System.out.println("종료하려면 no를 입력하세요");

   String inputString;
   
   do{
    System.out.print("> ");
    inputString=scan.nextLine();
    System.out.println(inputString);

   }while(!inputString.equals("no"));

   System.out.println();
   System.out.println("프로그램 종료");

    }//main
}//class
