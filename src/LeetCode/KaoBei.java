package LeetCode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KaoBei {
    public static void main(String[] args) {
        int[]arr1={1,2,3,6,7,9,8,11,35};
        int len=arr1.length;
        int[]arr2=new int[len];
        /*
        * //把arr1数组中的数据拷贝到arr2中
            * 参数一:数据源，要拷贝的数据从哪个数组而来
            * 参数二:从数据源数组中的第几个索引开始拷贝
            * 参数三:目的地，我要把数据拷贝到哪个数组中
            * 参数四:目的地数组的索引。
            * 参数五:拷贝的个数
            * //public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)︰―数组拷贝//细节:
            1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
            * 2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
            3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

        * */
        System.arraycopy(arr1,0,arr2,0,len);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
    }




}
