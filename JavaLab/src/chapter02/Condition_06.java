package chapter02;

import java.util.Scanner;

public class Condition_06 {
    public static void main(String[] args) {
        
        //삼항 연산 
        int a=10;
        int b=15;
        boolean result; //참과 거짓을 판별

        result=a>b? true:false;
        //    -조건+>1   :0 문자열 아님 ""을 쓰면 안됨, 기호임
        System.out.println(result); 

        int n1=10;
        int n2=20;
        char result2; 

        result2= (++n1 == n2) ? 'Y' : 'N'; //n1=n1+1 
        System.out.println(result2);

        System.out.println("--------------");

        Scanner scan=new Scanner(System.in); 
        System.out.print("나이를 입력하세요:");
        int age= scan.nextInt();
        //System.out.println(age);

        String result3;
        result3= age >= 19 ? "성인" : "미성년";
        System.out.println(result3);
        

        System.out.println("--------------");
        // int fatherAge=38;
        // int motherAge=45;
        System.out.println("아빠 나이를 입력하세요");
        int fatherAge = scan.nextInt();
        System.out.println("엄마 나이를 입력하세요");
        int motherAge = scan.nextInt();

        

        String ch =(fatherAge > motherAge) ? "연상" : "연하";
        // ch= motherAge > fatherAge ? "연상" : "연하";
        System.out.println(ch);




        
    }//main
}//class
