package chapter02;

public class ArithTest_01 {
    public static void main(String[] args) {
        // +,-,*,/,%

        int a1 = 5;
        int a2 = 2;

        int result1 = a1 + a2;
        System.out.println(result1);
       
        int result2 = a1 - a2;
        System.out.println(result2);
       
        int result3 = a1 * a2;
        System.out.println(result3);
        
        double result4 = (double) a1 / a2;
        System.out.println(result4);
        
        int result5 = a1 % a2;
        System.out.println(result5);

        int num1 = 10;
        int num2 = 20;

        //음수기호만 붙여서 출력 
        System.out.println("--------------");
        System.out.println(-num2);
        System.out.println(+num1);
        System.out.println(num2 + num1); 

        System.out.println("-------------------");
        num2 = -num2;
        System.out.println(num2);
        System.out.println(num2 + num1); 





    }
}
