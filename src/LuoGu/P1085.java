package LuoGu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[7][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0] = scanner.nextInt();
            num[i][1] = scanner.nextInt();
        }
        int[] sum = new int[7];
        for (int i = 0; i < num.length; i++) {
            sum[i] = num[i][0] + num[i][1];
        }
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(Arrays.toString(sum));
        boolean flag = true;
        int[] day = new int[7];
        int max = 0;
        int j = 0;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] > 8) {
                flag = false;
                if (sum[i] >= max) {
                    max = sum[i];
                    j = i;
                }
            }
        }
        if (flag) {
            System.out.println(0);
        } else {
            System.out.println(j + 1);
        }
    }
}
