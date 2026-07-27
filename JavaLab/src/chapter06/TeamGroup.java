package chapter06;

public class TeamGroup {

    // member 변수
    // TeamName | Teammember | class |

    // private TeamMember_03 member1= new TeamMember_03();
    // private TeamMember_03 member2= new TeamMember_03();
    // private TeamMember_03 member3= new TeamMember_03();
    // private TeamMember_03 member4= new TeamMember_03();
    // private TeamMember_03 member5= new TeamMember_03();
    // private TeamMember_03 member6= new TeamMember_03();

    // private String s1=new String();

    // 멤버 변수 : member[0] ~ member[6]
    private TeamMember_03[] member = new TeamMember_03[6];

    // 생성자

    // 메서드

    public void init() {

        // member[0].setName("강익현");
        // member[0].setGender("남");

        

        member[0] = new TeamMember_03("안동주", "남");
        member[1] = new TeamMember_03("신동연", "여");
        member[2] = new TeamMember_03("공면관", "남");
        member[3] = new TeamMember_03("이나연", "여");
        member[4] = new TeamMember_03("최민석", "남");
        member[5] = new TeamMember_03("진광채", "남");

    }

    // ---------------------------------------

    public void Disp() {

        // member1.getsName();
        // member1.getGender();


        for (int i=0;i<member.length;i++){
              System.out.println("성명: " + (member[i].getName()));
              System.out.println("성별: " + (member[i].getGender()));

        }

        System.out.println("성명: " + (member[0].getName()));
        System.out.println("성별: " + (member[0].getGender()));
        // System.out.println("성명: " + (member[1].getName()));
        // System.out.println("성별: " + (member[1].getGender()));
        // System.out.println("성명: " + (member[2].getName()));
        // System.out.println("성별: " + (member[2].getGender()));
        // System.out.println("성명: " + (member[3].getName()));
        // System.out.println("성별: " + (member[3].getGender()));
        // System.out.println("성명: " + (member[4].getName()));
        // System.out.println("성별: " + (member[4].getGender()));
        // System.out.println("성명: " + (member[5].getName()));
        // System.out.println("성별: " + (member[5].getGender()));


        
    }

}// class
