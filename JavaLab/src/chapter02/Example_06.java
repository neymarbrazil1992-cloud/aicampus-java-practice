package chapter02;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        // 삼항연산자를 이용하여 score2가 90보다 크면 'A'이고
		// score2가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다.

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하시오");

        int score2 = scan.nextInt();
        // String rating = (score2 >= 90) ? "A":
        //                (score2 > 80) ? "B":
        //                 "C";
        char grade=score2 >= 90 ? 'A' : ((score2 >80) ? 'B': 'C'); //ABC하나씩 이니깐 char
        System.out.println("학점은"+grade+ " 입니다.");

    }
}
