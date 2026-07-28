package chapter06;

public class ReviewStudentMain {
    public static void main(String[] args) {
        
        //기본 생성자를 이용한 student 1 객체 생성
        student_05 student1 = new student_05();
      //멤버 변수에 이름 주소를 입력하고 
        student1.studentName="진광채";
        student1.address="답십리동";
      //출력(showStudentInfo)
        student1.showStudentInfo();

        ReviewStudent_05 student10 = new ReviewStudent_05();
        

       //-------------------------------
       System.out.println();
       //오버 로딩 생성자를 이용하여 초기화된 객체 생성(student1)
       student_05 student2 = new student_05("탄빵이", "강남구");
       student2.showStudentInfo();
       student_05 student4 = new student_05("돌체", "동대문구");

       //----------------------------------------
       System.out.println();
       //getter/setter을 이용할 객체(student3)
       student_05 student3 = new student_05();
       student3.setStudentName("리즈");
       student3.setAddress("성수동");
       //출력
       System.out.print(student3.getStudentName()+", ");
       System.out.print(student3.getAddress());



       //출력(showStudentInfo)



    }
}
