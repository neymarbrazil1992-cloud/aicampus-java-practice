package chapter05;

import javax.swing.JOptionPane;

public class method_01 {

    //매게 변수 int num1 num2 2개짜리 method
    public static void sum(int num1, int num2){
        int sum = num1+num2;
        System.out.println("두 수의 합: "+sum);

    }//sum

    public static void main(String[] args) {

        int a,b;

        a= Integer.parseInt(JOptionPane.showInputDialog("값1"));
        b= Integer.parseInt(JOptionPane.showInputDialog("값2"));

        //int sum = a+b;
        //System.out.println("두 수의 합: "+sum);

        method_01.sum(a, b);
        //==>밑에 날코딩이 생략
        // public static void sum(int num1, int num2){
        // int sum = num1+num2;
        // System.out.println("두 수의 합: "+sum);

        
        


    }//main

    //따로 필요에 따라 날코딩을 만들어야 될 때 main 밖에 만들어야 한다. 

}//class
