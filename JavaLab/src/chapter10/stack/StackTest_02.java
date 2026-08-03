package chapter10.stack;

import java.util.ArrayList;

class MyStack{
    
    private ArrayList<String> arrayStack = new ArrayList<>();
    
    //메서드 
    public void push(String data){
        arrayStack.add(data);

    } //입력

    @Override
    public String toString() {
        return "MyStack [arrayStack=" + arrayStack + "]";
    }

    public String pop() {
        int len = arrayStack.size();

        if (len == 0) {
            System.out.println("스택이 비어 있습니다");
            return null;
        }
        return (arrayStack.remove(len - 1));
    }

    

}


public class StackTest_02 {
   
    
    public static void main(String[] args) {
        
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("c");

        //arrayStack
        System.out.println(stack);

        //pop()
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //출력 데이터 없음
        System.out.println(stack.toString());




    }//main
}//class
