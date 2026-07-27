package chapter05;

public class Functest_06 {

   //멤버 변수
   
   //생성자 
   public Functest_06(){
    
   }
   
    public void getResult(int n) {
        System.out.println(n + "은(는) int 입니다.");
    }//getResult

public void getResult(char n) {
        System.out.println(n + "은(는) char 입니다.");
    }//getResult
public void getResult(String n) {
        System.out.println(n + "은(는) String 입니다.");
    }//getResult
public void getResult(int n, String str) {
        System.out.println(n + "은(는) int 이고, " +str+ "은(는) String입니다." );
    }//getResult
//이름이 같은 건 존재할수 없다 
//이름이 같더라도 매개변수를 다르게 하면 인정이 된다
//메서드 Overloading : method 이름은 같은데 매게변수가 다른 

   
        
}//class
