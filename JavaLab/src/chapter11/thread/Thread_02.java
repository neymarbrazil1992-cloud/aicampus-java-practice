package chapter11.thread;

public class Thread_02 extends Thread {
    
    private int [] temp;

    public Thread_02() {
        temp = new int[10];
        for (int i = 0; i<temp.length; i++){
            temp[i] = i ;
        }//for
    }//생성자

    @Override
    public void run() {
       for(int i :temp){
        try {
            Thread.sleep(1000); //1초 Data영역
        } catch (Exception e) {
           e.printStackTrace();
        }//try
        System.out.println("temp: " + temp[i]);
        
       }//for
    }

    

}//class
