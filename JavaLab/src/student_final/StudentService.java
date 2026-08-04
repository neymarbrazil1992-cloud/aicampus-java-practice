package student_final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
    

}//class
