package Acwing.树状数组;

import java.io.*;
import java.util.Scanner;

public class P1265 {
    public static int n = 32010;
    public static int[] tr = new int[n];

    public static void main(String[] args) throws IOException {
        // java的快速输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int N =Integer.parseInt(bufferedReader.readLine().trim());
        int[] num = new int[N + 1];
        for (int i = 0; i < N; i++) {
            String s1[] = bufferedReader.readLine().split(" ");
            int x = Integer.parseInt(s1[0]) + 1;
            int y = Integer.parseInt(s1[1]);
            x++;
            num[sum(x)]++;
            add(x);
        }
        for (int i = 0; i < N; i++) {
            out.print(num[i] + "\n");
        }
        out.flush();
    }

    public static int lowbit(int x) {
        return x & -x;
    }

    public static void add(int x) {
        for (int i = x; i <= n; i += lowbit(i)) {
            tr[i]++;
        }
    }

    public static int sum(int x) {
        int count = 0;
        for (int i = x; i > 0; i -= lowbit(i)) {
            count += tr[i];
        }
        return count;
    }
}
