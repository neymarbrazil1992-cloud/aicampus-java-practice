package chapter03.if_test;

import javax.swing.JOptionPane;

public class ifPractice_00 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("현재 경험치를 입력하세요");
        int exp = Integer.parseInt(input);
         if ((exp >10000) || (exp <0)) {
                JOptionPane.showMessageDialog(null,"다시 입력하시오." );
            }
        if (exp >=1000) {
            System.out.println("레벨 5: 전설의 용사");
        } else if (exp >= 500){
            System.out.println("레벨 4: 베테랑 전사");
        } else if (exp >= 200){
            System.out.println("레벨 3: 숙련된 모험가");
        } else if (exp >= 50){
            System.out.println("레벨 2: 초보 모험가");
        } else {
            System.out.println("레벨 1: 신입 여행자");
        }
    }
}
