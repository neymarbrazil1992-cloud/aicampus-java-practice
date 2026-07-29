package chapter07;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
    
       Scanner s = new Scanner(System.in);

       System.out.println("정수 A를 입력하세요");
       int a = s.nextInt();      

       System.out.println("정수 B를 입력하세요");
       int b = s.nextInt();

    //    Inheri_15 calculators1 = new Calplus(a, b);
    //    Inheri_15 calculators2 = new Calminus(a, b);

    //    int plus = calculators1.getResult(a, b);
    //    int minus = calculators2.getResult(a, b);

    //    System.out.println("두 수의 합: " + plus);
    //    System.out.println("두 수의 차: " + minus);
       
    //     int n1 = 20;
    //     int n2 = 10;
        
    //     Calplus ex1 = new Calplus(20, 10);
    //     System.out.println("ex1의 값은 : " +ex1.getResult(20, 10));

    //     Calminus ex2 = new Calminus(20, 10);
    //     System.out.println("ex2의 값은 : " +ex2.getResult(20, 10));

        // System.out.println("-------------------------------");

        // Inheri_15[] calculators = {new Calplus(a, b), new Calminus(a, b)};

        // for(Inheri_15 ca:calculators) {
        //     System.out.println(ca.getClass().getSimpleName()+": "+ca.getResult(a, b));
        // }

    //방법3
    
  
   System.out.println("두 수의 합: "+ calc(new Calplus(a, b),a,b));
   System.out.println("두 수의 차: "+ calc(new Calminus(a, b),a,b));


    
}//main
 
    public static int calc(Inheri_15 c1, int a, int b) {
        return c1.getResult(a, b);
    }


}//class
