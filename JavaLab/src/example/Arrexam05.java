package example;

import java.util.Scanner;

public class Arrexam05 {
    public static void main(String[] args) {

        boolean run = true;
        int[] score = null;

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scan.nextLine());

            if (selectNo == 1) {
                System.out.print("학생수: ");
                int studentNum = Integer.parseInt(scan.nextLine());
                score = new int[studentNum];
                System.out.println("배열이 생성되었습니다.\n");

            } else if (selectNo == 2) {
                if (score == null) {
                    System.out.println("먼저 학생수를 입력해주세요.\n");
                } else {
                    for (int i = 0; i < score.length; i++) {
                        System.out.print("student[" + (i + 1) + "]> ");
                        score[i] = Integer.parseInt(scan.nextLine());
                    }
                    System.out.println();
                }

            } else if (selectNo == 3) {
                if (score == null) {
                    System.out.println("먼저 학생수를 입력해주세요.\n");
                } else {
                    for (int i = 0; i < score.length; i++) {
                        System.out.println("student[" + (i + 1) + "]> " + score[i] + " 점");
                    }
                    System.out.println();
                }

            } else if (selectNo == 4) {
                if (score == null) {
                    System.out.println("먼저 학생수를 입력해주세요.\n");
                } else {
                    int max = score[0];   // 0이 아니라 배열의 첫 값으로 시작
                    int sum = 0;

                    for (int i = 0; i < score.length; i++) {
                        max = max < score[i] ? score[i] : max;
                        sum += score[i];
                    }
                    double avg = (double) sum / score.length;  // studentNum 대신 score.length

                    System.out.println("최고점수: " + max);
                    System.out.println("총점: " + sum);
                    System.out.println("평균: " + avg + "\n");
                }

            } else if (selectNo == 5) {
                run = false;

            } else {
                System.out.println("없는 서비스 번호를 입력하셨습니다.\n");
            }
        }
        System.out.println("프로그램을 종료합니다.");

        
    }//main
}//class
