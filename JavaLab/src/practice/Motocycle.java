package practice;

public class Motocycle extends Delivery {
    @Override
    public int calcFee (int distance) {
        return distance * 400 +1000;
    }
    
}
