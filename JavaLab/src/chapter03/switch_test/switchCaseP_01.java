package chapter03.switch_test;

import javax.swing.JOptionPane;

public class switchCaseP_01 {
    public static void main(String[] args) {
        int day = Integer.parseInt(JOptionPane.showInputDialog("오늘 요일 번호 (1~7)를 입력하세요"));
        String plan;

        switch (day) {
            case 1:
            case 3:
                plan = "학원 수업 있는 날: 복습 필수";    
                break;
            case 2:
            case 4: 
                plan = "자율학습일: 프로젝트 진행";  
                break;  
            case 5: 
                plan = "주간 정리 : 배운 내용 복습";
                break;
            case 6:
            case 7: 
                plan = "휴식 또는 탄빵이와 좋은시간!";
                break;
            default:
                plan = "잘못된 요일 번호입니다.";
                break;
        }
        System.out.println(day + "요일 계획: " + plan);

        
    }//main 
}//case
