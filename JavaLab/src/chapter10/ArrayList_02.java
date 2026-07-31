package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("list.size: " + list.size()); //length.는 1부터 시작(쓰지않는것까지 포함)

        list.add(100);
        list.add(50);
        System.out.println("list.size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------Iterator--------");
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int v = it.next();
            System.out.println(v);
        }//while
        

    }//main
}//class
