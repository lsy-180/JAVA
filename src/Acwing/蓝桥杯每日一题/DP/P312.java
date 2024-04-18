package Acwing.蓝桥杯每日一题.DP;

import java.util.Scanner;

public class P312 {
    public static int N = 360;
    public static int M = 42;
    public static int[] num = new int[N];
    public static int[] b = new int[5];
    public static int[][][][] f = new int[M][M][M][M];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            b[x]++;
        }

        f[0][0][0][0] = num[1];
        for (int A = 0; A <= b[1]; A++) {
            for (int B = 0; B <= b[2]; B++) {
                for (int C = 0; C <= b[3]; C++) {
                    for (int D = 0; D <= b[4]; D++) {
                        int score = num[1 + A + B * 2 + C * 3 + D * 4];
                        if (A != 0) f[A][B][C][D] = Math.max(f[A][B][C][D], f[A - 1][B][C][D] + score);
                        if (B != 0) f[A][B][C][D] = Math.max(f[A][B][C][D], f[A][B - 1][C][D] + score);
                        if (C != 0) f[A][B][C][D] = Math.max(f[A][B][C][D], f[A][B][C - 1][D] + score);
                        if (D != 0) f[A][B][C][D] = Math.max(f[A][B][C][D], f[A][B][C][D - 1] + score);
                    }
                }
            }
        }
        System.out.println(f[b[1]][b[2]][b[3]][b[4]]);
    }
}
