package chapter10.hashset;

import java.util.HashSet;
import java.util.Set;

public class SoldeskMemberManager {
    
    //HashSet 공간을 이용해서 멤버 정보를 관리
    private Set<SoldeskMember> members;
    // private String a;
    // private Integer b;
    
    
    //생성자를 통해서 객체 생성 
    public SoldeskMemberManager(){
        members = new HashSet<SoldeskMember>();
    }

    public void addMember(SoldeskMember member) {

        if (members.add(member)){
            System.out.println(member.getMemberID()+"님의 회원 가입 완료");
        }else {
            System.out.println(member.getMemberID()+"는(은) 이미 존재하는 아아디 입니다.");
        }

        

    }//addMember

    //출력 

    public void showALLMember() {

        for(SoldeskMember member : members){
            System.out.println(member);
        }

    } //showallmember
    

    




}//class
