package Acwing.蓝桥杯每日一题.递归;


import java.util.Arrays;
import java.util.Scanner;

public class P1209 {
    public static int N=20;
    public static int count = 0;
    public static int n;
    public static boolean[] num = new boolean[N];
    public static boolean[] back = new boolean[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs_a(0, 0);
        System.out.println(count);
    }

    public static boolean check(int a, int c) {
        int b = n * c - a * c;
        if (b == 0 || a == 0 || c == 0||b<0) return false;
        back = Arrays.copyOf(num, num.length);

        while (b != 0) {
            int x = b % 10;
            b = b / 10;
            if (x == 0 || back[x]) return false;
            back[x] = true;
        }
        for (int i = 1; i <= 9; i++) {
            if (!back[i]) {
                return false;
            }
        }
        return true;
    }

    public static void dfs_c(int u, int a, int c) {
        if (u == n) {
            return;
        }
        if (check(a, c)) {
            count++;
        }
        for (int i = 1; i <= 9; i++) {
            if (!num[i]) {
                num[i] = true;
                dfs_c(u + 1, a, c * 10 + i);
                num[i] = false;
            }
        }
    }

    public static void dfs_a(int u, int a) { // u表示当前是第几个数字，a就是a
        if (a >= n){
            return;
        }
        if (a>0){
            dfs_c(u, a, 0);
        }
        for (int i = 1; i <= 9; i++) {
            if (!num[i]) {
                num[i] = true;
                dfs_a(u + 1, a * 10 + i);
                num[i] = false;
            }
        }
    }
}
