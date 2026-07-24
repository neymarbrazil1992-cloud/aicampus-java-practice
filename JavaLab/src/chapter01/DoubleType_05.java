package chapter01;

public class DoubleType_05 {
    public static void main(String[] args) {
        
        // 실수 float(4byte) -> double(8byte)

        float fNum = 3.14f; // 4byte
        double dNum = 3.14; // 8 byte

        // float result1= fNum+ dNum; //dNum이 double이기 때문에 float에 담을수 없음
        double result2= fNum+ dNum;

        System.out.println(
            ((Object)(dNum)).getClass().getName()
        );
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(result2);
        System.out.println("-------------------------------");

        int aVal=10;
        float bVal=10.5f; //4byte

        // int result3 = aVal + bVal; //Error -> 정밀도가 높은 float는 담을수 없음 
        float result4 = aVal +bVal;

        System.out.println(result4);
    }
}
