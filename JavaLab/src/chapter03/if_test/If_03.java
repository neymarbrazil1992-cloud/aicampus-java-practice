package chapter03.if_test;

import javax.swing.JOptionPane;

public class If_03 {
    public static void main(String[] args) {
        
        char grade = 0;
        int score;

        score = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
        
        //#1
        // if(score >= 90) {
        //     System.out.println('A');
        //     } else if(score >= 80){
        //         System.out.println('B');
        //     } else if(score >= 70){
        //         System.out.println('C');
        //     } else if(score >=60){
        //         System.out.println('D');
        //     } else {
        //         System.out.println('F');
        //     }
            System.out.println("-------------------------");

            if((score >100) || (score <0)) {
                JOptionPane.showMessageDialog(null,"판단 할 수 없는 점수입니다." );
            } else if(score >= 90){
                grade = 'A';
                JOptionPane.showMessageDialog(null,"최우수 학생입니다." );
                }else if (score >=80) {
                    grade = 'B';
                    JOptionPane.showMessageDialog(null,"우수 학생입니다." );
                }else if (score >=70){
                    grade = 'C';
                }else if (score >=60){
                    grade = 'D';
                }else {
                    grade ='F';
                }    

                    
                
                
            

            // {System.out.println("값을 다시 입력하세요");

            // if(score >= 90) {
            // System.out.println('A');
            // } else if(score >= 80){
            //     System.out.println('B');
            // } else if(score >= 70){
            //     System.out.println('C');
            // } else if(score >=60){
            //     System.out.println('D');
            // } else {
            //     System.out.println('F');
            // }
        


    }//main
}//class
