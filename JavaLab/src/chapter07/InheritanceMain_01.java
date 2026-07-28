package chapter07;

public class InheritanceMain_01 {
    
    public static void main(String[] args) {
        
        
        Strawberry obj = new Strawberry();

        obj.Set1("Berry", "여름");
        obj.Set2("딸기", "중");
        obj.Set3("빨강", 18000);

        obj.Disp1();
        System.out.println("---------------");
        obj.Disp2();
        System.out.println("---------------");
        obj.Disp3();
        System.out.println("---------------");
        




    }//main

}//class
