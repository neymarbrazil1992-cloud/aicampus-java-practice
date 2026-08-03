package chapter10.Queue;

import java.util.ArrayList;

public class MyQueue {

    //Queue -> first in & first out 

    ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data); //추가 
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비어 있습니다.");
            return null;
            //==> 예외 처리 
        }
         return (arrayQueue.remove(0)); //Queue가 없으면 이렇게 customize 

    }//deQueue

    @Override
    public String toString() {
        return "MyQueue [arrayQueue=" + arrayQueue + "]";
    }

      

    
    
}//class
