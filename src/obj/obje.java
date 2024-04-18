package obj;

import java.util.Objects;

public class obje {
    public static void main(String[] args) {
        /*
        * public string toString() 返回对象的字符串表示形式
        public boolean equals(object obj) 比较两个对象是否相等
        protected object clone(int a) 对象克隆
*/
        Student student = new Student("lsy", 23, "nan");
        Student student2 = new Student("lsy", 23, "nan");
        System.out.println(student.equals(student2));
//
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));
        // false//因为equals方法是被s调用的，而s是字符串
        //所以equals要看string类中的
        //字符串中的equals方法，先判断参数是否为字符串//如果是字符串，再比较内部的属性
        //但是如果参数不是字符串，直接返回false

        System.out.println(sb.equals(s));// false
        //因为equals方法是被sb调用的，而sb是stringBuilder
        // 所以这里的equals方法要看stringBuilder中的equals方法
        // 那么在StringBuilder当中，没有重写equals方法
        //使用的是object中的
        //在object当中默认是使用==号比较两个对象的地址值
        //而这里的s和sb记录的地址值是不一样的，所以结果返回false

        System.out.println(s.equals(sb.toString()));
        // 判断两个对象是否相等 先判断前者是否为空 为空直接false 之后相当于前者调用equals方法
        System.out.println(Objects.equals(student2, student));
        // 判断对象是否为null 是空返回false 不为空返回true
        System.out.println(Objects.isNull(s));
    }
}
