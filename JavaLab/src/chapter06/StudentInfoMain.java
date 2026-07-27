package chapter06;

public class StudentInfoMain {
    public static void main(String[] args) {
        
        //객체 생성 
        // StudentInfo_04 studentback = new StudentInfo_04();

        StudentInfo_04 studentback = new StudentInfo_04(1004, "백설공주", 100, "답십리동");


        //출력 
        System.out.println(studentback.studentID);
        //System.out.println(studentback.studentname);//->객체를 통하여 다이렉트로 땡겨오는건 안된다
        System.out.println(studentback.getStudentname());
        System.out.println(studentback.grade);
        System.out.println(studentback.address);

        System.out.println();

       //객체 생성   
        StudentInfo_04 studentJin = new StudentInfo_04(1000, "진광채", 95, "서울");
       
       //출력 
        System.out.println(studentJin.studentID);
        // System.out.println(studentJin.studentname);
        System.out.println(studentJin.getStudentname());
        System.out.println(studentJin.grade);
        System.out.println(studentJin.address);

        //기본 생성자
        StudentInfo_04 stdKim = new StudentInfo_04();
        stdKim.setStudentname("김군");
        System.out.println(stdKim.getStudentname());

        
        stdKim.address = "종로구";
        System.out.println(stdKim.address);
        



    }//main
}//class
