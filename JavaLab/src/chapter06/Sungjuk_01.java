package chapter06;

import javax.swing.JOptionPane;

public class Sungjuk_01 {
    
//멤버 변수 = 필드 = 속성
private String std_num;
private String std_name;
private int java, oracle, spring;

//생성자
public Sungjuk_01(){

}

//method
public void Sum(){
    int total = java + oracle + spring;
    System.out.println("총점: " + total);

}

public void Avg(){
    double avg = (double)((java + oracle + spring)/3);
    System.out.println("평균: " + avg);
}
//static이 붙지 않았기 때문에 바로 불러서 쓸수 없다
//
//-------------------------------------------------

public static void main(String[] args) {

    //객체 만들기
    Sungjuk_01 rec = new Sungjuk_01();

    rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바점수"));
    rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
    rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));

    rec.Sum();
    rec.Avg();

}//main


}//class
