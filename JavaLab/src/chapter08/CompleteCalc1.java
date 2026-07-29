package chapter08;

public abstract class CompleteCalc1 implements Calc {
//public abstract class => "아직 구현이 안된게 존재한다."
    @Override
    public int add(int num1, int num2) {
        
        return num1 + num2;
    }

    // @Override
    // public int divide(int num1, int num2) {
        
    //     return num1 / num2;
    // }

    @Override
    public int substract(int num1, int num2) {
        
        return num1 - num2;
    }

    // @Override
    // public int times(int num1, int num2) {
       
    //     return num1 * num2;
    // }

    //추상 메서드 존재 
    



}//class
