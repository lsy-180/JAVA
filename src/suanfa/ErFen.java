package suanfa;

import java.util.Arrays;
// 二分查找
public class ErFen {
    public static void main(String[] args) {
        int[] arr = {581, 93, 148, 1, 26, 89, 12};
        Arrays.sort(arr);
        int x = binar(arr, 581);
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
    }

    public static int binar(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            if (number > arr[mid]) {
                min = mid + 1;
            } else if (number < arr[mid]) {
                max = mid - 1;
            } else if (number == arr[mid]) {
                return mid;
            }
            if (max < min) {
                break;
            }
        }
        return -1;
    }

}
