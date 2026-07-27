package chapter05;

public class Functest_08 {
    public static void main(String[] args) {
        
        int x = 5, y = 7;
        int sum = add(x,y);
        double sumDouble = add(3.5, 7.2);
        System.out.println("합계(int): " + sum);
        System.out.println("합게(double): " + sumDouble);

        



    }//main
    // Overload 

    public static int add(int a, int b){

        int result = a + b;
        return result;
    //void 가 아니라 public static int 일 경우 반드시 return값을 반드시 줘야 한다.

    //갯수도 같지만 타입이 다르기 때문에 다른변수로 인식한다. 
    }//int add

    public static double add(double a, double b){
        // double result = a + b;
        // return result;

        return a + b;
        //가독성 **

    }//double add

}//class
