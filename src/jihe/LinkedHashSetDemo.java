package jihe;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 创建4个学生对象
        Student s1=new Student("张三",25);
        Student s2=new Student("李四",25);
        Student s3=new Student("王五",25);
        Student s4=new Student("张三",25);

        // 该结构可以保证数据的存储数据
        LinkedHashSet<Student> students=new LinkedHashSet<>();
        System.out.println(students.add(s1));
        System.out.println(students.add(s2));
        System.out.println(students.add(s3));
        System.out.println(students.add(s4));

        System.out.println(students);
    }
}
