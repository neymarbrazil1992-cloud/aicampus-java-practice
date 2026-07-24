package chapter02;

import java.util.Scanner;

public class practice_00 {
    public static void main(String[] args) {
        //Scanner를 이용하여 100m 달리기 기록(초)을 입력받으세요(record)
        //기록에 따라 등급을 판정하세요
        /*-12초 미만 : "올림픽 선수급!" (record < 12)
        -15초 미만 : "운동선수급!" (record < 15)
        -15초 이상 : "일반인 수준"
        3. 입력받은 기록이 짝수인지 홀수인지도 판별하세요.
        4.두 개의 삼항연산자를 각각 사용하세요.
        5.출력형식 (등급)올림픽 선수급! 기록분석: 짝수 기록입니다.
    
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("100m 달리기 기록(초)을 입력하시오: ");
        double record = scan.nextDouble();

        String grade = (record<12) ? "올림픽 선수급!":
                       (record<15) ? "운동선수급!":
                       "일반인 수준";
        String evenOdd = (record%2==0) ? "짝수" : "홀수";
        System.out.println("등급 : "+grade);
        System.out.println("기록분석: "+evenOdd + " 기록입니다.");

    }
}
