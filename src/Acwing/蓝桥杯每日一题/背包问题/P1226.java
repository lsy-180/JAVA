package Acwing.蓝桥杯每日一题.背包问题;

import java.util.Scanner;

public class P1226 {
    public static int N=110;
    public static int A=10010;
    public static int[]num=new int[N];
    public static boolean[][]f=new boolean[N][A];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int d=0;
        for (int i = 1; i <=n ; i++) {
            num[i]= scanner.nextInt();
            d=gcd(d,num[i]);
        }
        if (d!=1) System.out.println("INF");
        else {
            f[0][0]=true;
            long count=0;
            for (int i = 1; i <=n ; i++) {
                for (int j = 0; j < A; j++) {
                    f[i][j]=f[i-1][j];
                    if (j>=num[i]) f[i][j] |=f[i][j-num[i]];
                }
            }
            for (int i = 0; i < A; i++) {
                if (!f[n][i]) count++;
            }
            System.out.println(count);
        }

    }
    public static int gcd(int a,int b){
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        while (d!=0){
            int temp=c%d;
            c=d;
            d=temp;
        }
        return c;
    }
}
