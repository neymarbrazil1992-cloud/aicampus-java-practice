package chapter03.if_test;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        //삼항연산자
        //String str = age>8 ? "학교에 다닙니다." :"학교에 다니지 않습니다.";

        //#1 if
        // int age = 5;
        Scanner scan=new Scanner(System.in); 
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();
        if (age >= 8){
            System.out.println("학교에 다닙니다.");
        }
        System.out.println("학교에 다니지 않습니다.");

        System.out.println("----------------------");
        
        // #2 If
        int age2 = 10;
        if (age2 >= 8){
            System.out.println("학교에 다닙니다.");
        }else{
        System.out.println("학교에 다니지 않습니다.");
        }
        
        

    }
}
