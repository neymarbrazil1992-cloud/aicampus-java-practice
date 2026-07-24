package chapter01;

public class BinaryTest03 {

        // 자료형:정수
        // byte < short < int < long
        // 요즘에는 데이터 용량의 비대로 long을 쓰는 추세

        /*
        byte - > 2의 8승(-128 ~ 127) 아주 작은 숫자만 state에 놓고 쓸때
        short -> 2의 16승(-32768 ~ 32767)
        int - > 4바이트 2의 32승 (42억)
        long -> 8바이트의 18경 (780000000L)
        */
    public static void main(String[] args) {

        byte myByte=100;
		short myShort=20000;
		int myInt=1000000000;
		long myLong=90000000000000L;
       
        System.out.println("bite" + myByte);
        System.out.println("short" + myShort);
        System.out.println("int" + myInt);
        System.out.println("long" + myLong);
        //소문자는 일반 자료형

        int result=myByte+myShort;

        System.out.println("두 수의 합" + result);
        System.out.println("두 수의 합" + (myByte + myShort));
        System.out.println(
                ((Object) (result)).getClass().getName());
                
        

    }//main

}//class
