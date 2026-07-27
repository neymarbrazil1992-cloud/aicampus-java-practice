package chapter06;

public class TeamMember_03 {
    
    //필드 멤버 변수 //Linked w. (Set <-> Get) Database (Save <-> Open)

    public String teamName; //팀명
    public String mName; // 팀장
    public String mPhone; //팀장 전화번호
    public String sName; //부팀장
    public String name; //팀원명(안동주)
    public String gender; //팀원 성별(남)
    
   
   //생성자 (디폴트 생성자)

   public TeamMember_03() {

   }
   
    //생성자 Overload
    public TeamMember_03(String name, String gender) {
        this.name=name;
        this.gender=gender;
    }
    
    
    
    
    
    //Setter(저장하기) & Getter(가져오기) 
    public String getTeamName() { //'X'팀명을 데이터 베이스 -> Getter
        return teamName;
    }
    public void setTeamName(String teamName) {//'X'팀명을 Data Base ->Setter
        this.teamName = teamName;
    }


    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }


    public String getmPhone() {
        return mPhone;
    }
    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }


    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    //생성자 (디폴트 생성자 생략)
    /*
    public TeamMember_03(){
    }
    */

    


}//class
