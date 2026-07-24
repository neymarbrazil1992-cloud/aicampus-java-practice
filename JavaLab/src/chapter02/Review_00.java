package chapter02;

import java.util.Scanner;

public class Review_00 {
    public static void main(String[] args) {
        
        // Scanner scan=new Scanner(System.in); 
        // // System.out.print("나이를 입력하세요:");
        // // int age= scan.nextInt();
        // // //System.out.println(age);

        // System.out.println("--------------");
        // // int fatherAge=38;
        // // int motherAge=45;
        // System.out.println("아빠 나이를 입력하세요");
        // int fatherAge = scan.nextInt();
        // System.out.println("엄마 나이를 입력하세요");
        // int motherAge = scan.nextInt();

        // System.out.println("----------------");

        // String ch =(fatherAge > motherAge) ? "연상" : "연하";
        // // ch= motherAge > fatherAge ? "연상" : "연하";
        // System.out.println(ch);

        // Scanner scan= new Scanner(System.in);
        // System.out.println("종가를 입력하세요");
        // double todaymarketPrice = 6801.34;
        // double yesterdaymarketPrice = 7284.41; 

        // Scanner scan = new Scanner(System.in);
        // System.out.println("어제 종가를 입력하세요");
        // double yesterdayPrice = scan.nextDouble();

        // System.out.println("오늘 종가를 입력하세요");
        // double todayPrice = scan.nextDouble();

        // String result = (todayPrice > yesterdayPrice) ? "상승" : "하락";
        // System.out.println("오늘 주가는" + result);

        // double currentPrice = 6801.34;
        // double targetPrice = 6799.99;

        // String signal = (currentPrice >= targetPrice) ? "매도 신호!" : "홀딩";
        // System.out.println(signal);

        // double changeRate = -6.63; //등락률(%)
        // String status = (changeRate > 0) ? "상승△" 
        //                 :(changeRate < 0) ? "하락▽"
        //                 :"보합";
        // System.out.println(status);

        // Scanner scan = new Scanner(System.in);

        // System.out.println("보유 현금을 입력하세요 (원)");
        // int myCash = scan.nextInt();

        // System.out.println("주식 1주당 가격을 입력하세요 (원)");
        // int stockPrice = scan.nextInt();

        // //살 수 있는 주식 수 
        // int sharesCanBuy = (myCash / stockPrice);

        // //매수 후 남은 현금 
        // int remainingCash = (myCash % stockPrice);

        // System.out.println(sharesCanBuy + "주 매수 가능, 잔여 현금: " + remainingCash + "원");

        // //한주도 못사는 경우 체크
        // String result = (sharesCanBuy == 0) ? "매수 불가 - 현금 부족" : "매수 가능";
        // System.out.println(result);

        //주식에 수수료가 붙는 경우
        Scanner scan = new Scanner(System.in);

        System.out.println("보유 현금을 입력하세요 (원)");
        double myCash = scan.nextDouble();

        System.out.println("주식 1주당 가격을 입력하세요 (원)");
        double stockPrice = scan.nextDouble();

        //수수료율 0.015% = 0.00015
        double feeRate = 0.00015;

        //수수료 포함 실제 1주당 비용 
        double actualPricePerShare = stockPrice * (1 + feeRate);

        //살 수 있는 주식 수 (소수점 버리기 위해 int로 변환)
        int sharesCanBuy = (int)(myCash / actualPricePerShare);

        //실제 사용한 금액
        double totalSpent = sharesCanBuy * actualPricePerShare;

        //남는 잔액 
        double remainingCash = myCash - totalSpent;

        System.out.println(sharesCanBuy + "주 매수 가능");
        System.out.printf("실제 사용 금액: %.2f원%n", totalSpent);
        System.out.printf("잔여 현금: % .2f원%n", remainingCash);

        String result = (sharesCanBuy == 0) ? "매수 불가 - 현금 부족" : "매수 가능";
        System.out.println(result);







    }
}
