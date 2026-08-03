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
                    Stock s = new Stock();
                    System.out.println("---종목을 매수 합니다---");
                    System.out.println("티커: ");
                    s.setTicker(scan.next());

                    System.out.println("수량: ");
                    s.setQuantity(scan.nextInt());

                    System.out.println("평단가: ");
                    s.setAvgPrice(scan.nextInt());

                    portfolio.add(s);
                    System.out.println("매수 완료");

                    break;
                case 2:
                    System.out.println("---종목을 매도합니다---");
                    System.out.println("매도할 티커: ");
                    String ticker = scan.next();

                    boolean found = false;
                    for (int i = 0; i < portfolio.size();i++) {
                        if(portfolio.get(i).getTicker().equals(ticker)) {
                            portfolio.remove(i);
                            System.out.println(ticker + "매도 완료");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("은(는) 보유하고 있지 않은 종목입니다.");
                    }
                    
                    break;
                case 3: 
                    System.out.println("---포트폴리오를 조회합니다---");
                    System.out.println("보유 종목 수: " + portfolio.size() + "개");

                    Iterator<Stock> it = portfolio.iterator();
                    long totalValue = 0;

                    while (it.hasNext()) {
                        Stock st = it.next();
                        int value = st.getQuantity() * st.getAvgPrice();
                        totalValue += value;

                        System.out.println("티커: " + st.getTicker());
                        System.out.println("수량: " + st.getQuantity());
                        System.out.println("평단가: " + st.getAvgPrice());
                        System.out.println("평가금약: " + value);
                        System.out.println("-----------");
                    }
                    System.out.println("전체 평가금약 합계: " + totalValue);
                    
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
