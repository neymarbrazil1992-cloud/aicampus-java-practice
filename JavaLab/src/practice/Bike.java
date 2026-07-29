package practice;

public class Bike extends Delivery {

    @Override
    public int calcFee (int distance) {
        return distance *2;
    }
    
}//class
