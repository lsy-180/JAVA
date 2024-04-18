package Acwing.蓝桥杯每日一题.单调队列;

import java.util.Arrays;
import java.util.Scanner;

public class P4964 {
    public static int N = 1010;
    public static int[][] arr = new int[N][N];
    static final int mod = 998244353;
    public static int[] max = new int[N];
    public static int[] min = new int[N];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 输入n,m,a,b
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        // 输入数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int[][] Max_arr = new int[n][m - b + 1];
        int[][] Min_arr = new int[n][m - b + 1];
        for (int i = 0; i < n; i++) {
            int h1 = 1, t1 = 0, h2 = 1, t2 = 0;
            for (int j = 0; j < m; j++) {
                if (h1 <= t1 && j - b + 1 > max[h1]) h1++;
                if (h2 <= t2 && j - b + 1 > min[h2]) h2++;
                while (h1 <= t1 && arr[i][max[t1]] <= arr[i][j]) t1--;
                while (h2 <= t2 && arr[i][min[t2]] >= arr[i][j]) t2--;
                max[++t1] = j;
                min[++t2] = j;
                if (j >= b - 1) {
                    Max_arr[i][j - b + 1] = arr[i][max[h1]];
                    Min_arr[i][j - b + 1] = arr[i][min[h2]];
                }
            }
        }
        System.out.println(Arrays.deepToString(Max_arr));
        System.out.println(Arrays.deepToString(Min_arr));
        max = new int[N];
        min = new int[N];
        int res=0;
        for(int j = 0; j <= m - b; j ++){
            int h1 = 1, t1 = 0, h2 = 1, t2 = 0;
            for(int i = 0; i < n; i ++){
                if(h1 <= t1 && i - a + 1 > max[h1]) h1 ++;
                if(h2 <= t2 && i - a + 1 > min[h2]) h2 ++;
                while(h1 <= t1 && Max_arr[max[t1]][j] <= Max_arr[i][j]) t1 --;
                while(h2 <= t2 && Min_arr[min[t2]][j] >= Min_arr[i][j]) t2 --;
                max[++ t1] = i;
                min[++ t2] = i;
                if(i >= a - 1) {
                    res = (res + ((Max_arr[max[h1]][j]%mod) * (Min_arr[min[h2]][j]%mod))%mod) % mod;
                }
            }
        }
        System.out.println(res);
    }
}
