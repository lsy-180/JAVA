package Acwing.蓝桥杯每日一题.二分;

import java.util.Scanner;

public class number1 {
    static double[] sum = new double[100010];
    static int[] cow = new int[100010];
    static int n;
    static int f;
    //输入一个平均值，判断是否 存在一个平均值比avg大且长度不小于F的子段
    public static boolean check(double avg)
    {
        //计算与平均数差值的平均和
        for(int i = 1;i <= n;i++) sum[i] = sum[i - 1] + cow[i] - avg;
        //记录到i位置前缀和最小值
        double minv = 0;
        for(int i = 0,j = f;j <= n;i++,j++)
        {
            //保证长度一定不小于F
            minv = Math.min(minv, sum[i]);
            if(sum[j] - minv >= 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        f = scan.nextInt();

        for(int i = 1;i <= n;i++) cow[i] = scan.nextInt();
        double l = 0,r = 2000;
        while(r - l > 1e-5)
        {
            double mid = (l + r)/2;
            if(check(mid)) l = mid;
            else r = mid;
        }
        System.out.println((int)(r * 1000));
    }
}
