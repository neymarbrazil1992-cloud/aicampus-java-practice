package example;

import javax.swing.JOptionPane;

public class ifexam_01 {
    
    public static void main(String[] args) {
    //나이를 입력받아 입장 가능 여부를 출력하시오 
    //-> 8세 미만 : "입장할 수 없습니다."
    //-> 8세 이상 : "입장할 수 있습니다"
    // 단 나이가 0보다 작으면 "잘못된 나이 입니다."
       
    int age = Integer.parseInt(
        JOptionPane.showInputDialog("나이를 입력하시오."));
       
        if (age < 0) {
           JOptionPane.showMessageDialog(null,"잘못된 나이입니다." );
        }else if (age < 8) {
            System.out.println("입장할 수 없습니다!");
        }else  {
            System.out.println("입장할 수 있습니다.");
        }//if
 


    }//main
}//class
