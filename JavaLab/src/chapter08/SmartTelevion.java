package chapter08;

public class SmartTelevion implements Searchable, Remote {

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
        
    }

    private int volume;
    
    @Override
    public void setVolume(int volume) {
       
        if (volume > Remote.MAX_VOLUME) {
            this.volume = Remote.MAX_VOLUME;
            System.out.println("최대 볼륨입니다.");
        }else if (volume < Remote.MIN_VOLUME) {
            this.volume = Remote.MIN_VOLUME;
            System.out.println("최소 볼륨입니다.");
        }else{
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨은: " + this.volume + "입니다.");

    }

    @Override
    public void turnOff() {
       System.out.println("TV를 종료합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("Welcome!");
        
    }

    
    

    
}//class
