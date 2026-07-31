package chapter10;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        
        // ArrayList<String> students = new ArrayList<>();
        List<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Chalie");
        students.add("Diana");

        //학생 출력
        System.out.println("-------student List-------");
        for (String student: students) {
            System.out.println(student);
        }//for

        students.remove("Bob");
        //제거 후 학생 출력
        System.out.println("-------Removed List-------");
        for (String student: students) {
            System.out.println(student);
        }//for


    }//main
}//class
