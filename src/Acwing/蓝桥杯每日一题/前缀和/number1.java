package Acwing.蓝桥杯每日一题.前缀和;

import java.util.Scanner;

public class number1 {
    public static int N=100010;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[]num=new int[N];
        for (int i = 1; i <= n; i++) {
            num[i]= scanner.nextInt();
        }
        int[]s=new int[N];
        s[1]=num[1];
        for (int i=2;i<=n;i++){
            s[i]=s[i-1]+num[i];
        }

        while (m!=0){
            int x= scanner.nextInt();
            int y= scanner.nextInt();
            int end=0;
            end=s[y]-s[x-1];
            System.out.println(end);
            m--;
        }
    }
}
