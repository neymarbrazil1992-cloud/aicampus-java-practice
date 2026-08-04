package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain_02 {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();
        
        //id: key | password: value
        map.put("Spring","123" );
        map.put("Summer","1234" );
        map.put("Herbst","12345" );
        map.put("Winter","123456" );

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.print("아이디 : ");
            String id =scan.next();
			
            if (map.containsKey(id)){
                //password
                System.out.print("비밀번호 : ");
                String pw =scan.next();

                //비번과 아이디 일치 
                if (map.get(id).equals(pw)) {
                    System.out.println("로그인 성공!");
                    break;
                }else{
                    System.out.println("비밀번호를 잘못 입력하셨습니다.");
                    continue;
                }


            }else{
                System.out.println("입력하신 아이디는 존재하지 않습니다.");
                
            }//out if 

            



        }//while




    }//main
}//class
