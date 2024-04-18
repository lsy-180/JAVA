package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {

        /*
        * List系列集合独有的方法:
        void add(int index,E element)
        在此集合中的指定位置插入指定的元素
        E remove(int index)
        删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)
        修改指定索引处的元素，返回被修改的元素
        E get(int index)
        返回指定索引处的元素
        * */
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        // 添加元素
        list.add("123");
        list.add("wdd");
        list.add("wadscw");

        list.add(1,"99");

        System.out.println(list);
        System.out.println(list.subList(0,2));
        list.set(0,"7"); // 返回值为集合中索引为0的数值。
        System.out.println(list);
        System.out.println(list.get(3));

        list2.addAll(0,list);
        // list集合遍历
        // 迭代器
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------");
        // 增强for
        for (String string : list) {
            System.out.println(string);
        }
        // lambda
        System.out.println("-----------------------------------");
        list.forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------");
        // 列表迭代器 可以边遍历边添加元素
        ListIterator<String> listIterator= list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("-----------------------------------");
        System.out.println(list);
        System.out.println(3/2);
    }
}
