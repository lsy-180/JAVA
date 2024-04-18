package Acwing.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1101 {
    public static int N = 210;
    public static int C, R;
    public static int[][] dis = new int[N][N];
    public static char[][] g = new char[N][N];
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T != 0) {

            R = scanner.nextInt();
            C = scanner.nextInt();
            Queue<PII> queue = new LinkedList<>();
            for (int i = 0; i < R; i++) {
                String string = scanner.next();
                for (int j = 0; j < C; j++) {
                    g[i][j] = string.charAt(j);
                }
            }
            PII start = null;
            PII end = null;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (g[i][j] == 'S') start = new PII(i, j);
                    else if (g[i][j] == 'E') end = new PII(i, j);
                }
            }
            int distance = bfs(start, end);
            if (distance == -1) {
                System.out.println("oop!");
            } else {
                System.out.println(distance);
            }
            T--;
        }

    }

    private static int bfs(PII start, PII end) {
        Queue<PII> queue = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            Arrays.fill(dis[i], -1);
        }
        dis[start.x][start.y] = 0;
        queue.add(start);
        while (!queue.isEmpty()) {
            PII t = queue.element();
            queue.remove();
            for (int i = 0; i < 4; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];
                if (x < 0 || x >= R || y < 0 || y >= C) continue;
                if (g[x][y] == '#') continue;
                if (dis[x][y] != -1) continue;
                dis[x][y] = dis[t.x][t.y] + 1;
                if (x == end.x && y == end.y) {
                    return dis[x][y];
                }
                queue.add(new PII(x, y));
            }
        }
        return -1;
    }

    static class PII { //对应C++中的Pairs<int, int>
        int x; //每个点的横坐标
        int y;  //每个点的纵坐标

        public PII(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
