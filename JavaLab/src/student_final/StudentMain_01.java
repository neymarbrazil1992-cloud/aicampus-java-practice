package student_final;

import java.util.Scanner;

public class StudentMain_01 {

    static Scanner sc = new Scanner(System.in);
    static StudentService service = new StudentService();
    public static void main(String[] args) {

        
        
        //학생 등록, 학번 검색, 학번 중복 체크, 안전하게 삭제, 점수순 정렬, 종료
        /**
         * 프로그램 실행 클래스 (화면/입력 담당)
         * ------------------------------------------------
         * 이 클래스는 컬렉션을 직접 다루지 않는다.
         * 메뉴를 보여주고, 입력을 받아서 StudentService에게 "일을 시키기만" 한다.
         *
         * 메뉴
         *  1. 학생 추가        4. 전체 목록 출력
         *  2. 학생 삭제        5. 점수순 정렬 출력
         *  3. 학번으로 검색    6. 평균 점수 출력
         *  0. 종료
         */

        int menu;
        do{
            printMenu();
            menu=readInt("메뉴 선택>> ");

            switch (menu) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> searchStudent();
                case 4 -> printAll();
                case 5 -> printSortedByScore();
                case 6 -> printAverage();
                case 0 -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");                    
                            
                }

        }while(menu != 0);
        
       
        



    }//main

    static void printMenu() {

        System.out.println("=========================================");
        System.out.println(" 1.학생추가  2.학생삭제  3.검색  4.전체출력");
        System.out.println(" 5.점수순정렬  6.평균점수  0.종료");
        System.out.println("=========================================");

    }

    static int readInt(String message) {

        System.out.print(message);
        while(!sc.hasNextInt()){
            System.out.println("숫자를 입력하세요.");
            System.out.print(message);
            sc.next();
        }
        return sc.nextInt();
    }//readInt

    static void addStudent(){

        System.out.print("학번 입력 >> ");
        String id = sc.next();
        System.out.print("이름 입력 >> ");
        String name = sc.next();
        int score = readInt("점수 입력 >> ");

        boolean success = service.addStudent(id, name, score);
        if(success){
            System.out.println("추가 완료: " + service.findStudent(id));
        }else{
            System.out.println("이미 존재하는 학번입니다.");
        }
    }

    static void removeStudent(){

        System.out.print("학번 입력 >> ");
        String id = sc.next();
        

        

    }

    static void searchStudent(){
    }
    static void printAll(){
    }
    static void printSortedByScore(){
    }
    static void printAverage(){
    }



}//class
