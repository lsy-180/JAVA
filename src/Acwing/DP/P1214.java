package Acwing.DP;

import java.util.Scanner;


/*
optimjie的题解 用同余定理
 */
public class P1214 {
    public static void main(String[] args) {
        int N = 1010;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), s = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        int[][] f = new int[N][N];
        f[0][0] = 1;
        int mod = 100000007;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                f[i][j] = (f[i - 1][getMod(j - (n - i) * a, n)] + f[i - 1][getMod(j + (n - i) * b, n)]) % mod;
            }
        }
        System.out.println(f[n - 1][getMod(s, n)]);
    }

    public static int getMod(int a, int b) {
        return (a % b + b) % b;
    }
}
