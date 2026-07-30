package practice02;

public interface Borrowable {

    void borrow();
    default void process() {
        System.out.println("대출 처리");
    }
    
}//interface
