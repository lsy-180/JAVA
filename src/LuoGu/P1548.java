package LuoGu;

import java.util.Scanner;

public class P1548 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int sum=0,N=0,M=0,S=0;
        for (int i = 1; i <= Math.min(n,m); i++) {
            sum+=(n-i+1)*(m-i+1);
        }
        for (int i = 1; i <= n; i++) {
            N+=i;
        }
        for (int i = 1; i <= m; i++) {
            M+=i;
        }
        S=N*M-sum;
        System.out.printf("%d %d",sum,S);
    }
}
