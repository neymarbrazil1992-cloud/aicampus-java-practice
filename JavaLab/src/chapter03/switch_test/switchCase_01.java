package chapter03.switch_test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class switchCase_01 {
    public static void main(String[] args) {
        
        int ranking;
        char medalColor;
        //  Scanner scan=new Scanner(System.in); 
        //  System.out.println("등수를 입력하세요.");
        //  int ranking1 = scan.nextInt();
        int ranking1 = Integer.parseInt (JOptionPane.showInputDialog("등수를 입력하세요."));
        switch (ranking1) {
            case 1:{
                medalColor = 'G';
                 break;
            }case 2 : {
                medalColor = 'S';
                 break;
            }case 3 : {
                medalColor = 'B';     
                 break;    
            }default : {
                medalColor = 'O';
            }
             
            }//switch
            //간단한 작업에 대해서 간편하게 쓰기 용이 
            
            System.out.println(ranking1 + "등 메달은 " + medalColor + "입니다.");


    }//main
}//class
