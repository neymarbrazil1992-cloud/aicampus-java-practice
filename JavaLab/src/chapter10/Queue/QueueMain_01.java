package chapter10.Queue;

public class QueueMain_01 {
    
    public static void main(String[] args) {
        
        MyQueue queue = new MyQueue();

        queue.enQueue("A"); //입력 메서드 
        queue.enQueue("B"); 
        queue.enQueue("C");
        
        System.out.println(queue);
       
        //지우기
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        System.out.println(queue);
        


    }//main
}//class
