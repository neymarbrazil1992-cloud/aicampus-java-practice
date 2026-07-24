package chapter02;

public class Examples_02 {
    public static void main(String[] args) {
        
        int pear = 5;
        int apple = 7;
        int orange = 5;

        System.out.println("하루에 생산되는 총 과일의 갯수" +(pear + apple+ orange) + "개");
        System.out.println("시간당 전체 과일의 평균 생산 갯수" + ((float) (pear + apple + orange) / 24) "개";
    }
}
