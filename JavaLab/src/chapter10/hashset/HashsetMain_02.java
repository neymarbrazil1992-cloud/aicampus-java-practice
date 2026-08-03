package chapter10.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetMain_02 {
    public static void main(String[] args) {
        
        Set<String> hashset = new HashSet<String>();

        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Orange");

       //String, Integer, Doouble ...... 이미 toString이 선언이 되있다.        
        System.out.println("HashSet: " + hashset);
       
        if(hashset.contains("Banana")){
            System.out.println("Banana is in the HashSet");
        }        
                
        //요소 삭제 
        hashset.remove("Orange");

        System.out.println("Hashset: " + hashset);

    }//main
}//class
