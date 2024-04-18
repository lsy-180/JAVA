package Acwing.BFS;


import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1233 {
    public static int N = 1010;
    public static int total;
    public static int bound;
    public static char[][] num = new char[N][N];
    public static boolean[][] g = new boolean[N][N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String string = scanner.next();
            for (int j = 0; j < n; j++) {
                num[i][j] = string.charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!g[i][j] && num[i][j] == '#') {
                    total = 0;
                    bound = 0;
                    bfs(i, j);
                    if (total == bound) count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(int i, int j) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        Queue<PII> queue = new LinkedList<>();
        queue.add(new PII(i, j));
        g[i][j] = true;
        while (!queue.isEmpty()) {
            PII t = queue.element();
            queue.remove();
            total++;
            boolean flag = false;
            for (int k = 0; k < 4; k++) {
                int x = t.x + dx[k];
                int y = t.y + dy[k];
                if (x < 0 || x >= N || y < 0 || y >= N) continue;
                if (num[x][y] == '.') {
                    flag = true;
                    continue;
                }
                if (!g[x][y] && num[x][y] == '#') {
                    queue.add(new PII(x, y));
                    g[x][y] = true;
                }
            }
            if (flag) bound++;
        }
    }

    static class PII {
        int x;
        int y;

        public PII(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
