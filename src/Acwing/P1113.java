package Acwing;

import java.io.BufferedInputStream;
import java.util.*;

public class P1113 {
    public static int W = 22;
    public static int H = 22;
    public static char[][] strings = new char[W][H];
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static boolean[][] panchong = new boolean[W][H];
    public static int w = -1;
    public static int h = -2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (true) {
            w = scanner.nextInt();
            h = scanner.nextInt();
            if (w==0&&h==0){
                break;
            }
            if (w != 0 && h != 0) {
                for (int i = 0; i < h; i++) {
                    String string = scanner.next();
                    for (int j = 0; j < w; j++) {
                        char a = string.charAt(j);
                        strings[i + 1][j + 1] = a;
                    }
                }
                PII start = null;

                Queue<PII> queue = new LinkedList<>();
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= w; j++) {
                        if (strings[i][j] == '@') {

                            start = new PII(i, j);
                        }
                    }
                }
                queue.add(start);
                int count = 1;
                for (int i = 0; i < panchong.length; i++) {
                    Arrays.fill(panchong[i], false);
                }

                while (!queue.isEmpty()) {
                    PII t = queue.element();
                    queue.remove();
                    int x = t.x;
                    int y = t.y;
                    panchong[x][y] = true;
                    for (int i = 0; i < 4; i++) {
                        int xc = x + dx[i];
                        int yc = y + dy[i];
                        if (xc < 1 || xc > h || yc < 1 || yc > w) continue;
                        if (strings[xc][yc] == '#') continue;
                        if (!panchong[xc][yc]) {
                            queue.add(new PII(xc, yc));
                            count++;
                            panchong[xc][yc] = true;
                        }
                    }
                }
                System.out.println(count);
            }
        }


    }


    static class PII implements Comparator<PII> { //对应C++中的Pairs<int, int>
        int x; //每个点的横坐标
        int y;  //每个点的纵坐标

        public PII(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compare(PII o1, PII o2) {
            return o2.y-o1.y;
        }
    }
}
