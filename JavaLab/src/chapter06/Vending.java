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
    public Vending(){

    }



    //메서드
    public void init() {
        can[0] = new Can_07("환타",1000);
        can[1] = new Can_07("사이다",1200);
        can[2] = new Can_07("오렌지쥬스",1100);
        can[3] = new Can_07("바나나우유",1400);
        can[4] = new Can_07("콜라",1000);
    }

    //사용 가능한 음료만 출력하는 메소드
    //위에 객체가 바뀔수도 있으니 can.length
    public void showCans(int m) {
        money = m;
        for (int i = 0; i<can.length; i++) {
            //만약에 내가 갖고 있는돈보다 음료의 가격이 작거나 같으면 음료의 이름과 금액 출력
            if (can[i].getPrice() <= money) {
                System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");
                
            }//if
        }//for


    }//showcans

    //선택한 음료만 출력

    public void outCan(String name) {

        for(int i=0; i<can.length; i++) {
            //만약에 내가 선택한 음료의 이름이 자판기 음료의 이름과 같으면 음료 출력(예: 선택하신 바나나우유를 출력합니다.)
            if (name.equals(can[i].getCanName())) {
                System.out.println("선택하신" + can[i].getCanName()+ "를(을) 출력합니다.");
                System.out.println("잔액" +(money - can[i].getPrice() + "원 입니다."));
            } 

        }//for

        System.out.println("잘못 주문 하셨습니다.");

    }//outcan


}
