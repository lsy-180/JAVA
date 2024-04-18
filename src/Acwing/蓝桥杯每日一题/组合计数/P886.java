package Acwing.蓝桥杯每日一题.组合计数;

import java.util.*;
public class P886{
    static int mod=(int)1e9+7;
    public static void main(String args[]){
        //C(b,a)=a!/b!/(a-b)!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fac[]=new long[100005],infac[]=new long[100005];
        fac[0]=infac[0]=1;
        for(int i=1;i<=100000;i++){
            fac[i]=fac[i-1]*i%mod;
            infac[i]=find(fac[i],mod-2);
        }
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println(fac[a] * infac[b] %mod*infac[a-b]%mod);
        }
    }
    static long find(long a,int b){
        //a^b%mod
        long ans=1;
        while(b!=0){
            if(b%2==1){
                ans=ans*a%mod;
            }
            b>>=1;
            a=a*a%mod;
        }
        return ans;
    }
}

