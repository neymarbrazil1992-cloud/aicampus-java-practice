package chapter03.if_test;

import javax.swing.JOptionPane;

public class if_05 {
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("값1: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("값2: "));
        //heap memory 
        if(num1 > num2){
            System.out.println("num1이 큽니다.");
        }else if(num1 < num2){
            System.out.println("num1이 작습니다.");
        }else if(num1 == num2){
            System.out.println("두 수가 같습니다.");
        }else{
            System.out.println("다시 입력하세요.");
        }//if//stack memory


    }//main
}//class
