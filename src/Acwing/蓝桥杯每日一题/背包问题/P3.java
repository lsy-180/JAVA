package Acwing.蓝桥杯每日一题.背包问题;

import java.util.Scanner;

public class P3 {
    public static int N = 1010;
    public static int[] v = new int[N];
    public static int[] w = new int[N];
    public static int[][] num = new int[N][N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int V = scanner.nextInt();
        int x = n;
        int p = 1;
        while (x != 0) {
            x--;
            v[p] = scanner.nextInt();
            w[p] = scanner.nextInt();
            p++;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= V; j++) {
                num[i][j] = num[i - 1][j];
                if (j >= v[i]) num[i][j] = Math.max(num[i][j], num[i][j - v[i]] + w[i]);
            }
        }
        System.out.println(num[n][V]);
    }
}
