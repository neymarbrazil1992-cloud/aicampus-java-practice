package chapter07;

public class Fruit {
    
   //멤버 변수
   
    private String sort;
    private String season;

    public Fruit(){

    }

    //오버 로딩

    public Fruit(String sort, String season) {
        this.sort = sort;
        this.season = season;
    }



    //초기화 메서드
    public void Set1(String a, String b) {
        sort=a;
        season=b;
    }

    //출력
    public void Disp1(){
        System.out.println("분류: " + sort);
        System.out.println("계절: " + season);
    }

}//class
