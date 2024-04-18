package Acwing.蓝桥杯每日一题.公约数;

import java.util.Arrays;
import java.util.Scanner;

public class P4199 {
    public static int[] num = new int[100000000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int q = scanner.nextInt();
        int da = zuidagongyueshu(a, b);
        int p = 1;
        for (int i = 1; i <= da / i; i++) {
            if (da % i == 0) {
                num[p++] = i;
                if (i * i != da) {
                    num[p++]=da/i;
                }

            }
        }
        Arrays.sort(num,1,p);

        while (q != 0) {
            q--;
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int end = -1;
                if (da <= r && da >= l) {
                    System.out.println(da);
                } else {
                    int le = 1;
                    int ri = p;
                    while (le < ri) {
                        int mid = (le + ri + 1) / 2;
                        if (num[mid] <= r) {
                            le = mid;
                        } else {
                            ri = mid - 1;
                        }
                    }
                    end = num[ri];
                    if (end >= l && end <= r) {
                        System.out.println(end);
                    } else {
                        System.out.println(-1);
                    }

            }

        }
    }

    public static int zuidagongyueshu(int a, int b) {
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        while (d != 0) {
            int temp = c % d;
            c = d;
            d = temp;
        }
        return c;
    }
}
