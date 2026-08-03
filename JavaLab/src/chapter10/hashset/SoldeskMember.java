package chapter10.hashset;

public class SoldeskMember {

    private int memberId;
    private String memberName;
    
    
    public SoldeskMember(int memberID, String memberName) {
        this.memberId = memberID;
        this.memberName = memberName;
    }


    public int getMemberID() {
        return memberId;
    }


    public void setMemberID(int memberID) {
        this.memberId = memberID;
    }


    public String getMemberName() {
        return memberName;
    }


    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    
    @Override
	public int hashCode() {
		return memberId; //1001
	}


    @Override//둘중에 하나라도 똑같은게 있으면 ID를 바꿈으로써 중복을 제어
    public boolean equals(Object obj) {
        if (obj instanceof SoldeskMember){
            SoldeskMember member = (SoldeskMember) obj;
            return this.memberId == member.memberId || this.memberName.equals(member.memberName);
        }
        return false;
    }

    


    @Override
    public String toString() {
        
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    

    

    
    


}// class
