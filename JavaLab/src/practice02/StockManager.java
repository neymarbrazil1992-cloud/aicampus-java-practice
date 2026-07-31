package practice02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StockManager {

    public StockManager() {

        Scanner scan = new Scanner(System.in);
        ArrayList<Stock> portfolio = new ArrayList<>();

        while (true) {
            System.out.println("(1)종목매수 (2)종목매도 (3)포트폴리오조회 (4)종료: ");
            int select = scan.nextInt();

            switch (select) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
            
                default:
                    System.out.println("잘못된 입력");
            }

        }//while

    

    }//StockManager

    
    
    


}//class
