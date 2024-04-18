package Acwing.双指针;

import java.util.Arrays;
import java.util.Scanner;

public class P3745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), L = scanner.nextInt();
        int P = 100010;
        int[] num = new int[N + 1];
        int[] q = new int[N + 1];
        num[0] = 0;
        for (int i = 1; i <= N; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        for (int i = 1; i <= N; i++) {
            q[i] = num[N - i + 1];
        }

        // 超时写法
//        int end=0;
//        int res = 0;
//        boolean flag=true;
//        for (int i = 1, j = N; i <= N; i ++ )
//        {
//            System.out.println(i);
//            while (j>0 && num[j] >=i ) j -- ;
//            System.out.println(j);
//            if (N-j>i){
//                j=N;
//                res=i;
//                continue;
//            }else {
//                flag=false;
//                if (i-(N-j)<=L&&num[j]>=i-1){
//                    res=i;
//                    break;
//                }
//            }
//            if (!flag){
//                break;
//            }
//        }
//        System.out.println(res);
        System.out.println(Arrays.toString(q));
        int res = 0;
        for (int i = 1, j = N; i <= N; i++) {
            while (j > 0 && q[j] < i) j--;
            if (q[i] >= i - 1 && i - j <= L){
                System.out.println(q[i]);
                res = i;
            }
        }
        System.out.println("-----");
        System.out.println(res);
    }
}
