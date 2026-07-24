package chapter05;

import java.util.Scanner;

public class Functest_04 {

    public static String Edustep(int edu){

        String step = "";
        switch (edu) {
            case 1: {
                step="초급";
                break;
            }               
               
            case 2: {
                step="중급";
                break;
            }             
        
            case 3: {
                step="고급";
                break;
            }
                              
            case 4: {
                step="특급";
                break;
            }
                            
        
            default:{
                System.out.println("잘 못 입력하였습니다.");
                step="0";
            }
                
        }//switch

        return step; //반환 값
        //void로 선언하면 return을 할 수 없다. 
        //이 안에 있는 code는 void를 선언함으로써 밖으로 나갈수 없다.?

    }//edu step
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("스터디 단계를 입력하세요: ");
        int number = scan.nextInt();

        String step = Edustep(number);//step 값이 넘어옴
        System.out.println("현재 수업단계는: "+ step +"단계 입니다.");

        //밖에서 static으로 불러올 때 형변환이 일치 해야 한다.


        
    }//main
}//class
