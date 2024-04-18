package Acwing.蓝桥杯每日一题.DP;

import java.util.*;

public class P285 {
    static final int N = 6010;
    static int[] e = new int[N], ne = new int[N], h = new int[N], w = new int[N];
    static int[][] f = new int[N][2];
    static int n, idx;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 1; i <= n; i ++) w[i] = sc.nextInt();
        Arrays.fill(h, -1);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n - 1; i ++) {
            int b = sc.nextInt(), a = sc.nextInt();
            add(a, b);
            set.add(b);
        }
        int root = 0;
        for (int i = 1; i <= n; i ++)
            if (!set.contains(i)) {
                root = i;
                break;
            }

        dfs(root);

        System.out.println(Math.max(f[root][0], f[root][1]));
    }
    public static void dfs(int u) {
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i];
            dfs(j);
            f[u][0] += Math.max(f[j][0], f[j][1]);
            f[u][1] += f[j][0];
        }
        f[u][1] += w[u];
    }
    public static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx ++;
    }
}
