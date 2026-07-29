package chapter07;

public class Manager extends Employee{
    
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + "팀장이 " + department + "부서를 관리하고 있습니다.");
    }

    public void approveLeave(String employeeName) {
        System.out.println(name + " 팀장이" +employeeName+"부서의 휴가를 승인했습니다.");
    }    

    /*
    - 상속(extends) : 자식이 부모 필드 / 메서드를 그대로 물려받음
    - super() : 자식 생성자에서 부모 생성자를 호출해 공통 필드 초기화
    -@Override : 자식이 부모 메서드를 자기 방식으로 재정의 
    -업캐스팅 : 부모 타입 변수 = 자식 객체 -> 부모에 정의된 메서드만 호출 가능 
    
    */



}//class
