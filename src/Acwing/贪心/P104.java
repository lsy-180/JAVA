package Acwing.贪心;

import java.util.Arrays;
import java.util.Scanner;

public class P104 {
    public static int x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[]num=new int[N+1];
        for (int i = 1; i <= N; i++) {
            num[i]= scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        if (N%2==0){
            x=(num[N/2]+num[N/2+1])/2;
        }else {
            x=num[N/2+1];
        }
        System.out.println(x);
        int end=0;
        for (int i = 1; i <=N; i++) {
            int max=Math.max(num[i],x);
            int min=Math.min(num[i],x);
            end+=max-min;
        }
        System.out.println(end);
    }
}
