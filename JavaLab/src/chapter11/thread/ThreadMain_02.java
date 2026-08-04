package chapter11.thread;

public class ThreadMain_02 {
    public static void main(String[] args) {
        
        Thread_02 t = new Thread_02();//0~10까지의 요소가 temp배열방에 생성됨

        t.start(); //10초

        try {
            Thread.sleep(11000);//11초
            System.out.println("프로그램이 종료됩니다");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
    
}//class
