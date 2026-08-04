package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain_01 {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        map.put("김우진", 85); 
        map.put("이수정", 90); 
        map.put("박진영", 78); 
        map.put("정하나", 50);
        System.out.println("총 Entry 수: " + map.size());
        
        //객체 활용
        System.out.println("\n이수정: " + map.get("이수정"));
        System.out.println();

        Set<String> keySet = map.keySet();

        //Iterator
        Iterator<String> keyIterator= keySet.iterator();

        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key+ ": " +value);
            
        }

        //삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());



    }//main
    
}//class
