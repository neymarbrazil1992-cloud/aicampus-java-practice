package chapter05;

import javax.swing.JOptionPane;

public class Functest_02 {

    public void sum(int num1, int num2){
        //static 은 data area 에 있기때문에 불변
        //final 은 변형조차도 안된다.
        int sum = num1+num2;
        System.out.println("두 수의 합: "+sum);
    }

    public static void main(String[] args) {

        int a,b;

        a= Integer.parseInt(JOptionPane.showInputDialog("값1"));
        b= Integer.parseInt(JOptionPane.showInputDialog("값2"));
        
        Functest_02 obj=new Functest_02();
        obj.sum(a, b);
        // sum(a, b); => object를 땡겨서 claim하고 써야한다.

        
    }//main
}//class
