package suanfa;

import java.util.Arrays;

public class XuanZePaiXu {
    public static void main(String[] args) {
        // 选择排序
        int[] arr = {5, 98, 166, 1, 3, 58, 64};
        int s=arr.length;
        int p=0;
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            int min=arr[i];
            for (int j=arr.length-1;j>i;j--){
                if (min>arr[j]){
                    min=arr[j];
                    sum=j;
                }
            }
            int temp=arr[p];
            arr[p]=arr[sum];
            arr[sum]=temp;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
