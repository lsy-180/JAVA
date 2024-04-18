package Acwing.数论;

import java.util.Scanner;

public class P1211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        int count = 1;
        if (num[1] > 0) {
            for (int i = 2; i <= n; i++) {
                if (num[i] < 0 && Math.abs(num[i]) > num[1]) {
                    count++;
                }
            }
            if (count > 1) {
                for (int i = 2; i <= n; i++) {
                    if (num[i] > 0 && num[i]<num[1]) {
                        count++;
                    }
                }
            }
        }else {
            for (int i = 2; i <= n; i++) {
                if (num[i] >0 && num[i]<Math.abs(num[1])) {
                    count++;
                }
            }
            if (count > 1) {
                for (int i = 2; i <= n; i++) {
                    if (num[i] < 0 && Math.abs(num[i]) > Math.abs(num[1])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
