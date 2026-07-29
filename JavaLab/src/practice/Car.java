package practice;

public class Car extends Delivery {
    @Override
    public int calcFee (int distance) {
        return distance*3;
    }

    
}
