package chapter03.if_test;

import java.util.Scanner;

public class conditionStatement_01 {
    public static void main(String[] args) {
        //서비스형태의 프로그램에 필수적으로 사용된다 
        //if(조건식){
                //조건이 참일때 실행}
        //if(조건식){//조건이 참일 때 실행}else//조건이 거짓일때 실행 

        // if(age>19) {} true|; - 간단할때는 삼항연산이 낫다.
        Scanner scan=new Scanner(System.in); 
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();
        if (age >= 8){
            System.out.println("학교에 다닙니다.");
        }else{
        System.out.println("학교에 다니지 않습니다.");}
    
    }
}
