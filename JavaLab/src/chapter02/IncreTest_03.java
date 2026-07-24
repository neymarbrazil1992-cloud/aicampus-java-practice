package chapter02;

import javax.sql.rowset.spi.SyncResolver;

public class IncreTest_03 {
    public static void main(String[] args) {
        
        int a, b, c; //초기화는 되지 않음
        a=10;
        b=20;
        c=3;

        //전위 연산 a=a+1 => ++a, (a=a)+1->a+=1(복합연산자)
        System.out.println("++a:" + (++a)); //11

        //후위 연산 
        System.out.println("a++:" + (a++)); //11
        System.out.println("후위연산" + a); //12
        System.out.println("-----------");
        System.out.println("c++:" + (c++)); //3
        System.out.println("후위연산" + c); //4
        System.out.println("-----------");

        System.out.println("++a + b++:" + (++a + b++)); //33 (13 + 20)
        System.out.println("후위연산" + b); //21
        System.out.println("-----------");
        
        System.out.println("++a + b++:" + (++a)); //14
        System.out.println("b++:" + (b++)); //21
        System.out.println("후위연산" + b); //22
        
        System.out.println("-----------");
    
        System.out.println("++a + b++:" + (++a + b++));
    }//main

}//class
