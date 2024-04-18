package Acwing.蓝桥杯每日一题.双指针;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P1238 {
    public static int N = 100010;
    public static PII[] piis = new PII[N];
    public static int[] re = new int[N];
    public static boolean[] st = new boolean[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int ts = scanner.nextInt();
            int id = scanner.nextInt();
            piis[i] = new PII(ts, id);
        }
        Arrays.sort(piis, 0, n);

        for (int i = 0, j = 0; i < n; i++) {
            int id = piis[i].id;
            re[id]++;
            while (piis[i].ts - piis[j].ts >= d) {
                re[piis[j].id]--;
                j++;
            }

            if (re[id] >= k) {
                st[id] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            if (st[i]) {
                System.out.println(i);
            }
        }
    }

    static class PII implements Comparable<PII> {
        int ts;
        int id;

        public PII(int ts, int id) {
            this.ts = ts;
            this.id = id;
        }

        @Override
        public int compareTo(PII o) {
            return Integer.compare(ts, o.ts);
        }
    }
}
