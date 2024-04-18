package Acwing.蓝桥杯每日一题.差分;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P4655 {
    public static int N = 100010;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int[] num = new int[N];
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        int[] qianzhuihe = new int[N];
        for (int i = 1; i <= n; i++) {
            qianzhuihe[i] = qianzhuihe[i - 1] + num[i];
        }
        int[] chafen = new int[N];
        for (int i = 1; i <= n; i++) {
            chafen[i] = num[i] - num[i - 1];
        }

        int[]count=new int[N];
        int m = scanner.nextInt();
        long temp = 0;
        while (m != 0) {
            m--;
            int l= scanner.nextInt();
            int r= scanner.nextInt();
            count[l]++;
            count[r+1]--;
        }
        for (int i=1;i<=n;i++){
            count[i]+=count[i-1];
        }
        for (int i=1;i<=n;i++){
            temp+= (long) count[i] *num[i];
        }
        Arrays.sort(num,1,n+1);
        Arrays.sort(count,1,n+1);
        long temp2=0;
        for (int i=1;i<=n;i++){
            temp2+= (long) count[i] *num[i];
        }
        System.out.println(temp2-temp);
    }
}
