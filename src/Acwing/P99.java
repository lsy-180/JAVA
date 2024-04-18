package Acwing;

import java.util.Scanner;

public class P99 {
    public static void main(String[] args) {
        int S = 5010;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), R = scanner.nextInt();
        if (R>5000){
            R=5001;
        }
        int n = R, m = R;
        int[][] num = new int[S][S];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x = x + 1;
            y = y + 1;
            n = Math.max(n, x);
            m = Math.max(m, y);
            num[x][y] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                num[i][j] += num[i - 1][j] + num[i][j - 1] - num[i - 1][j - 1];
            }
        }
        int count = 0;
        for (int i = R; i <= n; i++) {
            for (int j = R; j <= m; j++) {
                count = Math.max(count, num[i][j] - num[i - R][j] - num[i][j - R] + num[i - R][j - R]);
            }
        }
        System.out.println(count);
    }
}
