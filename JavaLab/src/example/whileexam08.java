package example;

import java.util.Scanner;

public class whileexam08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int choice;
        String menu;
        int totalPrice = 0;
        int orderCount = 0;

        while(run) {
            System.out.println("------------------------------------\n");
            System.out.println("|      맛있는 냉면 주문 시스템     |");
            System.out.println("------------------------------------\n");
            System.out.println("1. 냉면 주문 | 2. 주류 주문 | 3. 영수증 출력 | 4. 종료");
            System.out.println("------------------------------------------\n");
            System.out.print("선택>> ");
            choice = Integer.parseInt(scan.nextLine());

            if (choice == 1) {
                int count = -1;
                while (count <= 0) {
                    System.out.println("주문 수량: ");
                    count = Integer.parseInt(scan.nextLine());
                }

            }




        }//while


        
    }//main
}//class
