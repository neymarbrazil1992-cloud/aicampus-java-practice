package chapter08;

public interface InterTest01  {
    
    //public static 생략

    // public static final int A = 100;
    final int A = 100;

    //method 
    int getA();

    // public / private int getB() {
    //     return 0;
    // }  => interface 는 {}Body가 올 수 없다. 
    // @Override 

    //*Implements " 이 인터페이스의 규칙을 지키겠다는 약속"
    // extends가 부모 클래스 것을 물려받는 거라면, implements 는 인터페이스가 정해좋은 메서드 목록을 반드시 다 만들겠다는 약속. */
    // 만약 인터페이스가 body를 미리 정해버리면? - "무조건 이렇게 계산해"라고 
    // 방법까지 강요하는 셈이 돼서, 서로 다른 방식으로 구현해야하는 자식 클래스들이 오히려 불편해진다. 



}//interface
