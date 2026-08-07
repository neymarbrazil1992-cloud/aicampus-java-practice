package student_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * 학생 목록을 관리하는 서비스 클래스
 * ------------------------------------------------
 * 실제 컬렉션 로직(추가/삭제/검색/정렬/평균)을 전부 이 클래스가 담당한다.
 * Main은 "메뉴 입력을 받아서 이 클래스에 전달"하는 역할만 한다. (관심사 분리)
 *
 * 활용 컬렉션
 *  - ArrayList<Student>        : 등록 순서를 유지하는 전체 목록
 *  - HashMap<String, Student>  : 학번으로 빠르게 검색 (O(1))
 *  - HashSet<String>           : 학번 중복 체크
 *  - Iterator                  : 리스트 순회 중 안전하게 삭제
 *  - Collections.sort          : 점수순 정렬
 */

public class StudentService {
    
  
    private List<Student> studentList = new ArrayList<>();

    private Map<String, Student> studentMap = new HashMap<>();

    private Set<String> idset = new HashSet<>();

    //학생 추가, 이미 있는 학번(id)이면 false 반환

    public boolean addStudent(String id, String name, int score) {
        if(idset.contains(id)){
            return false;// 중복 학번 필터링
        }
        
        Student student = new Student(id, name, score);
        studentList.add(student);
        // studentList.add(new Student(id, name, score));
        studentMap.put(id, student );
        idset.add(id);
        return true;

    }//addstudent

    //학번으로 삭제 

    public boolean removeStudent(String id){
        if(!studentMap.containsKey(id)){
            return false; // 존재여부 
        }
        
        //iterator 로 Arraylist 순회 중 안전하게 제거 
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            Student s =it.next();
            if(s.getId().equals(id)){
                it.remove();
                break;
            }//if
        }//while

        studentMap.remove(id);
        idset.remove(id);
               
      return true;
    }// remove student

    //학번으로 검색(없으면 null)
    //제일 빠르게 찾는 방법
    public Student findStudent(String id) {

        return studentMap.get(id);

    }//find id

    //전체 목록 (등록 순서 그대로)
    public List<Student> getAllStudents() {
        return studentList;
    }

    //점수 높은 순으로 정렬된 새 리스트 반환 (원본은 건드리지 않음)

    public List<Student> getStudentsSortedByScore() {
        //studentList 복사해서 생성된 객체 
        List<Student> sorted= new ArrayList<Student>(studentList);
        
        Collections.sort(sorted, new Comparator<Student>() {

            @Override
            public int compare(Student a, Student b) {
                return b.getScore() - a.getScore(); // 내림차순 
                // return a.getScore() - b.getScore(); // 오름차순 
                
            }
            
        });
        
        return sorted;
    }//getStudentSortedByScore

    //평균 점수 계산 
    public double getAverageScore(){

        if(studentList.isEmpty()){
            return 0.0;
        }
        int total = 0;
        for (Student s:studentList) {
            total += s.getScore();
        }
        return (double) total / studentList.size();

        // double avg = total / studentList.size();

    }// getAverageScore

    public boolean isEmpty() {
        return studentList.isEmpty();//데이터가 있는지 점검 
    }

    public int count() {
        return studentList.size();//등록갯수
    }
    
    
    
  

 




    

}//class
