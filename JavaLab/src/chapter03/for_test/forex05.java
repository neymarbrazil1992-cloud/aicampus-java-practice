package chapter03.for_test;

import javax.swing.JOptionPane;

public class forex05 {
    public static void main(String[] args) {
        //랜덤 공식 : 1~10 사이 공식 만들기 
        int answer = (int)(Math.random()* 10) + 1;

        //입력 받고 정수로 변환 
        String input = JOptionPane.showInputDialog("1~10사이 숫자를 맞춰보세요.");
        
        //힌트 여부 물어보기 
        int guess = Integer.parseInt(input);
        String retry = JOptionPane.showInputDialog("힌트가 필요하세요? (y/n)");

        if (answer % 2 == 0){
            System.out.println("힌트 : 정답은 짝수 입니다.");
        }else {
            System.out.println("힌트 : 정답은 홀수 입니다.");
        }
        

        if (guess == answer) {
            System.out.println("정답입니다!");
        } else if (guess > answer) {
            System.out.println("너무 큽니다.");
        } else {
            System.out.println("너무 작습니다.");
        }
        
            
        



    }//main
    
}//class
