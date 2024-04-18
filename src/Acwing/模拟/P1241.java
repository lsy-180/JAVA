package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P1241 {
    public static PIIs[] PII = new PIIs[100010];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int N = scanner.nextInt(), M = scanner.nextInt(), T = scanner.nextInt();
        int[] waimai = new int[N + 1];
//        long[][] num = new long[T + 1][N + 1];
        int[]youxian=new int[N+1];
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
//            num[x][y]++;
            PII[i+1] = new PIIs(x,y);
        }
        Arrays.sort(PII);
        for (int i = 1; i <= T; i++) {

            boolean[]num=new boolean[N+1];
            Arrays.fill(num,false);
            for (int j = 1; j <= M; j++) {
//                if (num[i][j] != 0) {
//                    waimai[j] = (int) (num[i][j] * 2 + waimai[j]);
//                }
                int x=PII[j].t;
                int y=PII[j].id;
                if (x==i){
                    waimai[y]+=2;
                    num[y]=true;
                }
            }
            for (int l = 1; l <= N; l++) {
                if (waimai[l] > 0 && !num[l]) {
                    waimai[l]--;
                }
                if (waimai[l]>5){
                    youxian[l]=1;
                }
                if (waimai[l]<=3){
                    youxian[l]=0;
                }
            }
//            System.out.println(Arrays.toString(waimai));
        }
//        System.out.println(Arrays.toString(waimai));
        int count = 0;
        for (int i = 1; i <=N; i++) {
            if (youxian[i]==1) {
                count++;
            }
        }
        System.out.println(count);
    }
    static class PIIs implements Comparable<PIIs>
    {
        public int t;
        public int id;
        public PIIs(int t,int id)
        {
            this.t = t;
            this.id = id;
        }
        @Override
        public int compareTo(PIIs o) {
            // TODO 自动生成的方法存根
            return t != o.t ? Integer.compare(t,o.t) : Integer.compare(id,o.id);
        }

    }


}
