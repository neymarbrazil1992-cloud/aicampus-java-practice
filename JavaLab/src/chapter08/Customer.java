package chapter08;

public class Customer implements Sell, Buy {

   

    @Override
    public void buy() {
        
       System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("주문하기");
    }

    //모호성에 빠짐 -> 추상은 아니지만 같은 메서드 명이 부모들에게 있으므로 반드시 오버라이드 
    
    

    
}//class
