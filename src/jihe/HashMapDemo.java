package jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Student,String> hashMap=new HashMap<>();

        Student s1=new Student("张三",25);
        Student s2=new Student("李四",26);
        Student s3=new Student("王五",27);
        Student s4=new Student("吴芸娜",28);

        hashMap.put(s1,"江苏");
        hashMap.put(s2,"浙江");
        hashMap.put(s3,"广东");
        hashMap.put(s4,"江西");
        System.out.println(hashMap);
        hashMap.forEach((key,value)-> System.out.println(key+"="+value));
        System.out.println("-------------------------------");

        Set<Student> studentSet=hashMap.keySet();
        for (Student student : studentSet) {
            String value=hashMap.get(student);
            System.out.println(student+"="+value);
        }

        System.out.println("-------------------------------");
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }
}
