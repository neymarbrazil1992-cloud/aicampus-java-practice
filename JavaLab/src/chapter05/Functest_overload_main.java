package chapter05;

public class Functest_overload_main {
    public static void main(String[] args) {
        
        
        Functest_06 obj = new Functest_06();

        obj.getResult(5);
        obj.getResult('A');
        obj.getResult("월요일 입니다.");
        obj.getResult(7, "2026");

       

        
    }//main
}//class
