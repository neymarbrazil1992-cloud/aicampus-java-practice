package chapter03.switch_test;

import java.util.Scanner;

public class switchCase_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("회원의 등급은 어떻게 되나요?");
        // A,a - > 최우수 고객
        // B,b - > 우수 고객
        // 나머지 - > 일반 고객

        // charAt(0) : String -> 첫번째 문자만 가져옴 -> char
        String input = scan.nextLine();
        if (input.length() != 1) {
            System.out.println("잘못된 입력입니다. 한글자만 입력하세요.");
        }else {
        
        char grade = scan.nextLine().charAt(0);
        switch (grade) {
            case 'a':
            case 'A': 
                System.out.println("최우수 고객입니다.");
                break;

            case 'B':
            case 'b':
                System.out.println("우수 고객입니다.");

                break;
            case 'C':
            case 'c':
                System.out.println("일반 고객입니다.");

                break;

            default:

                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

    }// main
}// class
