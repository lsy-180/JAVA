package Acwing.蓝桥杯每日一题.双指针;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P799 {
    public static int N = 100010;
    public static int[] num = new int[N];
    public static int[]query=new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        int j = 1;
        int i = 1;
        int count = 0;
        while (i<=n){
            query[num[i]]++;
            while(query[num[i]]>1){
                query[num[j]]--;
                j++;
            }
            count=Math.max(count,i-j+1);
            i++;
        }
        System.out.println(count);
    }
}
