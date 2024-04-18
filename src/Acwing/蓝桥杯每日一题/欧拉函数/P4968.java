package Acwing.蓝桥杯每日一题.欧拉函数;

import java.util.Scanner;

public class P4968 {
    public static int A=1000000010;
    public static int mod=998244353;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a= scanner.nextLong();
        long b= scanner.nextLong();
        if (a==1){
            System.out.println(0);
        }else {
            long res=a,x=a;
            for (int i=2;i<=x/i;i++){
                if (x%i==0){
                    while (x%i==0) x=x/i;
                    res=res/i*(i-1);
                }
            }
            if (x>1) res=res/x*(x-1);
            System.out.println(res*kuaisumi(a,b-1)%mod);
        }
    }
    public static long kuaisumi(long a,long b){
        long res=1;
        while (b!=0){
            if (b%2==1) res= res*a%mod;
            a=a*a%mod;
            b>>=1;
        }
        return res;
    }
}
