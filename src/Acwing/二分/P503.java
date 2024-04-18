package Acwing.二分;

import java.util.Scanner;

public class P503 {
    public static int N=1000010;
    public static int n;
    public static int m;
    public static int[] num = new int[N];
    public static int[] d = new int[N];
    public static int[] l = new int[N];
    public static int[] r = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            d[i] = scanner.nextInt();
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        int ls=0,rs=m;
        while (ls<rs){
            int mid=(ls+rs+1)/2;
            if (check(mid)){
                ls=mid;
            }else {
                rs=mid-1;
            }
        }
        if (rs==m){
            System.out.println(0);
        }else {
            System.out.println(-1);
            System.out.println(rs+1);
        }
    }
    public static boolean check(int mid){
        long[] sum = new long[N];
        for (int i=0;i<=mid;i++){
            sum[l[i]]+=d[i];
            sum[r[i]+1]-=d[i];
        }

        for (int i=0;i<=n;i++){
            System.out.printf("%d ",sum[i]);
        }
        System.out.println();
        for (int i=1;i<=n;i++){
            sum[i]+=sum[i-1];
            if (sum[i]>num[i]) return false;
        }
        return true;
    }
}
