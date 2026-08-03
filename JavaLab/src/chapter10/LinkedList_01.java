package chapter10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_01 {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime1;
        long endTime1;

        //ArrayList의 작업
        startTime1 = System.nanoTime();
        for(int i=0;i<100000;i++){
            list1.add(0, String.valueOf(i));
        }
        endTime1= System.nanoTime();

        System.out.println("ArrayList 작업시간: " + (endTime1 - startTime1));
        System.out.println();
        long startTime2;
        long endTime2;


        //Linked List의 작업 !!Much Faster!!
        startTime2 = System.nanoTime();
        for(int i=0;i<100000;i++){
            list2.add(0, String.valueOf(i));
        }
        endTime2= System.nanoTime();

        System.out.println("LinkedList 작업시간: " + (endTime2 - startTime2));


        //Arraylist는 매번 삽입할 때마다 뒤에 있는 모든 요소를 한칸씩 밀어야 한다
        //10만번째 삽입 시점엔 이미 9만9999개가 들어있는 상태라 , 그 많은 요소를 전부 밀어야한다 -> 시간이 더 필요함
        //반복 횟수가 늘어날 수록 밀어야 하는 양도 점점 늘어나서 시간이 기하급수적으로 늘어난다.


    }//main
}//class
