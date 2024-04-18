package Acwing.蓝桥杯每日一题.矩阵乘法;

import java.util.*;

public class P205 {
    static final int MOD = 10000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int n = in.nextInt();
            if(n == -1) break;
            System.out.println(fib(n));
        }
    }

    public static int fib(int n) {
        int[][] a = {{0,1},{1,1}};
        int[][] f = {{0,1},{1,1}};
        while(n != 0) {
            if((n & 1) == 1) mul(a,f);
            mul(f,f);
            n >>= 1;
        }
        return a[0][0];
    }

    public static void mul(int[][] a,int[][] b) {
        int[][] c = new int[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k ++ ) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }
        for(int i = 0; i < 2; i++) a[i] = Arrays.copyOf(c[i],2);
    }
}