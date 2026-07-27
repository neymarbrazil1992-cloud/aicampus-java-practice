package chapter06;

public class TeamMain {
    public static void main(String[] args) {
        
        // TeamMember_03 team = new TeamMember_03();

        /////////////////////////////////////////////

        TeamGroup team = new TeamGroup();
        team.init();   // 입력
        team.Disp();  // 출력 

        System.out.println();
        TeamMember_03 t = new TeamMember_03();

        t.setName("오여은");
        System.out.println("팀원이름: "+t.getName());
        t.setmPhone("010-1111-2222");
        System.out.println("전화번호: " + t.getmPhone());

        //team. ---> 사용했던 객체가 다 나옴 

    }//main
}//class
