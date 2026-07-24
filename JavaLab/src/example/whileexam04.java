package example;

import java.util.Scanner;

public class whileexam04 {
    public static void main(String[] args) {

        boolean run = true; // 제어 플래스 패턴 
        int balance = 0; //예금(+), 출금(-)

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
            System.out.print("선택-> ");
            int num = Integer.parseInt(scan.nextLine()); //num 에 입력되고 입력하는 순간 한줄이 버퍼에 남김
            // 이후에 scan.nextLine(); 를 사용하면 버퍼에 한줄이 따라와서 에러가 생김
            // scan.nextLine()은 엔터로 발생되는 한줄을 무시(버리고) 하고 진행 
            if (num < 1 || num > 4) {
                System.out.println("숫자를 잘못 입력하셨습니다. 다시입력해주세요(1~4)");
                System.out.println("");
                continue;
             
            }else if (num == 1) {
                System.out.println("예금을 선택하셨습니다.");
                System.out.println("현재 잔액: " + balance);
                int money = Integer.parseInt(scan.nextLine());
                System.out.print("예금하려는 금액을 입력하여주십시오: " + money +" 원"  );
                
                    
                    if(money < 0) {
                        System.out.println("금액을 잘못 입력했습니다.");
                    } else {
                        balance+=money;
                        
                        System.out.println("현재잔액: " + balance +" 원 입니다.");
                    }
                    
                    System.out.println();
                    
                    

            }else if (num == 2) {
                System.out.println("출금을 선택하셨습니다.");
                    int money2 = Integer.parseInt(scan.nextLine());
                    System.out.println("출금하려는 금액을 입력하여주십시오: " + money2 + " 원");
                    
                    if(money2 < 0) {
                        System.out.println("금액을 잘못 입력했습니다.");
                    }else if(money2 > balance) {
                        System.out.println("잔액이 부족합니다.");
                    }else{
                        balance-=money2;
                        System.out.println("현재잔액: " + balance +" 원 입니다.");
                        
                        
                    }
          }else if (num == 3) {
            System.out.println("잔고를 선택하셨습니다.");
                    System.out.println("현재잔액: " + balance +" 원 입니다.");
                    
                    
          }else{
             run = false;
          }//if

          }//while
        System.out.println("");
        System.out.println("시스템 종료");
                




            
        
    }//main
}//class
