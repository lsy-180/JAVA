package Acwing.DP;

import java.util.Scanner;

public class P895 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num = new int[1010];
        int[]f=new int[1010];
        for (int i = 1; i <= N; i++) {
            num[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            f[i] = 1;
            for (int j = 1; j < i; j++) {
                if (num[i]>num[j]){
                    f[i]=Math.max(f[i],f[j]+1);
                }
            }
            count=Math.max(count,f[i]);
        }
        System.out.println(count);
    }
}
