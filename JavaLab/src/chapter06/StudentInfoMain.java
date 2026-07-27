package chapter06;

public class StudentInfoMain {
    public static void main(String[] args) {
        
        //객체 생성 
        // StudentInfo_04 studentback = new StudentInfo_04();

        StudentInfo_04 studentback = new StudentInfo_04(1004, "백설공주", 100, "답십리동");


        //출력 
        System.out.println(studentback.studentID);
        // System.out.println(studentback.studentname);
        System.out.println(studentback.grade);
        System.out.println(studentback.address);

        System.out.println();

       //객체 생성   
        StudentInfo_04 studentJin = new StudentInfo_04(1000, "진광채", 95, "서울");
       
       //출력 
        System.out.println(studentJin.studentID);
        // System.out.println(studentJin.studentname);
        System.out.println(studentJin.grade);
        System.out.println(studentJin.address);
        



    }//main
}//class
