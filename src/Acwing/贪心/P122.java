package Acwing.贪心;

import java.util.Arrays;
import java.util.Scanner;

public class P122 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int N=1000010;
        int[]num=new int[N];
        long sum=0;
        for (int i = 1; i <=n; i++) {
            num[i]= scanner.nextInt();
            sum+=num[i];
        }

        long jun_zhi=sum/n;

        long[]c=new long[N];

        for (int i=n;i>1;i--){
            c[i]=c[i+1]+jun_zhi-num[i];
        }
        c[1]=0;
        Arrays.sort(c,1,n+1);
        long end=0;
        for (int i = 1; i <= n; i++) {
            end+=Math.abs(c[i]-c[(n+1)/2]);
        }
        System.out.println(end);
    }
}
