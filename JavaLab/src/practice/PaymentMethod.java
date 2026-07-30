package practice;

public interface PaymentMethod {

    int MIN_AMOUNT = 100;

    boolean pay(int amount);
    
}
