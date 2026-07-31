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
/*<E extends Number> 이 메서드만 쓰는 독립적인 타입 파라미터 E를 선언.
    "E"는 아무거나 말고, Number를 상속받은 타입만 허용 - Integer, Double, Long 등 
: double sum(E[] numbers -> E타입 배열을 받아서, double을 리턴하는 메서드 


*/
    public <E extends Number> double sum(E[] numbers) {
        double total = 0;
        for (E number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

}//class
