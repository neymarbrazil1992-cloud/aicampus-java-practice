package example;

import java.util.Scanner;

public class whileexam06 {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int choice, count, temperature, size;
        String menu;
        int totalPrice = 0;

        while (run) {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║       ☕ 스마트 카페 주문 시스템 ☕    ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. 커피 주문 | 2. 디저트 주문 | 3. 영수증 출력 | 4. 종료");
            System.out.println("------------------------------------------");
            System.out.print("선택>> ");

            choice= Integer.parseInt(scan.nextLine());

            if (choice == 1) {
                System.out.println("주문 수량: ");
                count = Integer.parseInt(scan.nextLine());

                System.out.println("온도 선택 (1. HOT / 2. ICE)");
                temperature = Integer.parseInt(scan.nextLine());

                System.out.println("사이즈 선택 (1. Regular / 2. Large)");
                size = Integer.parseInt(scan.nextLine());

                System.out.println("\n === 커피 주문 내역 ===");
                int price = 0;
                String tempStr ="";
                String sizeStr ="";

                //
                if (temperature==1){
                    tempStr="HOT";
                    price=4000;
                }else if (temperature==2){
                    tempStr="ICE";
                    price=4500;
                }else{
                    System.out.println("잘못된 온도 선택!\n");
                    continue;
                }
                if (size==1){
                    sizeStr="Regular";                  
                }else if (size == 2){
                    sizeStr="Large";
                    price=price+500;
                }else{
                    System.out.println("잘못된 사이즈 선택!\n");
                    continue;
                }
                //for 문으로 주문 출력
                for(int i=0; i < count; i++) {
                    System.out.println((i+1)+". " +tempStr+" 아메리카노 (" +sizeStr +")- " + price +" 원");
                }
                totalPrice = price * count;
                System.out.println(" 총금액: " + totalPrice + "원\n" );
        



            }else if (choice == 2){
                System.out.println("디저트 종류 (케이크/쿠키/마카롱): ");
                menu = scan.nextLine();

                System.out.println("주문 수량: ");
                count = Integer.parseInt(scan.nextLine());

                System.out.println("\\n === 커피 주문 내역 ===");
                int dessertPrice = 0;
                String emoji = "";

                if(menu.equals("케이크")) {
                    dessertPrice=6000;
                    emoji="🍰";
                }else if(menu.equals("쿠키")) {
                    dessertPrice=3000;
                    emoji="🍪";
                }else if(menu.equals("마카롱")) {
                    dessertPrice=2500;
                    emoji="🧁";
                }else{
                    System.out.println("없는 메뉴 입니다. \n");
                    continue;
                }

                for(int i=0; i < count; i++) {
                    System.out.println((i+1)+". " +emoji+ " "+ menu + " " +dessertPrice);
                }
                totalPrice = dessertPrice * count;

                if(count >= 3) {
                    int discount = + (int) (totalPrice * 0.9);
                
                System.out.println("3개 이상 구매시 할인 ");
                
                System.out.println(" 총금액: " + discount + "원\n" );
                }else{
                System.out.println(" 총금액: " + totalPrice + "원\n" );
                }
        




            }else if (choice == 3){
                System.out.println("\n╔═══════════════════════════════════════╗");
                System.out.println("║            📜 영 수 증 📜              ║");
                System.out.println("╠═══════════════════════════════════════╣");
                System.out.println("║  스마트 카페에서 구매해주셔서          ║");
                System.out.println("║  감사합니다!                           ║");
                System.out.println("╚═══════════════════════════════════════╝\n");

            }else if (choice == 4){
                run = false;
            }else{
                System.out.println("잘못된 선택입니다.");
            }

            
        }//while

        scan.close();
        System.out.println("Thank You!");


    }//main
}//class
