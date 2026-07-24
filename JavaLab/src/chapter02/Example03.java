package chapter02;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        
        // #1 
        //삼항연산자를 이용하여 score가 60보다 크거나 같으면 합격
        //그렇지 않으면 불합격으로 반환 하시오 
        //조건?합격 불합격

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        int score1 = scan.nextInt();

        String pass = (score1 >=60) ? "합격" : "불합격";
        System.out.println(pass + "입니다.");

        
        

        


    }
}
