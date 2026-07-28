package practice;

import java.util.Scanner;

public class RPSMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();

        while (true) {

            System.out.println("가위(1) 바위(2) 보(3) 중 하나를 선택하시오: ");
            int select = scan.nextInt();

            if (select < 1 || select > 3) {
                System.out.println("1~3 중에서 다시 입력해주세요!");
                continue;                
            }

            String check = rps.play(select);

            if (check.equals("WIN")) {
                System.out.println("축하합니다! " + rps.getCount() + "번 만에 승리 하셨습니다.");
                System.exit(0);
            }
            
        }


    }//main
    
}//class
