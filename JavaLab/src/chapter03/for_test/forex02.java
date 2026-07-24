package chapter03.for_test;

import java.util.Scanner;

public class forex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal =scan.nextInt();
        System.out.println("목표 섭취량(ml)을 입력하세요: ");

        int cupSize = scan.nextInt();
        System.out.println("한 잔당 용량(ml)을 입력하세요: ");

        int cup;
        int total = 0;

        for (cup = 1;; cup++) {
            if (cup % 3 == 0){
                continue;
            } //if                  
             total += cup;
             System.out.println(cup + " 컵 :누적" + total +"ml" );

            if (total >= goal) {
                System.out.println("목표달성! 총" + cup + "개.");
                break;
            }//if2
            
            }//for 

    }//main
}//class
