package practice01;

public class Quickreview {
    
    //private -> 반드시 getter/setter 로만 접근 가능 
    private String name;
    private int score;

    //private 없음 -> 직접 접근(.필드) 가능 
    String memo;

    //기본 생성자 
    public Quickreview(){

    }
    //오버로딩 생성자       
        
        public Quickreview(String name, int score) {
        this.name = name;
        this.score = score;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

    public void show(){
        System.out.println(name + " / " + score + "점 / " + memo);
    }
    
    public static void main(String[] args) {

        //기본 생성자 + setter 로 값 넣기
        Quickreview a = new Quickreview();

        //quicreview a 

        a.setName("진광채");
        a.setScore(90);
        //a.memo = "직접 수정"; // private 아니라서 이렇게도 가능
        a.show();

        //2. 오버로딩 생성자로 한번에 초기화
        Quickreview b = new Quickreview("탄빵이", 85);
        b.show();

        //3.객체 배열 (n명이 관리하는 패턴)
        Quickreview[] list = new Quickreview[3];
        list[0] = new Quickreview("A", 70);
        list[1] = new Quickreview("B", 80);
        list[2] = new Quickreview("C", 85);
        //!! 베열 인덱스는 항상 0부터 시작한다.
        
        for (int i = 0; i < list.length ; i++ ) {
            list[i].show();
        }

    /* 30 초 요약
    -private 붙은 필드 -> .필드로 직접 못 건드림. 빈드시 getX()/setX() 거쳐 야함 
    -private 없는 필드 -> .필드로 직접 접근 가능 
    -생성자 오버로딩 -> 같은 클래스에 매개변수 다른 생성자 여러 개 (빈것 / 값 채워서 만드는 것 )
    -객체 배열 -> 클래스[] 배열 = new 클래스 [개 수]
                 만들고, for 문으로 배열[i] = new 클래스(...)채우기 

    -"new"는 진짜 물건을 하나 만들어라는 명령어
    클래스는 그냥 설계도(종이 위의 도면)일뿐 실체가 없다. new를 쓰는 순간, 그 설계도를 바탕으로 컴퓨터 메모리 안에 진짜 물건 하나가 실제로 만들어져요.

    
    
    */

    }
    

}
