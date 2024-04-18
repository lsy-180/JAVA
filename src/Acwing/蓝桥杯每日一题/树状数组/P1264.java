package Acwing.蓝桥杯每日一题.树状数组;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P1264 {
    public static int N = 100010;
    public static int M = 100010;
    public static int[] tr = new int[N];
    public static int n;
    public static int m;
    public static int[]num=new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        tr[1]=num[1];
        for (int i=2;i<=n;i++){
            for (int j=i-lowbit(i)+1;j<=i;j++){
                tr[i]+=num[j];
            }
        }
        while (m != 0) {
            m--;
            int k= scanner.nextInt();
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            if (k==0){
                System.out.println(sum(b)-sum(a-1));
            }else {
                add(a,b);
            }
        }
    }

    public static int lowbit(int x) {
        return x & -x;
    }

    public static void add(int x, int b) {
        for (int i = x; i < N; i += lowbit(i)) {
            tr[i] += b;
        }
    }

    public static int sum(int x) {
        int res = 0;
        for (int i = x; i > 0; i -= lowbit(i)) {
            res += tr[i];
        }
        return res;
    }
}
