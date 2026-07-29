package chapter07;

public class ChildMain {
    public static void main(String[] args) {
        
        Child child = new Child();

        child.Method1(); //부모꺼
        child.Method2(); //자식꺼
        child.Method3(); //자식꺼

        System.out.println();

        Parent parent1 = child;
        child.Method1(); //부모꺼
        child.Method2(); //자식꺼
        System.out.println();

        Parent parent2 = new Parent();
        parent2.Method1();
        parent2.Method2();
        System.out.println();


        //Overloading : "여러방식으로 부를수 있는 선택지를 늘리는 것"
        //Overloading : "부모의 클래스의 메서드를 자식 클래스에서 다시 정의해서 덮어쓰는것 "

    }//main
}//class
