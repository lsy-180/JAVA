package Acwing.蓝桥杯每日一题.欧拉函数;

import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P3999 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int T= scanner.nextInt();
        while (T!=0){
            T--;
            long a= scanner.nextLong();
            long m= scanner.nextLong();
            long s=zui_da_gong_yue_shu(a,m);
            System.out.println(oula(m/s));

        }
    }
    public static long zui_da_gong_yue_shu(long a,long m){
        long c=Math.max(a,m);
        long d=Math.min(a,m);
        while (d!=0){
            long temp=c%d;
            c=d;
            d=temp;
        }
        return c;
    }
    public static long oula(long a){
        long res=a;
        for (int i=2;i<=a/i;i++){
            if (a%i==0){
                while (a%i==0) a=a/i;
                res=res/i*(i-1);
            }
        }
        if (a>1) res=res/a*(a-1);
        return res;

    }
}
