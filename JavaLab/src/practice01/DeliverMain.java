package practice01;

import java.util.Scanner;

public class DeliverMain {

public static void main(String[] args) {

    Scanner km = new Scanner(System.in);
    System.out.println("주행거리를 입력하시오: ");
    int distance = km.nextInt();

    Delivery[] vehicDeliveries = {new Car(),new Bike(),new Motocycle(),new Walk()7}; 

   
        
    
    for (Delivery v : vehicDeliveries) {
            System.out.println(v.getClass().getSimpleName()+" 배달비 :"+v.calcFee(distance));
    }






    
}//main


}//class
