package Acwing.蓝桥杯每日一题.树状数组;

import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1265 {
    public static int N = 32010;
    public static int[] ad = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = scanner.nextInt();
        int[]num=new int[n+1];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt()+1;
            int y = scanner.nextInt();
            x++;
            num[sum(x)]++;
            add(x);
        }
        for (int i=0;i<n;i++){
            out.print(num[i] + "\n");
        }
        out.flush();
    }

    public static int lowbit(int x) {
        return x & -x;
    }
    public static void add(int x){
        for (int i=x;i<=N;i+=lowbit(i)){
            ad[i]++;
        }
    }
    public static int sum(int x){
        int res=0;
        for (int i=x;i>0;i-=lowbit(i)){
            res+=ad[i];
        }
        return res;
    }
}
