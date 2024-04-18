package Acwing.蓝桥杯每日一题.公约数;

import java.util.Arrays;
import java.util.Scanner;

public class P1246 {
    public static int b=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[]num=new int[n+1];
        for (int i = 1; i <= n; i++) {
            num[i]= scanner.nextInt();
        }
        Arrays.sort(num,1,n+1);
        int da=zuidagongyueshu(num[1],num[n]);
        for (int i=1;i<n;i++){
            int t=num[i+1]-num[i];
            b=zuidagongyueshu(b,t);
        }
        if (num[n]==num[1]){
            System.out.println(n);
        }else {
            System.out.println((num[n]-num[1])/b+1);
        }
    }
    public static int zuidagongyueshu(int a,int b){
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        while (d!=0){
            int temp=c%d;
            c=d;
            d=temp;
        }
        return c;
    }
}
