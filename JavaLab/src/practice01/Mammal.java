package practice01;

public class Mammal extends Animal {

    private String furColor;
    private int legCount;

    public Mammal() {

    }

    public void Set2(String a, int b){

        furColor = a;
        legCount = b;

    }

    public void Disp2() {
        System.out.println("털색깔: " + furColor);
        System.out.println("다리 개수: " + legCount);
    }
    
}
