package chapter03.for_test;

import java.util.Scanner;

public class for05 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int i;
    System.out.println("0보다 크면서 11보다 작은 숫자를 입력하세요 : ");
    int a = scan.nextInt();    
    
    if (a>0 && a<11) { // 1~10

        for (i=1;i<a;i++){
            System.out.println("Froh Weinachten!");

            }//for 
    }else{
        System.out.println("Noch ein mall typen");
    }

    System.out.println("Programm enden");

    

    }//main
}//class
