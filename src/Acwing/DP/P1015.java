package Acwing.DP;

import java.util.Scanner;

public class P1015 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        int[][]num=new int[101][101];
        int[][]f=new int[101][101];
        while (T!=0){
            T--;
            int W=scanner.nextInt(),H=scanner.nextInt();
            for (int i = 1; i <= W; i++) {
                for (int j = 1; j <= H; j++) {
                    num[i][j]=scanner.nextInt();
                }
            }
            for (int i = 1; i <= W; i++) {
                for (int j = 1; j <= H; j++) {
                    f[i][j]=Math.max(f[i-1][j]+num[i][j],f[i][j-1]+num[i][j]);
                }
            }
            System.out.println(f[W][H]);
        }
    }
}
