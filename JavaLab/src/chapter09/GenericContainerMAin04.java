package chapter09;

import javax.swing.JOptionPane;

public class GenericContainerMAin04 {
    public static void main(String[] args) {
        
        // stringContainer.count = 5; -> 밖에서 직접적으로 바꿀 수 없고 메서드를 통해서만 바꿀수 있다 
        GenericContainer<String> stringContainer = new GenericContainer<String>(5);

        stringContainer.addItem("Apple");
        stringContainer.addItem("Banana");
        stringContainer.addItem("Coffee");
        stringContainer.printItems();

        // String[] stringArray = {"1","2","3","4","5","6"};
        // System.out.println("Sum of String Array" + StringContainer.sum(StringArray));
        // System.out.println(); ->> 숫자열만 받겠다고 약속
        
        //숫자 아이템을 저장하는 객체
        GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(3);

        // String numInput = JOptionPane.showInputDialog("정수를 콤마(,)로 구분해서 입력하세요: ");
        // String[] numItems = numInput.split(",");
        // for (String num : numItems) {
        //     integerContainer.addItem(Integer.parseInt(num.trim()));
        // }
        // integerContainer.printItems();
        
        integerContainer.addItem(1);
        integerContainer.addItem(2);
        integerContainer.addItem(3);
        integerContainer.addItem(4);
        integerContainer.addItem(5);
        integerContainer.printItems();
        double total = integerContainer.sum(integerContainer.addItem());
        

        Integer[] intArray = {1,2,3,4,5,6};
        System.out.println("Sum of Int Array" + integerContainer.sum(intArray));
        System.out.println();

        //실수 아이템을 저장하는 객체
         GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);

        doubleContainer.addItem(10.1);
        doubleContainer.addItem(20.2);
        doubleContainer.addItem(30.3);
        doubleContainer.printItems();

        Double[] doubleArray = {1.1, 2.1, 3.1, 4.4, 5.3};
        System.out.println("Sum of Double array: " + doubleContainer.sum(doubleArray));
       




    }//main

}//class
