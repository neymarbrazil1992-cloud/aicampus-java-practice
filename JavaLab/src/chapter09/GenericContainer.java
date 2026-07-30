package chapter09;

public class GenericContainer <T> {
    
    private T[] items;
    private int count;

    public GenericContainer (int size) {

        items = (T[])new Object[size];
        count = 0; 
    }

    public void addItem (T item) {
        if(count < items.length) {
            //items[count] = item;
            //count++
            items[count++] = item;
        }else {
            System.out.println("Container is full.");
        }

    }//addItem

    public void printItems() {
        for (int i=0;i<count;i++) {
            System.out.println(items[i] + " ");
        }
        System.out.println();
    }

    public <E extends Number> double sum(E[] numbers) {
        double total = 0;
        for (E number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

}//class
