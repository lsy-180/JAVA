package Acwing.蓝桥杯每日一题.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class P844 {
    static int N = 110, n, m;
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, 1, 0, -1};
    static int[][] p = new int[N][N];
    static int[][] d = new int[N][N];

    public static void bfs()
    {
        for (int i = 1; i <= n; i ++ )
            Arrays.fill(d[i], -1);

        d[1][1] = 0;
        Queue<PII> q = new LinkedList<>();
        q.add(new PII(1, 1));
        while (!q.isEmpty())
        {
            PII t = q.poll();
            for (int i = 1; i <= 4; i ++ )
            {
                int a = t.a + x[i - 1];
                int b = t.b + y[i - 1];
                if (a >= 1 && a <= n && b >= 1 && b <= m && p[a][b] == 0)
                {
                    if (d[a][b] == -1)
                    {
                        d[a][b] = d[t.a][t.b] + 1;
                        q.add(new PII(a, b));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 1; i <= n; i ++ )
            for (int j = 1; j <= m; j ++ )
                p[i][j] = sc.nextInt();

        bfs();
        System.out.println(d[n][m]);
    }
    static class PII
    {
        int a;
        int b;

        public PII(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
    }
}




