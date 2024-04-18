package Acwing;

import java.util.Scanner;

// 激光炸弹 前缀和
public class P1230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();
        int[] num = new int[N + 1];
        int[] len = new int[100010];
        for (int i = 1; i <= N; i++) {
            num[i] = scanner.nextInt();
        }
        long[] sum = new long[N + 1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + num[i];
        }
        long count=0;
        len[0]=1;
        for (int i = 1; i <= N; i++) {
            int x= (int) (sum[i]%K);
            count+=len[x];
            len[x]++;
        }
        System.out.printf("%d",count);
        System.exit(0);
    }
}
