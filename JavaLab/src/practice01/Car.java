package practice01;

public class Car extends Delivery {
    @Override
    public int calcFee (int distance) {
        return distance * 500 +2000;
    }

    
}
