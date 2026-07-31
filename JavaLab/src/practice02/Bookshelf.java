package practice02;

public class Bookshelf<T> {

    private T[] books;
    private int count;

    public Bookshelf(int size) {
        books = (T[]) new Object[size];
        count = 0;
    }

    public void addBook(T book) {
        if (count < books.length) {
            books[count++] = book;
        }else {
            System.out.println("Bookshelf is Full");
        }
    }

    public void printBooks() {
        for (int i = 0; i<count ; i++) {
            System.out.println(books[i] + " ");
        }
        System.out.println();
    }

    public T[] getBooks() {
        return books;
    }

    public <E extends Number> double totalPrice(E[] prices) {
        double total = 0;
        for (E price : prices) {
            total += price.doubleValue();
        }
        return total;
    }


    
}
