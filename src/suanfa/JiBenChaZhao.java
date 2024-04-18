package suanfa;

import java.util.ArrayList;

public class JiBenChaZhao {
    public static void main(String[] args) {
        int[]arr={131,127,81,103,123,131,131};
        int num=131;
        System.out.println(Search(arr,num));
        System.out.println(SearchRe(arr,num));
        System.out.println(SearchI(arr,num));
    }

    // 查找元素在数组中是否存在
    public static boolean Search(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            int s=arr[i];
            if (number==s){
                return true;
            }
        }
        return false;
    }

    // 找到元素在数组中的索引 不考虑重复
    public static int SearchI(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            int s=arr[i];
            if (number==s){
                return i;
            }
        }
        return -1;
    }
    // 找到元素在数组中的索引 考虑重复
    public static ArrayList<Integer> SearchRe(int[] arr, int number) {
        // 返回索引值
        ArrayList<Integer> list=new ArrayList<>();
        int [] arrs=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int s=arr[i];
            if (number==s){
                list.add(i);
            }
        }
        return list;
    }
}
