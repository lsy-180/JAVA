package Acwing;

import java.util.Scanner;

/// 前缀和数组
public class  P796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), q = scanner.nextInt();
        int[][] num = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        int[][] nex = new int[q][4];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 4; j++) {
                nex[i][j] = scanner.nextInt();
            }
        }
        int[][] sum = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+num[i][j];
            }
        }
        for (int i = 0; i < q; i++) {
            int count=0;
            count+=sum[nex[i][2]][nex[i][3]]-sum[nex[i][2]][nex[i][1]-1]-sum[nex[i][0]-1][nex[i][3]]+sum[nex[i][0]-1][nex[i][1]-1];
            System.out.println(count);
        }
    }
}
