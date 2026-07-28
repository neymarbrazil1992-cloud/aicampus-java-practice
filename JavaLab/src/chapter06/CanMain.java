package chapter06;

import java.util.Scanner;

public class CanMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int money = 0;

        //음료 준바
        Vending ven = new Vending();

        //음료 준비 확인 
        ven.init();

        //돈 투입 
        System.out.println("돈을 투입하시오: ");
        money = Integer.parseInt(scan.nextLine());

        //사용가능한 음료만 출력
        ven.showCans(money);
        System.out.println("----------------");

        //선택한 음료만 출력
        System.out.println("음료를 선택하세요.");
        String select = scan.nextLine();
        ven.outCan(select);
        




    }//main
}//class
