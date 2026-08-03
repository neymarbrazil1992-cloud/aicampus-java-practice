package chapter10.stack;

import java.util.Stack;

public class StackTest_01 {
    public static void main(String[] args) {
        
        Object obj;

        Stack<Object> st = new Stack<>();
        //Stack 최근 것부터 먼저 처리 
        //"맨 위 것만 보거나, 맨 위 것만 빼거나 "

        if (st.empty()) {
            for (int i = 0; i < 3; i++) {
                st.push(new String("Hi" + i));
                System.out.println("입력" + i + " 번째: " + st.peek());//위치 확인

            }

        }//if

        //하나 출력 
        System.out.println();
        System.out.println("현재 출력 위치 데이터: " + st.pop()); //꺼내기
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        System.out.println("현재 출력 위치 데이터: " + st.pop()); //꺼내기
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        st.push(new String("everybody"));
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        st.push(new String("Guten Morgen!"));
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        System.out.println("현재 출력 위치 데이터: " + st.pop()); //꺼내기
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        System.out.println("현재 출력 위치 데이터: " + st.pop()); //꺼내기
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();

        System.out.println("현재 출력 위치 데이터: " + st.pop()); //꺼내기
        System.out.println("현재 Top의 위치(peek): " + st.peek());
        System.out.println();// -> Empty



    }//main
}//class
