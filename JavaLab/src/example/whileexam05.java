package example;

import java.util.Scanner;

public class whileexam05 {
    public static void main(String[] args) {
        /* 
        while, if, for 문을 활용하여 카페 주문을 처리하는 콘솔 프로그램을 작성하세요. 
        사용자가 메뉴를 종료할 때까지 반복해서 주문할 수 있어야 합니다.

        1. 메인 메뉴

        프로그램 실행 시 아래와 같은 메뉴가 반복 출력되어야 합니다.

        ╔═══════════════════════════════════════╗
        ║       ☕ 스마트 카페 주문 시스템 ☕    ║
        ╚═══════════════════════════════════════╝
        1. 커피 주문 | 2. 디저트 주문 | 3. 영수증 출력 | 4. 종료
        ------------------------------------------
        선택>>

        사용자가 4를 입력하기 전까지 메뉴는 계속 반복되어야 합니다.

        2. 커피 주문 (선택 1)

        다음 정보를 순서대로 입력받습니다.

        주문 수량
        온도 선택 (1. HOT / 2. ICE)
        사이즈 선택 (1. Regular / 2. Large)

        3. 디저트 주문 (선택 2)

        다음 정보를 순서대로 입력받습니다.

        주문 수량
        디저트 종류 (문자열 입력: 케이크 / 쿠키 / 마카롱)
        */

        boolean order = true;
        Scanner scan = new Scanner(System.in);

        while (order) {
            
            System.out.println("╔═══════════════════════════════════════╗");
			System.out.println("║       ☕ 스마트 카페 주문 시스템 ☕   ║");
			System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. 커피 주문 | 2. 디저트 주문 | 3. 영수증 출력 | 4. 종료)");
            System.out.println(" ------------------------------------------");
            System.out.print("선택-> ");
            int num = Integer.parseInt(scan.nextLine());

            if (num < 1 || num > 4) {
                System.out.println("숫자를 잘못 입력하셨습니다. 다시입력해주세요(1~4)");
                System.out.println("");
                continue;
             
            }else if (num==1) {
                System.out.println("커피를 선택하셨습니다!");
                System.out.println("커피 수량을 입력해주세요");
                int quantity = Integer.parseInt(scan.nextLine());
                System.out.println("");
                                
                if (quantity<0) {
                    System.out.println("숫자를 잘못입력하셨습니다. 다시 한번 확인해주세요.");
                }else 
                    System.out.println();
                
                System.out.println("온도 선택 (1. HOT / 2. ICE)");
                int quantity2 = Integer.parseInt(scan.nextLine());
                System.out.println("");
                if (quantity2<0 || quantity2>3) {
                    System.out.println("숫자를 잘못입력하셨습니다. 다시 한번 확인해주세요.");
                }else 
                    System.out.println();

                System.out.println("사이즈 선택 (1. Regular / 2. Large)");
                int quantity3 = Integer.parseInt(scan.nextLine());
                System.out.println("");
                if (quantity3<0 || quantity3>3) {
                    System.out.println("숫자를 잘못입력하셨습니다. 다시 한번 확인해주세요.");
                //else if
                }
            }else if (num==2) {
                System.out.println("디저트를 선택하셨습니다!");
                System.out.println("원하시는 디저트를 선택해주십시오 (1.케이크 / 2.쿠키 / 3.마카롱)");
                int desert = Integer.parseInt(scan.nextLine());
                System.out.println("");
                if (desert<0 || desert>4) {
                    System.out.println("숫자를 잘못입력하셨습니다. 다시 한번 확인해주세요.");
                }else
                            
                    System.out.println();

                if (desert == 1) {
                    System.out.println("케이크를 선택하셨습니다."); 
                    System.out.println("주문 수량을 입력해주세요");
                    int quantity4 = Integer.parseInt(scan.nextLine());
                    System.out.println("");

                }else if (desert == 2) {
                   System.out.println("쿠키를 선택하셨습니다."); 
                   System.out.println("주문 수량을 입력해주세요");
                   int quantity4 = Integer.parseInt(scan.nextLine());
                   System.out.println(""); 
                }else {
                    System.out.println("마카롱을 선택하셨습니다."); 
                    System.out.println("주문 수량을 입력해주세요");
                    int quantity5 = Integer.parseInt(scan.nextLine());
                    System.out.println("");
                }

                
            }else if (num==3) {
                System.out.println("영수증을 선택하셨습니다!");
                System.out.println("영수증을 출력하시겠습니까? (1.Y|2.N)");
                int receipt = Integer.parseInt(scan.nextLine());
                System.out.println("");
                if (receipt<0 || receipt>3){
                    System.out.println("숫자를 잘못입력하셨습니다. 다시 한번 확인해주세요.");
                }else{
                     System.out.println();
                }
                if (receipt==1){
                    System.out.println("영수증을 출력하겠습니다.");
                }else {
                    System.out.println("");
                }

            }else {
                order = false;
            }//if

    
    
        }//while
        System.out.println("Thank You for Ordering!");
        System.out.println("시스템 종료");

    }//main
}//class
