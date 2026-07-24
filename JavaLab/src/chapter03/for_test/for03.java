package chapter03.for_test;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        
    //sum 누적값이 입력받은 수를 초과하면 반복문을 멈추는 조건 

    int i, sum=0;

    Scanner scan = new Scanner(System.in);
    System.out.print("정수를 입력하세요: "); //20
    int num = scan.nextInt();
    
    for (i=1 ;; i++){
        sum += i; //sum+ sum+i
        System.out.println(i+ " ");

        if(sum >= num){
            System.out.println("최종 합: " + sum);
            break;
        }//if

    }//for

    }//main
}//class
