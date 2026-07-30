package chapter09;

public class GenericContainerMAin04 {
    public static void main(String[] args) {
        
        // stringContainer.count = 5; -> 밖에서 직접적으로 바꿀 수 없고 메서드를 통해서만 바꿀수 있다 
        GenericContainer<String> stringContainer = new GenericContainer<String>(5);

        stringContainer.addItem("Apple");
        stringContainer.addItem("Banana");
        stringContainer.addItem("Coffee");
        stringContainer.printItems();
        
        //숫자 아이템을 저장하는 객체
         GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);

        integerContainer.addItem(1);
        integerContainer.addItem(2);
        integerContainer.addItem(3);
        integerContainer.printItems();

        //실수 아이템을 저장하는 객체
         GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);

        doubleContainer.addItem(10.1);
        doubleContainer.addItem(20.2);
        doubleContainer.addItem(30.3);
        doubleContainer.printItems();
       




    }//main

}//class
