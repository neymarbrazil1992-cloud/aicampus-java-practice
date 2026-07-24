package example;

import java.util.Scanner;

public class Arrexam06 {
    public static void main(String[] args) {
        boolean run = true;
        double[] rate = null;

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.종목수 입력 | 2.등락률 입력 | 3.보유종목 조회 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scan.nextLine());

            if (selectNo == 1) {
                System.out.print("종목수: ");
                int stockNum = Integer.parseInt(scan.nextLine());
                rate = new double[stockNum];
                System.out.println("종목수가 정상적으로 등록되었습니다.\n");

            } else if (selectNo == 2) {
                if (rate == null) {
                    System.out.println("먼저 종목수를 입력해주세요.\n");
                } else {
                    for (int i = 0; i < rate.length; i++) { //rate.length는 위 입력값의 크기만큼 출력을 실행한다.
                        System.out.println("각 종목의 등락률(%)을 입력해주세요.");
                        System.out.print("stock[" + (i + 1) + "]> ");
                        rate[i] = Double.parseDouble(scan.nextLine());
                    }
                    System.out.println();
                }

            } else if (selectNo == 3) {
                if (rate == null) {
                    System.out.println("먼저 종목수를 입력해주세요.\n");
                } else {
                    for (int i = 0; i < rate.length; i++) {
                        System.out.println("student[" + (i + 1) + "]> " + rate[i] + " %");
                    }
                    System.out.println();
                }               

                
            } else if (selectNo == 4) {
                if (rate == null) {
                    System.out.println("먼저 종목수를 입력해주세요.\n");
                } else {
                    double max = rate[0];  
                    double min = rate[0];
                    double sum = 0;
                    int upCount = 0;
                    int downCount = 0;
                    boolean hasPositive = false;
                    
                    for (int i = 0; i<rate.length ; i++ ){
                        max = max < rate[i] ? rate[i] : max;
                        min = min > rate[i] ? rate[i] : min;
                        sum += rate[i];

                        if (rate[i] > 0) {
                            hasPositive = true;
                            upCount++;
                        }else if (rate[i])

                    }
                    // int max = rate[0];   // 0이 아니라 배열의 첫 값으로 시작
                    // int min = rate[0];
                    // int sum = 0;

                    // for (int i = 0; i < rate.length; i++) {
                    //     max = max < rate[i] ? rate[i] : max;
                    //     min = min > rate[i] ? rate[i] : min;
                    //     sum += rate[i];
                    // }
                    // double avg = (double) sum / rate.length;  //

                    // System.out.println("최고 상승률: " + max);
                    // System.out.println("총점: " + sum);
                    // System.out.println("평균: " + avg + "\n");
                
            } else if (selectNo == 5) {
                run = false;
            } else {
                System.out.println("없는 서비스 번호를 입력하셨습니다.\n");
            }//if
            
        }//while
        System.out.println("프로그램을 종료합니다.");



    }//main
}//class
