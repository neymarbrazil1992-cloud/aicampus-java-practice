package practice02;

public class BookshelfMain {
    public static void main(String[] args) {
        
        Bookshelf<String> titleShelf = new Bookshelf<String>(5);

        System.out.println("-----책 목록-----");
        titleShelf.addBook("자바의 정석");
        titleShelf.addBook("클린 코드");
        titleShelf.addBook("이펙티브 자바");


    }//main
}//class
