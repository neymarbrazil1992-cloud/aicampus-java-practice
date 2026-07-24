package chapter03.for_test;

public class for01 {
    public static void main(String[] args) {
        //1~10까지의 합
        // int sum=1;
        //복합연산자 sum=sum+1 =>sum += 1
        // sum += 2;

        // System.out.println(sum);
//반복문 (Loop Statement) -> for
//for - (initalization condition increment) - (code)
//반복하느니 한번에 끝내는 개발 방법

        int i;
        System.out.println("1부터 10까지의 수 출력");
        //처음부터 습관을 0부터 하는 습관을 들여야함
        //for문은 특별한 경우를 제외하고 후위연산을 한다
        for(i=0;i<10;i++){
            System.out.print((i + 1) + " ");
        }
        System.out.println("-----------------------------");

        int k; //인덱스 변수 
        int sum=0; // 누적 변수 

        for (k = 0; k <= 10; ++k){
            // sum=sum+k;
            sum += k;
            System.out.println("Current k: " + k + ", sum: " + sum);
        }
        System.out.println(sum);



    }
}
