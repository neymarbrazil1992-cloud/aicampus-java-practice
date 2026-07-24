package chapter05;

public class Functest_03 {
    
    public static void Display1(String[] A){

        String res="";

         //A 배열 변수방의 요소를 모두 res 에 저장하는 method
         for(int i=0;i<A.length;i++){
        res += A[i] + " ";

        }//for

        System.out.println(res);
    
    }//Display1

    public void Display2(String[] A){

         String res="";

        //A 배열 변수방의 요소를 모두 res 에 저장하는 method
        for(int i=0;i<A.length;i++){
        res += A[i] + " ";

        }//for

        System.out.println(res);

}//display 2 

public static void main(String[] args) {

    String str[] = { "Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot" };

    Display1(str);
    System.out.println();

    Functest_03 obj = new Functest_03();
    obj.Display2(str);

    
}//main

// Method Area(Static Area => Metaspace)
// -> static 변수 또는 메서드 
// -> 프로그램이 실행 시 클래스 로딩되면서 JVM에 적재됨
// -> 객체 생성 없이 사용이 가능

// Heap 영역(동적 메모리)
// -> new 키워드를 통해 생성됨(객체와 배열)
// -> 인스턴스 변수
// -> close()로 소멸 생략이 가능

// Stack 영역
// -> 지역변수, 메서드 호출, 매개변수
// -> 메서드 호출시 Stack Frame으로 작동
// -> 메서드 종료 시 자동 제거


    

}//class
