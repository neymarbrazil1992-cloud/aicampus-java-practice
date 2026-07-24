package chapter03.switch_test;

import java.util.Scanner;

public class Example_02 {
    /*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("뭐 먹을까요?");
        String str;
        str = scan.nextLine(); //요일 입력
        
        
        switch (str) {
            case "월요일":
                System.out.println("아무거나");
                break;
            case "화요일":
                System.out.println("아무거나2");
                break;
            case "수요일":
                System.out.println("아무거나3");
                break;
            case "목요일":
                System.out.println("아무거나4");
                break;
            case "금요일":
                System.out.println("아무거나5");
                break;
            case "토요일":
                System.out.println("아무거나6");
                break;
            case "일요일":
                System.out.println("아무거나7");
                break;
        
            default:
                System.out.println("요일을 다시 입력해주세요.");
                break;
        }


    }
}
