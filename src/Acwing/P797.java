package Acwing;

import java.util.Scanner;

public class P797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] num = new int[n + 1];
        for (int i = 1; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int[] b = new int[n + 2];
        for (int i = 1; i < b.length-1; i++) {
            if (i == 1) {
                b[i] = num[i];
            }
            else {
                b[i] = num[i] - num[i - 1];
            }
        }

        while (m != 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[l]+=c;
            b[r+1]-=c;
            m--;
        }
        for (int i = 2; i < b.length-1; i++) {
            b[i]+=b[i-1];
        }
        for (int i = 1; i < b.length-1; i++) {
            System.out.printf("%d ", b[i]);
        }
    }
}
