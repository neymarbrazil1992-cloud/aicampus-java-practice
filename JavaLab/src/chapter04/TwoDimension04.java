package chapter04;

public class TwoDimension04 {
    public static void main(String[] args) {

    //2차원 배열 
    int arr[][]= new int[2][3];
    int n = 0;
    int arr1[][]= {{1,2,3},{4,5,6}};

    for (int i=0 ;i<arr.length;i++){
        for(int j = 0; j<arr1[i].length; j++);{
            n++; //1
            System.out.println(arr1[i][j]+" ");
        }//in for
        System.out.println();

    }//out for
    System.out.println("-------------------------");
    System.out.println(arr.length + "행");
    System.out.println(arr[0].length + "열");
    System.out.println("---------------------");

    for (int i = 0; i<arr1.length;i++) {
        for(int j = 0; j<arr1[i].length; j++){
            
            System.out.println(arr1[i][j]+" ");

        }//
        System.out.println();
    }//
    


    }//main
}//class
