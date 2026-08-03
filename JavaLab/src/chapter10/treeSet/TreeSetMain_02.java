package chapter10.treeSet;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetMain_02 {
    public static void main(String[] args) {
        
        Set<String> treeSet = new TreeSet<>();
        //요소 추가
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Apple");
        
        //중복방지 '도' 됨
        treeSet.add("Apple");

        System.out.println("TreeSet: " + treeSet);

        if (treeSet.contains("Banana")) {
			System.out.println("Banana is in the treeSet");
		}

        //요소 삭제 
        treeSet.remove("Apple");
        System.out.println("AfterRemove: " + treeSet);



    }   //main 
}//class

