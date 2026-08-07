package practice01;

import javax.swing.JOptionPane;

public class lotto {
    public static void main(String[] args) {
        //로또 추첨기 프로그램 
         int number;
         int cnt = 0;
         int [] lotto = new int [6];

         System.out.println("========이번주 로또 예상 번호==========");
         number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요."));
    
        while (number > cnt) {

            System.out.println("[" + (cnt + 1) +  "]");

           outer:for(int i = 0; i < lotto.length; i++){
               lotto[i]=new Random().nextInt(45)+1; 
                //중복성 제거
                for(int j = 0; j<i ; j++){
                   
                    if (lotto[i]==lotto[j]){
                   i--;
                        continue outer; //분기점으로 이동 
                    }//if
                    
                }//in for

                System.out.print(lotto[i] + " ");
            }//for

            cnt++;
            System.out.println();
            
        }//while

        int number;
        int cnt = 0;
        int [] Lotto = new int [6];

        System.out.println("========이번주 로또 예상 번호==========");
        number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요."));

        while (number > cnt) {
            System.out.println("[" +(cnt + 1) + "]");
            outer:for()

        }

    
    }// main

}
