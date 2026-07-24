package chapter04;

public class Array01 {
    public static void main(String[] args) {
        
        //배열 선언 
        int a[] = new int[5];

        int b[]; //fixed length

        b = new int[5];

        args = new String[2];
        args[0] = "10";
        args[1] = "20";

        String sum = args[0] + args[1];
        System.out.println("문자열 병합:" +sum);

        int aVal;
        int bVal;

        if (args.length == 2){
            aVal=Integer.parseInt(args[0]);
            bVal=Integer.parseInt(args[1]);             

        }else{
            aVal = 0;
            bVal = 0;
        }

        System.out.println("================");
        int Total = aVal + bVal;
        System.out.println("산술 연산:" + Total);


    }//main
}//class
