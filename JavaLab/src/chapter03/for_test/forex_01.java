package chapter03.for_test;

import java.util.Scanner;

public class forex_01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner((System.in));
        System.out.println("목표 저축액을 입력하세요: ");
        int goal = scan.nextInt();

        System.out.println("매달 저축액을 입력하세요.");
        int monthlysaving = scan.nextInt();
        int month;
        int total = 0;
        for (month = 1;;month++) {
            if (month % 2 == 1 ){
                //홀수 달 : 저축 건너뛰기
                continue;
            }
            
            total += monthlysaving;
            System.out.println(month + "월: 누적" + total +"원");

            if (total >= goal) {
                System.out.println("목표달성! 총" + month + "개월 걸렸습니다.");
                break;
            }
            }//for

        

    }
}
