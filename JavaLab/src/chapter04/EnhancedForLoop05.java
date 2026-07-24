package chapter04;

public class EnhancedForLoop05 {
    public static void main(String[] args) {
        
        String strArray[] = {"Java","Oracle","HTML","CSS","JSP","Spring","Python"};

        for (int i = 0; i<strArray.length; i++){
            System.out.println(strArray[i] + " ");
        }//for
        System.out.println();

        for(String lang:strArray) {
            System.out.println(lang + " ");

        }

    }//main
}//class
