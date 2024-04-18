package jihe;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
         * 需求:请自行选择比较器排序和自然排序两种方式;
         * 要求:存入四个字符串，“c”,“ab”,“df",“qwer”
         * 按照长度排序，如果一样长则按照首字母排序
         * 采取第二种排序规则 ，比较器排序 即自定义
         * */

        // 创建集合
        TreeSet<String> strings = new TreeSet<>((o1,o2)-> {
                // o1为当前要添加的元素 o2为红黑树已经存在的元素
                // 先按照长度排序 后按照默认排序规则进行排序
                return o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length();

        });
        // 添加元素
        strings.add("c");
        strings.add("ab");
        strings.add("df");
        strings.add("qwer");
        System.out.println(strings);
    }
}
