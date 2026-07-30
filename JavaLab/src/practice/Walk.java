package practice;

public class Walk extends Delivery {

    @Override
    public int calcFee (int distance) {
        return distance * 200;
    }
    
}
