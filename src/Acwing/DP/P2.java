package Acwing.DP;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), V = scanner.nextInt();
        int P=1010;
        int[][]f=new int[P][P];
        int[]yiwei=new int[P];
        int[]v=new int[N+1];
        int[]w=new int[N+1];
        for (int i=1;i<=N;i++){
            v[i]=scanner.nextInt();
            w[i]= scanner.nextInt();
        }
        // 二维写法
        for (int i = 1; i <=N ; i++) {
            for (int j = 0; j <= V; j++) {
                f[i][j]=f[i-1][j];
                if (j>=v[i]) f[i][j]=Math.max(f[i][j],f[i-1][j-v[i]]+w[i]);
            }
        }
        for (int i = 1; i <=N ; i++) {
            for (int j=V;j>=v[i];j--){
                yiwei[j]=Math.max(yiwei[j],yiwei[j-v[i]]+w[i]);
            }
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = 0; j <= V; j++) {
                System.out.println(f[i][j]);
            }
        }
        System.out.println(yiwei[V]);
        System.out.println(f[N][V]);
    }
}
