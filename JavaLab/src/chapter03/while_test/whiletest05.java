package chapter03.while_test;

import java.util.Scanner;

public class whiletest05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num, cnt=0, sum=0;
        double avg;

        while (true) {
            System.out.println("숫자를 입력하세요(stop->0)");
            num = scan.nextInt();
            if (num==0){
                break;
            }
            cnt ++;
            sum +=num;

        }//while
        avg = (double) sum/cnt;
        System.out.print("입력된 숫자의 갯수: "+ cnt + "\n");
        System.out.print("입력된 숫자의 합계: "+ sum + "\n");
        System.out.printf("입력된 숫자의 평균: %.3f ",avg);

        




    }//main
}//class
