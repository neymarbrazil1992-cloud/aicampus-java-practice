package practice;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        lib.init();

        while (true) {

            lib.showBooks(0);
            System.out.println("---------------------");

            System.out.println("대출할 책 이름을 입력하세요 (그만하려면 '종료' 입력): ");
            String select = scan.nextLine();

            if (select.equals("종료")) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
            lib.rentBook(select);
            System.out.println();

            

        
        }//while

    }//main
}//class
