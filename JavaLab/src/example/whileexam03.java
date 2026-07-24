package example;

import java.util.Scanner;

public class whileexam03 {
    public static void main(String[] args) {
        
        boolean run = true; // 제어 플래스 패턴 
        int balance = 0; //예금(+), 출금(-)

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
            System.out.println("선택-> ");
            int num = Integer.parseInt(scan.nextLine()); //num 에 입력되고 입력하는 순간 한줄이 버퍼에 남김
            // 이후에 scan.nextLine(); 를 사용하면 버퍼에 한줄이 따라와서 에러가 생김
            // scan.nextLine()은 엔터로 발생되는 한줄을 무시(버리고) 하고 진행 
            if (num < 1 || num > 4) {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                System.out.println("");
                continue;
             
            }//if
            switch (num) {
                case 1 :
                    System.out.println("예금을 선택하셨습니다.");
                    System.out.println("현재 잔액: " + balance);
                    System.out.print("예금액: " );
                    int money = Integer.parseInt(scan.nextLine());
                    
                    if(money < 0) {
                        System.out.println("금액을 잘못 입력했습니다.");
                    } else {
                        balance+=money;
                        
                        System.out.println("현재잔액: " + (balance) +"원 입니다.");
                    }
                    
                    System.out.println();
                    
                    break;
                case 2 :
                    System.out.println("출금을 선택하셨습니다.");
                    System.out.println("출금액: ");
                    int money2 = Integer.parseInt(scan.nextLine());
                    if(money2 < 0) {
                        System.out.println("금액을 잘못 입력했습니다.");
                    }else if(money2 > balance) {
                        System.out.println("잔액이 부족합니다.");
                    }else{
                        balance-=money2;
                        System.out.println("현재잔액: " + balance +"원 입니다.");
                        
                        break;
                    }                   
                    
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("잔고를 선택하셨습니다.");
                    System.out.println("잔액: " + balance +"원 입니다.");
                    
                    break;
            
                default:
                    run = false;
                    
            }//switch
            
    
           
            

         

        }//while
        System.out.println("");
        System.out.println("시스템 종료");

    }//main
}//class
