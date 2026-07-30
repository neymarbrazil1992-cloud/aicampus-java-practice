package practice01;

public class Book_01 {
    
    private String bookName;
    private int stock;
    
    //기본 생성자
    public Book_01() {
        
    }
    
    //오버 로드
    public Book_01(String bookName, int stock) {
        this.bookName = bookName;
        this.stock = stock;
    }

   
   //getter
    public String getBookName() {
        return bookName;
    }

    public int getStock() {
        return stock;
    }

    public int decreaseStock() {
        stock = stock -1;
        return stock;

    }

    
    

    

}
