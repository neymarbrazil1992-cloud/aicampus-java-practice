package chapter03.for_test;

public class for07 {
    public static void main(String[] args) {
    
        for(int i=2;i<10;i++){
            // i = 2
            for(int j=1;j<10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            } // in for 
            System.out.println("=========================");
        } // out for 

        for (int n = 2; n <= 9; n++) {
            System.out.print("[" + n + "단]" + "\t");
        }
        System.out.println();

        for (int k = 1; k <= 9; k++) {
            for (int a = 2; a <= 9; a++) {
                System.out.print(a + "X" + k + "=" + (a * k) + "\t");
            }
            System.out.println();
        } // out for


    }//main
}//class
