package chuanzhi;

import java.util.Scanner;

public class P8870 {
    public static void main(String[] args) {
        int[] a = new int[200005];
        int[] b = new int[200005];
        int[] c = new int[200005];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int maxLength = Math.max(n, m);
        for (int i = (maxLength - n) + 1; i <= maxLength; ++i)
            a[i] = scanner.nextInt();
        for (int i = (maxLength - m) + 1; i <= maxLength; ++i)
            b[i] = scanner.nextInt();
        for (int i = maxLength, cnt = 2; i > 0; --i, ++cnt) {
            c[i] += a[i] + b[i];
            if (c[i] >= cnt) {
                c[i] -= cnt;
                c[i - 1] += 1;
            }
        }
        if (c[0] > 0) {
            System.out.printf("%d ", c[0]);
        }
        for (int i = 1; i <= maxLength; ++i) {
            System.out.printf("%d ", c[i]);
        }
        System.out.println();

    }
}
