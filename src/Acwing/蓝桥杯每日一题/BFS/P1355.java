package Acwing.蓝桥杯每日一题.BFS;

import java.io.BufferedInputStream;
import java.util.*;

public class P1355 {
    public static boolean[][][] aBoolean = new boolean[25][25][25];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] w = new int[]{a, b, c};
        Queue<int[]> queue = new LinkedList<>();
        int A = 0;
        int B = 0;
        int C = c;
        queue.add(new int[]{A, B, C});
        aBoolean[A][B][C] = true;
        Set<Integer> set = new TreeSet<>();
        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            if (t[0] == 0) {
                set.add(t[2]);
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != j) {
                        int[] x = {t[0], t[1], t[2]}; // 容积
                        int tou = Math.min(t[i], w[j] - x[j]); // i桶往j桶倒
                        x[i] -= tou;
                        x[j] += tou;
                        int one = x[0];
                        int two = x[1];
                        int three = x[2];
                        if (!aBoolean[one][two][three]) {
                            aBoolean[one][two][three] = true;
                            queue.add(new int[]{one, two, three});
                        }
                    }
                }
            }
        }
        for (Integer i : set) {
            System.out.printf("%d ", i);
        }
    }
}
