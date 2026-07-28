package chapter06;

public class Can_07 {

    // String can; 
    // int money;
    
    // //오버로딩
    // public Can_07(String can, int money) {
    //     this.can = can;
    //     this.money = money;
    // }
    
    //멤버 변수
    private String canName;
    private int price;

    //오버로딩
    public Can_07(String canName,int price){
        this.canName=canName;
        this.price=price;
    }

    //기본 생성자 
    public Can_07(){
        
    }

   //Getter 
    public String getCanName() {
        return canName;
    }

    public int getPrice() {
        return price;
    }

    

    
    
}
