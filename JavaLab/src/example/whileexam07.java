package example;

import java.util.Scanner;

public class whileexam07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int choice;
        String menu;
        int totalPrice = 0;
        int orderCount = 0;

        while (run) {
            System.out.println("------------------------------------\n");
            System.out.println("|      맛있는 냉면 주문 시스템     |");
            System.out.println("------------------------------------\n");
            System.out.println("1. 냉면 주문 | 2. 주류 주문 | 3. 영수증 출력 | 4. 종료");
            System.out.println("------------------------------------------\n");
            System.out.print("선택>> ");

            choice= Integer.parseInt(scan.nextLine());
            if       (choice == 1) {
               
                
                
                while (true) {
                    
                int flavour, size;
                System.out.println("주문 수량: ");
                count = Integer.parseInt(scan.nextLine());
                System.out.println("주문 수량을 확인해 주세요.");

                if (count>0){
                    System.out.println("냉면 종류 (1. 물냉면 / 2. 비빔냉면)");
                    flavour = Integer.parseInt(scan.nextLine());
                }else{
                    System.out.println("다시 입력해주세요!");
                }
               
                if(count>0||count<3){

                    System.out.println("사이즈 선택 (1. 일반사이즈 / 2. 곱빼기)");
                    size = Integer.parseInt(scan.nextLine());
                }else{
                    System.out.println("\"다시 사이즈(일반/곱빼기)를 선택해주세요\"");
                }
                
                System.out.println("\n === 냉면 주문 내역 ===");
                int price = 0;
                String flavourStr ="";
                String sizeStr ="";
                if (flavour==1){
                flavourStr="물";
                price=10000;}
                else {
                    flavourStr="비빔";
                    price=11000;
                     }
                               
                if (size==1){
                sizeStr="일반 사이즈";                  
                }else {
                    sizeStr="곱빼기";
                    price=price+1000;
            }//while


                for(int i=0; i < count; i++) {
                System.out.println((i+1)+". " +flavourStr+" 냉면 (" +sizeStr +")- " + price +" 원");
                }
                totalPrice = price * count;
                System.out.println(" 총금액: " + totalPrice + "원\n" );
            }


            }else if (choice == 2){


            }else if (choice == 3){


            }else if (choice == 4){
                run = false;

            }else{
                System.out.println("잘못된 선택입니다. 다시 선택하여 주세요(1~4)");
            }

            
        
        
        }//while
        
    }//main
}//class
