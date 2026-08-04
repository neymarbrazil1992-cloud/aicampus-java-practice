package chapter11.thread;

public class ThreadMain_01 {
    public static void main(String[] args) {
        
        Thread_01 t = new Thread_01();
        //뼈대에서 하나하나 붙이는 것
        t.run();
        // t.start(); // thread -> Runnable(이미 메서드가 동기화)
        //run-> Scheduling 자동 백업              
        System.out.println("main 종료");


    }//main
}//class
