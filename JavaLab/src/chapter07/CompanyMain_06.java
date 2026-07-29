package chapter07;

public class CompanyMain_06 {
    public static void main(String[] args) {
        
    // Employee 객체 생성후 메서드 사용
    Employee emp =  new Employee("진광채", 10000000);
    emp.work();
    emp.getInfo();

    System.out.println();
    // Manager 객체 생성후 메서드 사용
    Manager mgr = new Manager("박관리자", 5000, "영업");
    mgr.work(); //자식꺼
    mgr.getInfo(); //부모꺼
    mgr.approveLeave(" 진광채");
    System.out.println();

    //부모 = 자식(업캐스팅)  
    //상속 개념이 보이게 객체 생성 
    //자식한테 있는 메서드는 사용 불가능   
    Employee emp2 = new Manager("최팀장", 5500, "개발");
    emp2.work();
    emp2.getInfo();


    }//main
    
}//class
