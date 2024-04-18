package Acwing.蓝桥杯每日一题.背包问题;

import java.util.Scanner;

public class P2 {
    public static int N = 1010;
    public static int[][] num = new int[N][N];
    public static int[] w = new int[N];
    public static int[] V = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = scanner.nextInt();
        int x = n;
        int p = 1;
        while (n != 0) {
            n--;
            V[p] = scanner.nextInt();
            w[p] = scanner.nextInt();
            p++;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= v; j++) {
                num[i][j] = num[i - 1][j];
                if (j >= V[i]) num[i][j] = Math.max(num[i][j], num[i - 1][j - V[i]] + w[i]);
            }
        }
        System.out.println(num[x][v]);
    }
}
