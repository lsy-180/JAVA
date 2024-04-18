package Acwing.蓝桥杯每日一题.背包问题;

import java.util.Scanner;

public class P3417 {
    // W为偏移量 因为数组没有负索引
    public static int N = 110;
    public static int W = 100010;
    public static boolean[][] f = new boolean[N][200020];
    public static int[] num = new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        f[0][W] = true;
        for (int i = 1; i <= n; i++) {
            f[1][num[i]] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = -sum; j <= sum; j++) {
                f[i][j+W] = f[i - 1][j+W];
                if (j - num[i] >= -sum) f[i][j+W] |= f[i - 1][j - num[i]+W];
                if (j + num[i] <= sum) f[i][j+W] |= f[i - 1][j + num[i]+W];
            }
        }
        long count=0;
        for (int j=1;j<=sum;j++){
            if (f[n][j+W]) count++;
        }
        System.out.println(count);
    }
}
