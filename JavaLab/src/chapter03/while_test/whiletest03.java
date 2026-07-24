package chapter03.while_test;

import java.util.Scanner;

public class whiletest03 {
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);

     while (true) {
        System.out.print("Java 교과목 점수를 입력하세요.");
        int scr = scan.nextInt();

        //if -> 60점 이상이면 합격 그밖에 불합격
        
        if (scr<0 || scr>100){
            System.out.println("점수를 다시 입력하시오!");
            
        }else if (scr >=60){
            System.out.println("합격!");
            break;
        }else 
            System.out.println("불합격!");
            break;
     }
    

    }
}
