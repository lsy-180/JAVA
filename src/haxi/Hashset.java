package haxi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        // 可以对元素进行去重处理
        Set<String> stringSet=new HashSet<>();
        // 相同的元素添加两次 只有一次会成功
        stringSet.add("23232d2");
        stringSet.add("23dxx");
        stringSet.add("15665");
        // 无序
        System.out.println(stringSet);
        for (String string : stringSet) {
            System.out.println(string);
        }
        System.out.println(Arrays.toString(stringSet.toArray()));
    }
}
