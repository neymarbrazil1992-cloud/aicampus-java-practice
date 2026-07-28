package chapter07;

public class Strawberry extends Berry {

    private String color;
    private int price;

    public Strawberry(){

    }
    public void Set3(String a, int b) {
        color = a;
        price = b;
    }

    public void Disp3() {
        System.out.println("색상: " + color);
        System.out.println("가격: " + price);
    }

    
}//class
