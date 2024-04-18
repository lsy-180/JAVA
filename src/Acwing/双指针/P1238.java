package Acwing.双指针;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P1238 {
    public static int n = 100010;
    public static int[] cnt = new int[n];
    public static boolean[] st = new boolean[n];
    static PII[] logs = new PII[n];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int N = scanner.nextInt(), D = scanner.nextInt(), K = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int ts = scanner.nextInt();
            int Id = scanner.nextInt();
            logs[i] = new PII(ts, Id);
        }
        Arrays.sort(logs, 0, N);

        for (int i = 0, j = 0; i < N; i++) {
            int id = logs[i].id;
            cnt[id]++;
            while (logs[i].t - logs[j].t >= D) {
                cnt[logs[j].id]--;
                j++;
            }
            if (cnt[id] >= K) {
                st[id] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (st[i]) {
                System.out.println(i);
            }
        }
    }

    static class PII implements Comparable<PII> { //记录每一条日志信息的结构体
        int t; //相当于ts
        int id; //相当于id

        public PII(int t, int id) {
            this.t = t;
            this.id = id;
        }

        @Override
        public int compareTo(PII o) {
            return Integer.compare(t, o.t);
        }

//
    }
}
