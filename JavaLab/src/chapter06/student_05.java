package chapter06;

public class student_05 {
    
    //멤버 변수 
    public static final int studentID=1000;
    public String studentName;
    int grade; 
    String address;

    //기본 생성자 
    public student_05 () {
        // studentID = 10001; - > final 이기 때문에 안됨
        studentName="a";
    }
    public student_05() {
        this studentID = nextID++;
    }

    

   
   
   
   //getter & setter
    public static int getStudentid() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //오버로딩

    public student_05(String studentName, String address) {
        this.studentName = studentName;
        this.address = address;
        
    }

    

    




    public student_05(String studentName, int grade, String address) {
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    public void showDetailedStuInfo() {
        System.out.println("Name: " + studentName +"Grade: " + grade + "Address: " + address);
    }




    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    

    
    
    






}//class
