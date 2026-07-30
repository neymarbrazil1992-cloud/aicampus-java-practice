package chapter09;

public class General<T> {
    //<T> -> 메서드는 하나인데 타입이 변화하는 code

    public void printArr(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        } 
        System.out.println();
    }


}//class
