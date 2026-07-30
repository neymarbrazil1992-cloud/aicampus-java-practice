package practice02;

public interface Returnable {

    void giveBack();
    default void process() {
        System.out.println("반납 처리");
    }

    
}//interface
