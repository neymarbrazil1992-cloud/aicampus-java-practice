package chapter07;

public class SportCarMain_05 extends Car {
    
    @Override
    public void speedUp() {
        speed += 10;
        System.out.println("speed: " + speed);

    }

    
// Final 메서드는 오버라이드 할 수 없음    
    // @Override
    // public void stop() {
    //     System.out.println("스포츠카가 멈춥니다.");
    //     speed = 0;

    // }

    public static void main(String[] args) {
        
        SportCarMain_05 ac = new SportCarMain_05();
        ac.speedUp();
        ac.stop();


    }//main


}//class
