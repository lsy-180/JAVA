package Acwing.DP;

import java.util.Scanner;

public class P1371 {
    public static int V=26;
    public static int n;
    public static int[]num=new int[V];
    public static long[]f=new long[10010];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v= scanner.nextInt();
        n= scanner.nextInt();
        
        for (int i = 1; i <= v; i++) {
            num[i]= scanner.nextInt();
        }
        f[0]=1;
        for (int i = 1; i <=v ; i++) {
            for (int j = 0; j <=n ; j++) {
                if (j>=num[i]) f[j]+=f[j-num[i]];
            }
        }
        System.out.println(f[n]);
    }
}
