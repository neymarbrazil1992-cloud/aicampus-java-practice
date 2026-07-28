package chapter06;

import java.util.Scanner;

public class UpDownMain {
    public static void main(String[] args) {
        
        int select;
        String check;
        
        UpDown_06 updown = new UpDown_06();
    
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("숫자를 입력하세요(1~50): ");
            select = scan.nextInt();

            if (select<0 || select > 50){
                System.out.println("숫자를 다시 입력해주세요!");
                continue;
            }
            
            check = updown.check(select);

            if (check.equals("SUCCESS")) {
                System.out.println("정답입니다! 프로그램을 종료합니다.");
                System.exit(0);
            }


            
        }//while
        
        
       


        
    
    }//main
}//class
