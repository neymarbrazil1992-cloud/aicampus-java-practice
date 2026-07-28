package chapter07;

public class Strawberry extends Berry {

    private String color;
    private String price;
  

    private String name;
    private String size;

    public Strawberry(){

    }

    public void Set1(String a, String b) {
        name=a;
        size=b;
    }

    //출력
    public void Disp1(){
        System.out.println("분류: " + name);
        System.out.println("계절: " + size);
    }
    
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
    
    public void Set3(String a, String b) {
        name=a;
        size=b;
    }

    //출력
    public void Disp3(){
        System.out.println("분류: " + name);
        System.out.println("계절: " + size);
    }




}//class
