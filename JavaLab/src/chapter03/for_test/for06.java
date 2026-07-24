package chapter03.for_test;

public class for06 {
    public static void main(String[] args) {
        
    //1에서 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요

    int num;
    int total = 0;
    System.out.println("1부터 100까지의 합을 계산하시오.");
        
    for (num=0;num<=100;num++) {

        if (num % 3 ==0) {
            System.out.print(num+ " ");
            total += num;
        }


    }//for
    System.out.println("1부터 100까지의 합은: " + total + " 입니다.");



    }//main
}//class
