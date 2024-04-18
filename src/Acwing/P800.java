package Acwing;

import java.util.Scanner;

public class P800 {
    public static void main(String[] args) {

        // 双指针算法
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), x = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }
        for (int i = 0, j = m - 1; i < A.length; i++) {
            while (A[i] + B[j] > x) j--;
            if (A[i] + B[j] == x) {
                System.out.println(i + " " + j);
                break;
            }
        }

    }
}
