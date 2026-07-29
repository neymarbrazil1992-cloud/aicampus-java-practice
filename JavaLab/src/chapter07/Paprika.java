package chapter07;

public class Paprika extends Vegetable {

    private String color;    
    private int price;    
    private String name;

    
public void Set2(String a, int b, String c) {
   color = a;
   price = b;
   name = c;
}






public void Disp1() {
    System.out.println("-----Vegetable-----");
    System.out.println("분류: " + sort);
    System.out.println("계절: " + season);
    //super.name 부모 클래스의 기본 생성자를 이용하며 선언
    System.out.println("이름: " + super.name);

    System.out.println();
}

public void Disp2() {
    System.out.println("-----Paprika-----");
    System.out.println("색깔: " + color);
    System.out.println("가격: " + price);
    //super.name 부모 클래스의 기본 생성자를 이용하며 선언
    System.out.println("이름: " + name);

    System.out.println();

}




}//class
