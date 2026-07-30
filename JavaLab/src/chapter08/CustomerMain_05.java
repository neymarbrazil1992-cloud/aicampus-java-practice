package chapter08;

public class CustomerMain_05 {
    public static void main(String[] args) {
    
    //자식 객체 생성         
    Customer customer = new Customer();
    System.out.println("----Buy----");

    //Buy 객체 생성 (업케스팅)
    Buy buyer = customer;
    buyer.buy();
    buyer.order();

    // Buy b = new Buy(); -> interface 는 객체를 만들 수 가 없다.

    //Sell 객체 생성 (업케스팅)
    System.out.println("----Sell----");
    Sell seller = customer;
    seller.sell();
    seller.sellorder();
    seller.order();

    //instance_of 
    //seller 부모 | Customer 자식 
    if (seller instanceof Customer) {
        Customer customer2 = (Customer)seller; //다운캐스팅 
        customer2.buy();
        customer2.sell();
        customer2.order();
        customer2.sellorder();
    
    }// if
    
    


    }//main
}//class
