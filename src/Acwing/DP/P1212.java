package Acwing.DP;

import java.util.Scanner;

public class P1212 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
        int N = 55;
        int mod=1000000007;
        int[][] w = new int[N][N];
        int[][][][] num = new int[N][N][13][14];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                w[i][j]= scanner.nextInt();
                w[i][j]++;
            }
        }
        num[1][1][1][w[1][1]]=1;
        num[1][1][0][0]=1;
        // i j为对应坐标，u为取了多少件物品，v为物品的价值
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i==1&&j==1) continue;
                for (int u = 0; u <= k; u++) {
                    for (int v = 0; v <=13 ; v++) {
                        num[i][j][u][v]=(num[i][j][u][v]+num[i-1][j][u][v])%mod;
                        num[i][j][u][v]=(num[i][j][u][v]+num[i][j-1][u][v])%mod;
                        if (u>0&&v==w[i][j]){
                            for (int l = 0; l < v; l++) {
                                num[i][j][u][v]=(num[i][j][u][v]+num[i-1][j][u-1][l])%mod;
                                num[i][j][u][v]=(num[i][j][u][v]+num[i][j-1][u-1][l])%mod;
                            }
                        }

                    }

                }
            }
        }
        int end=0;
        for (int i = 0; i <=13; i++) {
            end=(end+ num[n][m][k][i])%mod;
        }
        System.out.println(end);
    }
}
