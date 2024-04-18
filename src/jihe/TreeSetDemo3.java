package jihe;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<Student2> student2TreeSet=new TreeSet<>();
        Student2 student2=new Student2("zhangsan",23,90,99,50);
        Student2 student3=new Student2("lisi",24,90,98,50);
        Student2 student4=new Student2("wangwu",25,95,100,30);
        Student2 student5=new Student2("zhaoliu",26,60,99,70);
        Student2 student6=new Student2("qianqi",26,70,80,70);
        // 使用比较器排序
        student2TreeSet.add(student2);
        student2TreeSet.add(student3);
        student2TreeSet.add(student4);
        student2TreeSet.add(student5);
        student2TreeSet.add(student6);

        for (Student2 student21 : student2TreeSet) {
            System.out.println(student21);
        }
    }
}
