package chapter08;

public class SmartTelevisionMain_03 {
    public static void main(String[] args) {
        
        SmartTelevion tv = new SmartTelevion();

        tv.turnOn();
        tv.setVolume(10);
        tv.search("www.jgtsoft.com");
        System.out.println();

        Remote rc = tv; // 부모 UpCasting 을 이용해서 쓸수도 있다 
        rc.turnOn();
        rc.setVolume(100);
        rc.turnOff();
        // rc.search(); -> Remote class에 정의 되어있는것 만 구현 가능 
        System.out.println();

        Searchable sc = tv;
        // sc.turnOff();
        sc.search("www.google.com");


    }//main
}//class
