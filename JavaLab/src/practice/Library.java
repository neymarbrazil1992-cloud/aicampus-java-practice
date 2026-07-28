package practice;

public class Library {
    
    //멤버 변수 
    private Book_01[] books = new Book_01[5];
    private int stock;
    
    //생성자
    public Library() {

    }

    //
    public void init() {
        books[0] = new Book_01("오만과 편견", 7);
        books[1] = new Book_01("채식주의자", 5);
        books[2] = new Book_01("총균쇠", 3);
        books[3] = new Book_01("코스코스", 8);
        books[4] = new Book_01("삼국지", 4);
             
    }

    public void showBooks(int m) {
        for (int i = 0; i<books.length ; i++) {
            if (books[i].getStock()>0) {
                System.out.println(books[i].getBookName() + "- 재고:" + books[i].getStock() + "권");
            }
        }
    }

    public void rentBook(String name){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(name)) {
                if (books[i].getStock() > 0) {
                    books[i].decreaseStock();
                    System.out.println(name + " 대출되었습니다. 남은 재고: " + books[i].getStock() + "권");
                } else {
                    System.out.println(name+ "은/는 재고가 없습니다.");
                }
            }
            return;
        }

        System.out.println("해당 도서가 없습니다.");

    }

    

}//class
