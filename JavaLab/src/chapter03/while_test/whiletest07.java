package chapter03.while_test;

import javax.swing.JOptionPane;

public class whiletest07 {
    public static void main(String[] args) {
        
        int num1;
        int num2;

        do {
            num1 = 1;
            num2 = 2;
            Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
            Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));

            if (num1 == num2) {
                System.out.println("인증성공! !");
            }else{
                break;
            }

        } while (num1 != num2);
        
        System.out.println("프로그램 종료");


    }
}
