package chapter05;

import java.util.Scanner;

public class Pastry_09 {
    
//멤버 변수

//생성자


public Pastry_09(){

}

//method

public void makeBread(){
    System.out.println("빵을 만듭니다.");
}

//Overloading //Overwriting
public void makeBread(int cnt){
    int i;
    for(i=0; i <= cnt; i++ ){
        
        System.out.println((i+1) + "번째 빵을 만듭니다.");

    }

    System.out.println("요청하신 " + cnt + "개의 빵이 완성되었습니다.");
}

public void makeBread(int cnt, String name){
    int i;
    for(i=0; i <= cnt; i++ ){
        
        System.out.println((i+1) + " 번째" + name+ "빵을 만듭니다.");

    }

    System.out.println("요청하신 " + cnt + "개의" +name+ "빵이 완성되었습니다.");
}

void order(){

    boolean run = true;

    Scanner scan = new Scanner(System.in);

    while (run) {
        System.out.println("------------------------------------------");
		System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택>>");

        int num = Integer.parseInt(scan.nextLine());

        switch (num) {
            case 1:
                System.out.println("빵개수를 입력해주세요: ");
                int cnt1 = Integer.parseInt(scan.nextLine());
                makeBread(cnt1);              
                
                break;
            case 2:
                System.out.println("빵개수를 입력해주세요: ");
                int cnt2 = Integer.parseInt(scan.nextLine());
                System.out.println("빵종류를 입력해주세요: ");
                String name = scan.nextLine();
                makeBread(cnt2,name);
                
                
                break;
            case 3:
                
                System.out.println("프로그램 종료");
                run = false;
                
                
                break;    
            default:
               System.out.println("질못된 번호를 입력하셨습니다.");
        
        
        }//switch

        
    }//while


}//order





}//class
