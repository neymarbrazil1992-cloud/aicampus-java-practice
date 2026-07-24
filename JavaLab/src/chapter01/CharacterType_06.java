package chapter01;

public class CharacterType_06 {
   
    // Character(문자) Type(char)
		// Java, C# -> 2byte(16bit) -> UTF-16
		// C, C++ -> 1byte(8bit) -> UTF-8
    public static void main(String[] args) {

        char ch1 = '한'; //'를 써여한다
        char ch2 = '\ud55c'; //전세계 모든 문자를 다루도록 설계
        char str1='A'; //단일 문자
        
	    System.out.println("str1 "+ str1);
        System.out.println("ch1" + ch1);
        System.out.println("ch2:" + ch2);
        
        //객체
        String str2 = "Hello Java"; //""를 써야한다
        String obj1 =new String();
    
        
        System.out.println("str2 " + str2);

        String str3 = "W";
        System.out.println("str3:" + str3);
        System.out.println("---------------");

        // a:65, a: 97 => ASCII 코드 
        int a = 97;
        System.out.println(a);
        System.out.println("사칙연산: " + (a + 10));
        System.out.println("------------------");
        System.out.println((char)a); //ASCII 코드 영향
        System.out.println((char)(a+1));

    

        //String . Class -> Data Heap Stack 앞이 대문자 
        //heap 안에 New-
    
    }
}
