package Acwing.蓝桥杯每日一题.前缀和;

import java.util.Scanner;

public class P562 {
    public static int N = 5000010;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int c=T;
        while (T != 0) {
            T--;
            String next = scanner.next();
            int[] sum = new int[next.length() + 1];
            int[] num = new int[next.length() + 1];
            for (int i = 1; i <= next.length(); i++) {
                char a = next.charAt(i - 1);
                num[i] = a - '0';
            }
            for (int i = 1; i < sum.length; i++) {
                sum[i]=sum[i-1]+num[i];
            }
            int count=0;
            int cou=(next.length()+1)/2;
            for (int i = cou; i < sum.length; i++) {
                count=Math.max(count,sum[i]-sum[i-cou]);
            }
            System.out.printf("Case #%d: %d",c-T,count);
            System.out.println();
        }
    }
}
