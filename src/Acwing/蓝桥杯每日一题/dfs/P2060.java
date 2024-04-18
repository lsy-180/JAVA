package Acwing.蓝桥杯每日一题.dfs;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class P2060 {
    public static int n;
    public static int m;
    public static int N=55;
    public static int M=55;
    public static char[][]strings=new char[N][M];
    public static boolean[][]panchong=new boolean[N][M];
    public static int[]dx={0,0,1,-1};
    public static int[]dy={1,-1,0,0};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();
        m= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String string= scanner.next();
            for (int j = 0; j < m; j++) {
                strings[i][j]=string.charAt(j);
            }
        }

        List<PII> points1 = new ArrayList<>();
        List<PII> points2 = new ArrayList<>();
        int k=0;
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (strings[i][j]=='X'&&!flag){
                    dfs(i,j,points1);
                    flag=true;
                } else if (strings[i][j]=='X'&&!panchong[i][j]) {
                    dfs(i,j,points2);
                    break;
                }
            }
        }
        int res=110;
        // 枚举曼哈顿距离
        for (PII a : points1)
            for (PII b : points2)
                res = Math.min(res, Math.abs(a.x - b.x) + Math.abs(a.y - b.y) - 1);

        System.out.println(res);
    }

    private static void dfs(int x, int y,List<PII> points) {
        PII t=new PII(x,y);
        points.add(t);
        panchong[x][y]=true;
        for (int i=0;i<4;i++){
            int tx=x+dx[i];
            int ty=y+dy[i];
            if (tx>=0&&tx<n&&ty>=0&&ty<m&&strings[tx][ty]=='X'&&!panchong[tx][ty]){
                dfs(tx,ty,points);
            }
        }
    }

    static class PII implements Comparable<PII>{
        int x;
        int y;

        public PII(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(@NotNull P2060.PII o) {
            return Integer.compare(x,o.x);
        }
    }

}
