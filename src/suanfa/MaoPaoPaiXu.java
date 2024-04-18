package suanfa;

import java.util.Arrays;

public class MaoPaoPaiXu {
    public static void main(String[] args) {
        // 冒泡排序 时间复杂度是n*2
        int[] arr = {5, 98, 166, 1, 3, 58, 64};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
