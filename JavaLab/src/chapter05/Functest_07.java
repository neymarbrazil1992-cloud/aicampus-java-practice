package chapter05;

public class Functest_07 {
    public static void main(String[] args) {
        
       String irum="탄빵이"; 
       Functest_07.greet(irum);
       //static 이기 때문에 앞에 new로 선언을 하지 않아도 된다 
       //java 나 python
       //class [이름]으로 불러오는 연습을 해야 한다.


    }//main

    public static void greet(String name) {
        System.out.println("Hello, " +name+ "~~!");
    }



}//class
