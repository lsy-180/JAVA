package Acwing;

import java.util.Scanner;

public class P795 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] ints = new int[n+1];
        for (int i = 1; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        int[][] num = new int[m][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0] = scanner.nextInt();
            num[i][1] = scanner.nextInt();
        }
        int[] sum = new int[n+1];
        for (int i = 1; i < sum.length; i++) {
            sum[i]=sum[i-1]+ints[i];
        }
//        // 超时写法 错误
//        for (int i = 0; i < num.length; i++) {
//            int count = 0;
//            for (int j = num[i][0] - 1; j <= num[i][1] - 1; j++) {
//                count += ints[j];
//            }
//            System.out.println(count);
//        }
        // 前缀和正确写法
        for (int i = 0; i < num.length; i++) {
            System.out.println(sum[num[i][1]]-sum[num[i][0]-1]);
        }
    }
}
