package chapter07;

public class Student extends People {
    
    public int StudentNo;

    //기본 생성자 생략
    
    //생성자 오버로딩
    public Student(String name, String phone, int StudentNo){

        super(name,phone);
        this.StudentNo = StudentNo;

    }
}
