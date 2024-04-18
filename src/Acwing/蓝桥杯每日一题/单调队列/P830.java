package Acwing.蓝桥杯每日一题.单调队列;

import java.util.Scanner;

public class P830 {
    public static int N = 100010;
    public static int[] num = new int[N];
    public static int tt = 0;
    public static int[] stk = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 单调栈，将栈中序号小于当前序号且值大于当前值的出栈
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            while (tt!=0 && stk[tt]>=x) tt--;
            if (tt!=0) System.out.printf("%d ",stk[tt]);
            else {
                System.out.printf("%d ",-1);
            }
            stk[++tt]=x;
        }
//        for (int i = 1; i <= n; i++) {
//            num[i] = scanner.nextInt();
//        }
        // 暴力 超时
//        for (int i=1;i<=n;i++){
//            int x=num[i];
//            for (int j=i-1;j>=0;j--){
//                if (i==1){
//                    System.out.printf("%d ",-1);
//                }else {
//                    if (j==0){
//                        System.out.printf("%d ",-1);
//                    }
//                    else if (x>num[j]){
//                        System.out.printf("%d ",num[j]);
//                        break;
//                    }
//
//                }
//            }
//        }


    }
}
