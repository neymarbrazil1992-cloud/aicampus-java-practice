package chapter03.for_test;

public class for08 {
    public static void main(String[] args) {
    
        for (int item=1; item<=3; item++){
        
            //상품 종류 결정 
            String name = "";
            int price = 0;

            if(item ==1){
                name="연필";
                price=500;
            }else if(item==2){
                name="공책";
                price=1000;
            }else{
                name="지우개";
                price=300;
            }//if

            //name, price 확보

            System.out.println("===" + name + "===");

            for(int count=1;count <= 5;count++){
                System.out.println(name+" "+count+"개: "+(price*count));
            }//for

        }//for 


    }//main
}//class
