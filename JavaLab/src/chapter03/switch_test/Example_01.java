package chapter03.switch_test;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        /*사용자로부터 월을 입력받아, 해당 월의 계절을 출력하는 프로그램을 작성하세요.
		 * 봄:3-5월, 여름:6-8월, 가을:9-11월, 겨울: 12-2월*/

        Scanner scan = new Scanner(System.in);

        System.out.println("월을 입력하세요.");
        
        int month = scan.nextInt();
       
            
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("봄입니다!");
                    
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("여름입니다!");
                    
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("가을입니다!");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("겨울입니다!");
                    break;    
            
                default:
                    System.out.println("(1~12)월 번호를 다시입력해주세요.");
                    break;
            }
            



    }//main
}//class
