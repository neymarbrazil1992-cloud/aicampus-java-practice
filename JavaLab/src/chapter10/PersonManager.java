package chapter10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
    
    public void PersonManager(){

        int select;
        Person p;
        
        ArrayList<Person> personarr = new ArrayList<>();

        // persons.add(null);       //|
        // persons.remove(persons);   // | => 이렇게 활용 가능 
        // persons.iterator();         //|
       
        // String name = scan.next();
                    // p.setName(name);

        
        while (true) {

            System.out.println("(1)회원가입, (2)정보삭제, (3)정보검색, (4)종료: ");
            
            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();

            switch (select) {
                case 1: 
                    //persons 객체에 Person  클래스의 객체 정보를 추가 
                    p=new Person();
                    System.out.println("---정보를 추가합니다.---");
                    System.out.println("이름: "); 
                    p.setName(scan.next());
                    
                    System.out.println("나이: "); 
                    p.setAge(scan.nextInt());

                    System.out.println("전화번호: "); 
                    p.setTel(scan.next());

                    //Arraylist에 추가 
                    personarr.add(p);
                    System.out.println("회원가입 완료");

                    break;
                case 2:

                    System.out.println("---정보를 삭제합니다---");
                    System.out.print("탈퇴회원 이름: ");
                    String name = scan.next();

                    for(int i = 0; i<personarr.size(); i++) {
                        if(personarr.get(i).getName().equals(name)){
                            personarr.remove(i);
                            System.out.println(name+"님의 정보가 모두 삭제되었습니다.");
                            break;
                        }else{
                            if(i+1 == personarr.size()){
                                System.out.println(name+"님의 정보는 존재하지 않는 이름입니다.");
                            }
                        }
                    }//for 


                    break;
                case 3:
                    System.out.println("---정보를 출력합니다---");
                    System.out.println("등록인원은 " + personarr.size()+"명");
                    
                    //반복자(Iterator)
                    Iterator<Person> it = personarr.iterator();

                    while(it.hasNext()){
                        p=it.next();
                        System.out.println("이름: "+ p.getName());
                        System.out.println("나이: "+ p.getAge());
                        System.out.println("전화번호: "+ p.getTel());
                        System.out.println("-----------------");

                    }
                    
                    break;
                  
                default:
                    System.out.println("프로그램 종료");
                    return;
            
            }//switch


        }

    }//method 
    

}//class
