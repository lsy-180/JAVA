package Acwing.树状数组;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] num = new int[n + 1];
        int[] shu = new int[n + 1];
        for (int i = 1; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        shu[1]=num[1];
        for (int i = 2; i <= n; i++) {
            for (int j=i-lowbit(i)+1;j<=i;j++){
                shu[i]+=num[j];
            }
        }
//        System.out.println(Arrays.toString(shu));
        int[] kp = new int[m + 1];
        int[] local = new int[m + 1];
        int[] add = new int[m + 1];
        for (int i = 1; i <= m; i++) {
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            kp[i] = k;
            local[i] = a;
            add[i] = b;
        }
        for (int i = 1; i <= m; i++) {
            if (kp[i] == 1) {
                for (int j=local[i];j<=n;j+=lowbit(j)){
//                    System.out.println(j);
                    shu[j]+=add[i];
                }
//                System.out.println(Arrays.toString(shu));
            } else {
                int count=0;
                int end=0;
                for(int j=add[i];j>0;j-=lowbit(j)){
                    count+=shu[j];
                }
                for(int j=local[i]-1;j>0;j-=lowbit(j)){
                    end+=shu[j];
                }
                System.out.println(count-end);
            }
        }
    }

    public static int lowbit(int x) {
        return x & -x;
    }
}