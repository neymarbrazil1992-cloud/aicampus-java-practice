package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_03 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();

        list.add("탄빵이");
        list.add("진광채");
        list.add("박찬양");
        list.add("이주형");
        list.add("김도형");
        list.add("이재윤");

        System.out.println("5팀: " +list);
        System.out.println("5팀: " +list.size() + "명");
        System.out.println("---------------------");

        //반복자 
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String v = it.next();
            System.out.println(v + " ");
            
        }



    }//main
}//class
