package chapter02;

import java.util.Scanner;

public class Example_05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int number1 = scan.nextInt();
        boolean isPositive=number1 > 0; //
        String result = isPositive ? "양수입니다." : "음수 또는 0입니다.";
        System.out.println(result);

        System.out.println("--------------------");

        String num = (number1 > 0) ? "양수":
                     (number1 < 0)? "음수":
                     "0";
        
        System.out.println(num + "입니다.");
    }
}
