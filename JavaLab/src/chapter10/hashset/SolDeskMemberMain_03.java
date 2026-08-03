package chapter10.hashset;

public class SolDeskMemberMain_03 {
    
    public static void main(String[] args) {
        
        //SoldeskMember의 객체가 저장될 수 있는 HashSet이 생성됨 
        SoldeskMemberManager manager = new SoldeskMemberManager();

        //회원 가입할 때 필요한 정보를 획득 
        SoldeskMember member1 = new SoldeskMember(1001, "진광채");
        SoldeskMember member2 = new SoldeskMember(1002, "진꽝채");
        SoldeskMember member3 = new SoldeskMember(1003, "진공채");

        manager.addMember(member1);
        manager.addMember(member2);
        manager.addMember(member3);
        manager.addMember(new SoldeskMember(1004, "탄빵이"));
        
        //중복 확인
        manager.addMember(new SoldeskMember(1003, "진공채"));

        //전체 회원 
        System.out.println("-----전체 회원 목록-----");
        manager.showALLMember();       


    }//main

}//class
