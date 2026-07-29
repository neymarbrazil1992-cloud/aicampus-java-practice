package chapter08;

public interface Calc {

    //public "interface" -> "설계도 "
    
   
   //멤버 변수 
    public static final double PI = 3.14;
    int ERROR = 9999999;

    //추상 메서드 
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times (int num1, int num2);

    int divide (int num1, int num2);


    //일반 메서드는 사용 불가능 
    // public void description() {

    // }

    //자바 8 부터 제공 -> 기본 수행문을 구현할 때 사용 (재정의 가능)
    default void description() {
        myMethod();
        System.out.println("정수 계산기");
    }

    //자바 9부터 제공  => 밖에서는 안보임
    private void myMethod() {
        System.out.println("private 메서드");
    }

    //자바 8부터 정적(static)메서드도 사용가능 
    static int total(int[] arr){
        int total = 0;
        for (int i : arr){
            total+=i;
        }
        return total;
    }


}//interface
