package chapter06;

public class Vending {
    
    // 멤버 변수 ;;
    private Can_07[] can = new Can_07[5]; //[]로 중복을 대체 
    // private Can_07 can1 = new Can_07();
    // private Can_07 can2 = new Can_07();
    // private Can_07 can3 = new Can_07();
    // private Can_07 can4 = new Can_07();
    // private Can_07 can5 = new Can_07();
    private int money;

    //생성자

    

    //메서드
    public void init() {
        can[0] = new Can_07("환타",1000);
        can[1] = new Can_07("사이다",1200);
        can[2] = new Can_07("오렌지쥬스",1100);
        can[3] = new Can_07("바나나우유",1400);
        can[4] = new Can_07("콜라",1000);
    }

}
