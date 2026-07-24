package chapter03.while_test;

public class whiletest01 {
    public static void main(String[] args) {
        
        //특정 조건이 만족할 때 까지 무한 반복
        while (true) {

            int num = (int)(Math.random()*6)+1; //1,2,3,4,5,6
            System.out.println("주사위의 눈: " + num);
            
            if (num == 6){
                break; //조건 충족 시 while문 탈출 
            }
        }
        System.out.println("프로그램 종료");        

    }//main
}//class
