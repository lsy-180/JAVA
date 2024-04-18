package jihe;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("a",123);
        linkedHashMap.put("b",1231);
        linkedHashMap.put("c",1234);
        linkedHashMap.put("d",1235);
        linkedHashMap.put("e",1236);
        System.out.println(linkedHashMap);
    }
}
