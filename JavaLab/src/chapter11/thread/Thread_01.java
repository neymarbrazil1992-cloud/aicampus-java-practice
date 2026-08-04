package chapter11.thread;

public class Thread_01 extends Thread {

   //멤버변수
   
   //생성자

    //메서드
    @Override
    public void run() {
       //프로세스가 독립적으로 실행 
        for(int i=0; i<10; i++){
            System.out.println((i + 1) + "번째 스레드 실행");
        }
    }

    
    
}//class
