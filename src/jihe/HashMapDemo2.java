package jihe;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            arrayList.add(arr[index]);
        }

        HashMap<String, Integer> hashMap=new HashMap<>();
        for (String string : arrayList) {
            if (hashMap.containsKey(string)){
                int count= hashMap.get(string);
                count++;
                hashMap.put(string,count);
            }else {
                hashMap.put(string,1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        int max=0;
        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if (count>max){
                max=count;
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if (count==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
