package Acwing.蓝桥杯每日一题.分解质因数;

import java.util.Scanner;

public class P3491 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();
        long res=1;
        for (long i=2;i<=n/i;i++){
            if (n%i==0){
                int s=0;
                while (n%i==0){
                    n=n/i;
                    s++;
                }
                if (s%2==1) res*=i;
            }
        }
        if (n>1) res*=n;
        System.out.println(res);
        // 暴力过 6个
//        boolean flag=true;
//        for (long i=1;i<=n;i++){
//            long x=i*n;
//            long c= (long) Math.pow(x,0.5);
//            if (c*c==x){
//                flag=false;
//                System.out.println(i);
//            }
//            if (!flag){
//                break;
//            }
//        }

    }
}
