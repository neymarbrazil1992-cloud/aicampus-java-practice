package chapter01;

public class longtype_04 {

    public static void main(String[] args) {
        //Long Type
        //int num1=12345678900; //int 4byte =4*8=>32bit
        long num2 =12345678900L;
        long num3 = 1000; // int형 이지만 L또는 I 표시가 없어도 선언이 long 이므로 자동으로 long형으로 변환

        System.out.println(
            (((Object) (num3)).getClass().getName()));

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num2 + num3);

        //-------------------------------
        int level; //선언만 하고 초기화 하지 않음
        level = 10; // 리터별 값

        System.out.println(level);
    }
    
}
