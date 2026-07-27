package chapter06;

public class StudentInfo_04 {
    
    //멤버 변수 = 필드 = 속성

    int studentID;
    private String studentname;
    int grade;
    String address;

    
    //기본적으로 생성자를  열어놓는게 편리 
    public StudentInfo_04() {

    }

    

    //생성자 overloading (student ID, studentName, grade, address)
    //cntl + . => gather setter

    public StudentInfo_04(int studentID, String studentname, int grade, String address) {
        this.studentID = studentID;
        this.studentname = studentname;
        this.grade = grade;
        this.address = address;
    
    }//
    


    

    

    public String getStudentname() {
        return studentname;
    }

     


    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }



   

    

    





}//class
