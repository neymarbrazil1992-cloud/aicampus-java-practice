package chapter10.vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorCapacity_01 {
    public static void main(String[] args) {
        
        //구버전 -> 기본 용량(10) : "안전하지만 느린 옛날 버젼 "
        Vector<String> vector = new Vector<String>();
       
       //신버전: 멀티스레드 환경에서 동시성이 필요하면
        List<String> sysList = Collections.synchronizedList(new ArrayList<>());

        System.out.println("--------기본크기-------");
        System.out.println("초기 크기: " + vector.size());
        System.out.println("초기 용량: " + vector.capacity());

        //데이터 추가 
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("--------데이터 3개 증가 후 크기---------");
        System.out.println("초기 크기: " + vector.size());
        System.out.println("초기 용량: " + vector.capacity());

        //10개 이상 데이터 추가 
        for (int i = 0; i < 8; i++){
            vector.add("Fruit" + (i + 1));
        }

        //용량 초과시 기존 크기 2배 증가
        System.out.println("--------데이터 11개 증가 후 크기--------");
        System.out.println("초기 크기: " + vector.size());
        System.out.println("초기 용량: " + vector.capacity());

    }//main
}//class
