package chapter08;

public interface Sell {

    default void order() {
        System.out.println("판매 주문");
    }

    default void sellorder() {
        System.out.println("판매 주문");
    }
  
}
