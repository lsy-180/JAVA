package Acwing.图;

import java.util.Arrays;
import java.util.Scanner;

public class P1224 {
    public static int N = 10010;
    public static int[] num = new int[N];
    public static boolean []st=new boolean[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.fill(st,false);
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (!st[i]){
                count++;
                for (int j = i; !st[j]; j=num[j]) {
                    st[j]=true;
                }
            }
        }
        System.out.println(n-count);
    }
}
