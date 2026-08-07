package student_final;

  /**
 * 학생 정보를 담는 클래스 (모델)
 * - 데이터(필드)와 그 데이터를 표현하는 기능만 가짐(학번id, 이름name, 점수score)
 * - 컬렉션에 담기는 "재료" 역할
 */
   

public class Student {

    //멤버 변수 = 필드 ? = 속도 

    private String id;
    private String name;
    private int score;

    
    //기본 생성자 
    public Student() {

    }

   //overloading
    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    //getter or setter  생성자를 통해서 멤버변수를 초기화하는 이유는 -> Database 한테 전달할 목적 
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format(
            "학번: %s, 이름: %s, 점수: %d",
            id,name,score
        );        
    }

    // @Override
    // public String toString() {
    //     return String.format(
    //     "학번: %s, 이름: %s, 점수: %d",
    //     id,name,score        
    //     );                   
    // }

    
    
    

  
    

}
