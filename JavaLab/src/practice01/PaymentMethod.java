package practice01;

public interface PaymentMethod {

    int MIN_AMOUNT = 100;

    boolean pay(int amount);
    
}
