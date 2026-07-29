package chapter07;

public class StudentMain_03 {
    
    public static void main(String[] args) {

        Student student = new Student("홍길동", "010-1111-1111", 1000);
        
        System.out.println("name: " + student.name);
        System.out.println("phone: " + student.phone);
        System.out.println("StudentNo: " + student.StudentNo);

    }//main
}//class
