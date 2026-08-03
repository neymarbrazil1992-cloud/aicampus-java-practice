package chapter10.hashset;

import java.util.HashSet;
import java.util.Random;

public class LottohashMain_01 {

    public static void main(String[] args) {
        
        HashSet<Integer> lotto = new HashSet<Integer>();
        // HashSet -> 중복을 자동으로

        while (true) {

            int v = new Random().nextInt(45) + 1;

            lotto.add(v);

            if (lotto.size() >= 6) {
                break;
            }
            
        }//while

        System.out.println(lotto);


    }//main
    
}//class
