package Acwing.蓝桥杯每日一题.分解质因数;

import java.util.Scanner;

public class P4658 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();
        System.out.println(zhiyinshu(n));
    }
    public static int zhiyinshu(long n){
        int res=0;
        for (int i=2;i<n/i;i++){
            if (n%i==0){
                while (n%i==0) n=n/i;
                res++;
            }
        }
        if (n>1) res++;
        return res;
    }
}
