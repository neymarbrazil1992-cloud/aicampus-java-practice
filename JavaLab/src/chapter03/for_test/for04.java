package chapter03.for_test;

public class for04 {
    public static void main(String[] args) {
        
        System.out.println("===0부터 100까지의 수중 홀수의 합을 출력===");
        
        int num; //인덱스 변수 
        int total = 0;
        //#1
        // for(num=1;num<=100;num++){
        //     if(num % 2 == 1){
        //         total += num;
        //     }
            
        // } // for 

        // System.out.println("0부터 100까지의 수중 홀수의 합: " + total);
        for(num=1;num<=100;num++){

           

            if(num % 2 == 0){
                //버려 또는 무시해
                continue; //그냥 for로 가세요 
            }
            //홀수만 수행  
            System.out.print(num + " ");
            total += num;
            
            
        } // for 

        System.out.println("0부터 100까지의 수중 홀수의 합: " + total);
    
    }//main
}//class
