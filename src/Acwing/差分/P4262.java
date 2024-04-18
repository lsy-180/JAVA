package Acwing.差分;

import java.util.Scanner;

public class P4262 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int[]p=new int[N+1];
        int[]t=new int[N+1];
        for (int i = 1; i <= N; i++) {
            p[i]=scanner.nextInt();
        }
        for (int i = 1; i <=N; i++) {
            t[i]=scanner.nextInt();
            p[i]-=t[i];
        }
        for (int i = N; i >=1 ; i--) p[i]-=p[i-1];
        int fushu=0,zhengshu=0;
        for (int i = 1; i <=N; i++) {
            if (p[i]>0) zhengshu+=p[i];
            else fushu-=p[i];
        }
        System.out.println(Math.max(zhengshu,fushu));
    }
}
