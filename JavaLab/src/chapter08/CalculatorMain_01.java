package chapter08;

public class CalculatorMain_01 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;

        Calc calc = new CompleteCalc2();
        
        //Calc calc -> 제일 위의 인터페이스 
        //new CompleteCalc2 -> 제일 아래 완성품 

        System.out.println("----default Method----");
        calc.description(); //CompleteCal2 재정의 메서드 호출 
        System.out.println();

        System.out.println("----default Method----");
        int[] arr = {1,2,3,4,5};
        System.out.println("1~5까지의 합: " + Calc.total(arr)); //Static Method -> "정적 메서드"
        System.out.println();
        //Calc.total(arr) -> 객체 말고 클래스 이름으로 직접 호출 
       
       
        System.out.println("----default Method----");
        System.out.println("num1 + num2: " + calc.add(num1,num2) );
        System.out.println("num1 - num2: " + calc.substract(num1, num2) );
        System.out.println("num1 X num2: " + calc.times(num1, num2) );
        System.out.println("num1 / num2: " + calc.divide(num1, num2) );
        System.out.println();

        System.out.println("---Child Method---");
        CompleteCalc2 cal2 = new CompleteCalc2();
        cal2.showInfo();
        


    }//main
}//class
