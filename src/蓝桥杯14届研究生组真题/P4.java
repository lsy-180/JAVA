package 蓝桥杯14届研究生组真题;

import java.util.Arrays;
import java.util.Scanner;

public class P4 {
    static final int MOD = 998244353;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 输入n,m,a,b
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        // 输入数据
        int[][] arr = new int[n][m];

//        设置最大值数组和最小值二维数组，在输入的同时预处理b列；
        int[][] Maxarr=new int[n][m-b+1];
        int[][] Minarr=new int[n][m-b+1];

        for (int i = 0; i < n; i++) {
            int temp=0;
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
                if(j>b-2) {
                    int max=Integer.MIN_VALUE;
                    int min=Integer.MAX_VALUE;
                    for(int k=j;k>j-b;k--) {
                        max=Math.max(max,arr[i][k]);
                        min=Math.min(min,arr[i][k]);
                    }
                    Minarr[i][temp]=min;
                    Maxarr[i][temp++]=max;
                }
            }
        }
        System.out.println(Arrays.deepToString(Maxarr));
        System.out.println(Arrays.deepToString(Minarr));
        // 用于输出最后的结果
        int result = 0;
//        滑动遍历最大值或最小值对a行进行比较出来得到该矩阵价值。
        for (int i = 0; i <= n - a; i++) {
            for (int k = 0; k < m - b + 1; k++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = i; j < i + a; j++) {
                    max = Math.max(max, Maxarr[j][k]);
                    min = Math.min(min, Minarr[j][k]);
                }
                result = (result + ((max % MOD) * (min % MOD)) % MOD) % MOD;
            }
        }
        System.out.println(result);

    }
}
