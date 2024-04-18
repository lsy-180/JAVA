package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo {
    public static void main(String[] args) {
        // 迭代器三种遍历 迭代器 增强for lambda表达式

        // 创建集合并添加元素

        Collection<String> collection = new ArrayList<>();
        collection.add("abc");
        collection.add("dwd");
        collection.add("d2d2");
        collection.add("bggf");
        collection.add("hgfg");

        // 获取迭代器对象 不依赖索引
        Iterator<String> iterator = collection.iterator();

        // 迭代器遍历 利用循环获取每一个元素，next获取元素并移动指针 最后指针会指向空 不会复位 且遍历时不可用集合的方法增加或删除
        // 可以用迭代器的方法删除 iterator.remove
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
        // 第二次遍历需要重新获取迭代器对象
        // hasnext与next

        // 增强for遍历 string为临时变量
        System.out.println("===========================================");
        for (String string : collection){
            System.out.println(string);
        }

        System.out.println("===========================================");

        // 匿名内部类
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // lambda 表达式
        collection.forEach(s -> System.out.println(s));
        collection.forEach(System.out::println);
    }
}
