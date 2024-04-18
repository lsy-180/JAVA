package heima;

import java.util.Arrays;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        return Arrays.toString(arr);
    }

    public static double getaverage(double[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

}
