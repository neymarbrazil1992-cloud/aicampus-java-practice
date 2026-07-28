package chapter06;

public class ReviewStudent_05 {

    // 멤버변수
    private static  int nextID = 1000;
    // studentID를 final로 선언하면 생성자에서 딱 한 번만 값을 정할 수 있고, 이후에는 절대 바뀌지 못함
    public final int studentID;
    public String studentName; // 솔데이터
    int grade;
    String address; // 강남구

    // 기본 생성자
    public ReviewStudent_05() {
        this.studentID = nextID++; // 현재 값 저장 후 1 증가
    }

    // 오버로딩 생성자(String studentName / String address)
    public ReviewStudent_05(String studentName, String address) {
        this.studentID = nextID++;
        this.studentName = studentName;
        this.address = address;
    }

   
    //getters and setters 
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    
}//class
