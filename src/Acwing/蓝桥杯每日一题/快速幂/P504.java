package Acwing.蓝桥杯每日一题.快速幂;

import java.util.Scanner;

public class P504 {
    public static int N=1000010;
    public static int[]num=new int[N];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int k= scanner.nextInt();
        int x= scanner.nextInt();
        System.out.println((x+qmi(10,k,n)*m)%n);
    }
    public static long qmi(int a,int b,int p){
        long res=1;
        while (b!=0){
            if ((b%2)==1) res=((long)res*a%p);
            b>>=1;
            a=(int)((long)a * a % p);
        }
        return res;
    }
}
