package student_final;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class studentMain_00 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sprang","Sommer","Herbst","Winter","Hund","Katze");
       
        Stream<String> stream = list.stream();
        stream.sorted().forEach(System.out::println);

        System.out.println();
        System.out.println("S or s가 들어간 이름 출력");
        list.stream().filter(s -> s.toUpperCase().contains("S")).forEach(System.out::println);

        System.out.println();
        System.out.println("이름길이가 6자 이상인 이름 출력");
        list.stream().filter(s -> s.length() >= 6).forEach(System.out::println);

        System.out.println("------------------------------");

        int arr[] = {13,53,84,15,46,87,99,30};

        System.out.println("오름차순 정렬 후 출력");
        Arrays.stream(arr).sorted().forEach((i) -> System.out.print(i + " "));
        System.out.println();

        System.out.println("짝수 출력");
        Arrays.stream(arr).filter(i -> i % 2 == 0).forEach((i) -> System.out.println(i + " "));
        System.out.println();

        System.out.println("홀수 출력");
        Arrays.stream(arr).filter(i -> i % 2 == 1).forEach((i) -> System.err.println(i + " "));
        System.out.println();

        System.out.println("2의 배수도 아니고, 3의 배수도 아닌 숫자 출력");
        Arrays.stream(arr).filter(i -> i % 2 != 0 && i % 3 != 0).forEach((i) -> System.out.print(i + " "));
        
    }//main
}//class
