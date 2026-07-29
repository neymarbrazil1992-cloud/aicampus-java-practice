package practice;

import java.util.Scanner;

public class DeliverMain {

public static void main(String[] args) {

    Scanner km = new Scanner(System.in);
    System.out.println("주행거리를 입력하시오: ");
    int distance = km.nextInt();

    Delivery[] vehicDeliveries = {new Car(),new Bike()}; 

   
        
    
    for (Delivery v : vehicDeliveries) {
            System.out.println(v.getClass().getSimpleName()+" 주행거리(km) :"+v.calcFee(distance));
    }






    
}//main


}//class
