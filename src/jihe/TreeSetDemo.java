package jihe;

import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 利用treeset存储整数并排序
        // int double 无索引，不可重复，自动排序 默认从小到大 按照红黑树的规则排序 即底层是红黑树
        // 对于字符，字符串类型按照ASCII码表中数字升序进行排序。如果有一个字母确定了大小关系则后面不再进行比较
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(4);
        treeSet.add(20);
        treeSet.add(1);
        treeSet.add(35);
        treeSet.add(5);
        System.out.println(treeSet);

        // 增强for循环
        for (Integer i : treeSet) {
            System.out.println(i);
        }

        treeSet.forEach(integer -> System.out.println(integer));

        treeSet.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // 方法引用
        treeSet.forEach(System.out::println);
        Student s1=new Student("zs",66);
        Student s2=new Student("ls",18);
        Student s3=new Student("ww",45);
        Student s4=new Student("wyn",12);
        TreeSet<Student> treeSet2=new TreeSet<>();
        // 需要自定义排序规则
        treeSet2.add(s1);
        treeSet2.add(s2);
        treeSet2.add(s3);
        treeSet2.add(s4);
        System.out.println(treeSet2);


    }
}
