package Acwing.蓝桥杯每日一题.并查集;

import java.util.Scanner;

public class P528 {
    public static int N = 1010;
    public static int[] q = new int[N];
    public static PII[] piis = new PII[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {
            T--;
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = 0; i <= n + 1; i++) {
                q[i] = i;
            }

            for (int i = 1; i <=n ; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                piis[i] = new PII(x, y, z);
                if (Math.abs(z) <= r) q[find(i)] = find(0);
                if (Math.abs(z - h) <= r) q[find(i)] = find(n + 1);
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    long dx = piis[i].x - piis[j].x;
                    long dy = piis[i].y - piis[j].y;
                    long dz = piis[i].z - piis[j].z;
                    if (dx * dx + dy * dy + dz * dz <= 4 * (long) r * r) {
                        q[find(i)] = find(j);
                    }
                }
            }
            if (find(0) == find(n + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static int find(int x) {
        if (q[x] != x) q[x] = find(q[x]);
        return q[x];
    }

    public static class PII {
        int x;
        int y;
        int z;

        public PII(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
