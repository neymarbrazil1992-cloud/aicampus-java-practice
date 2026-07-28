package chapter07;

public class Berry extends Fruit { 
    //"extends" -> 반복되는 class 경우 다른 방에서 "상속"
    
    
   public Berry() {
    
   }
   
    //분류, 계절 
    //이름 사이즈 
    private String name;
    private String size;

     //초기화 메서드
    public void Set2(String a, String b) {
        name=a;
        size=b;
    }

    //출력
    public void Disp2(){
        System.out.println("분류: " + name);
        System.out.println("계절: " + size);
    }


    

}//class
