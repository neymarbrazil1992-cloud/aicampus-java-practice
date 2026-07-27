package practice;

public class practice_03 {

    public class Membership_01 {

        // 멤버 변수 = 필드 = 속성 
        private String memb_num;
        private String member_name;
        private double age, weight, visitCount;
        
        //method 
        //show Info() : 회원 이름 나이 체중을 한줄로 출력 
        //checkAttendance() : 방문 횟수가 12회 이상이면  "우수 회원입니다." 아니면 "방문을 독려해주세요."출력 
    
    public void showInfo(){
     
        System.out.println(member_name + "님/ " + age + "세 / " + weight + "kg" );
    }

    public void checkAttendance(){

        if (visitCount >= 12){
            System.out.println("우수 회원입니다!");
        }else{
            System.out.println("방문을 독려해주세요.");
        }

    }


    }//membership
}//class

