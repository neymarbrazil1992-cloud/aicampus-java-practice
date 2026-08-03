package chapter10.stack;

import java.util.Stack;

public class CoinMain_03 {

    public static void main(String[] args) {
        
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(200000));
        coinBox.push(new Coin(5000000));
        coinBox.push(new Coin(100000));
        coinBox.push(new Coin(2500000));
        coinBox.push(new Coin(20000));

        //Coin coinpush = new Coin();
        //coinpush.setValue(500000000);



        System.out.println(!coinBox.isEmpty());

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 돈: " + coin.getValue());

        }//while

        System.out.println(coinBox.pop());
        System.out.println(coinBox.peek());


    }//main
    
}//class
