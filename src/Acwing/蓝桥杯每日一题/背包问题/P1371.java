package Acwing.蓝桥杯每日一题.背包问题;

import java.util.Scanner;

public class P1371 {
    public static int N = 10010;
    public static int V = 26;
    public static int[] num = new int[V];
    public static long[] f = new long[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int x = v;
        int p = 1;
        while (x != 0) {
            x--;
            num[p] = scanner.nextInt();
            p++;
        }
        f[0]=1;
        for (int i = 1; i <= v; i++) {
            for (int j = 0; j <= n; j++) {
                if (j>=num[i]) f[j]+=f[j-num[i]];
            }
        }
        System.out.println(f[n]);
    }
}
