package jihe;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {

        /*
        * public static <T> void sort(List<T> list)
        排序
        public static <T> void sort(List<T> list，comparator<T> c)
        根据指定的规则进行排序
        public static <T> int binarySearch (List<T> list，T key)
        以二分查找法查找元素
        public static <T> void copy(List<T> dest，List<T> src)
        拷贝集合中的元素
        public static <T> int fill (List<T> list,T obj)
        使用指定的元素填充集合
        public static <T> void max/min(collection<T> coll)
        根据默认的自然排序获取最大/小值
        public static <T> void swap(List<? > list, int i, int j)
        交换集合中指定位置的元素

        * */
        // 创建集合

        ArrayList<String> strings=new ArrayList<>();

        ArrayList<Integer> arrayList=new ArrayList<>();

        // 批量添加元素

        Collections.addAll(strings,"wdwdw","wd1","w1156");
        Collections.addAll(arrayList,123,896,78951,2321);
        System.out.println(strings);
        // 打乱顺序
        Collections.shuffle(strings);
        System.out.println(strings);
        System.out.println(arrayList);
        // 用二分查找查找集合中的元素
        Collections.sort(arrayList);
        // 用于集合内数据排序
        System.out.println(arrayList);

        System.out.println(Collections.binarySearch(arrayList,78951));

    }
}
