package Acwing.蓝桥杯每日一题.快速幂;

import java.util.Scanner;

public class P875 {
    public static int N=100010;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int p= scanner.nextInt();
            System.out.println(qmi(a,b,p));
        }

    }
    // 快速幂 转换为a的2*2的几次方的形式 解决
    public static int qmi(int a,int b,int p){
        int res=1;
        while (b!=0){
            if ((b%2)==1) res=(int)((long)res*a%p);
            b>>=1;
            a=(int)((long)a * a % p);
        }
        return res;
    }
}
