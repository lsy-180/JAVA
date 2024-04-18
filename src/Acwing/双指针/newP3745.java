package Acwing.双指针;

import java.util.Arrays;
import java.util.Scanner;

public class newP3745 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), L = scanner.nextInt();
        int[] num = new int[N + 1];
        int[] a = new int[N + 1];
        num[0] = 0;
        for (int i = 1; i <= N; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        for (int i = 1; i <= N; i++) {
            a[i] = num[N - i + 1];
        }
        int h=0;
        for(int i=1;i<=N;i++){
            if(a[i]>=i) h=i;  //找到我们的指数点
            else break;
        }
        if(a[h+1]<h){
            System.out.println(h); //如果a[h+1]这个点小于h的话,则它就算加1也不会变成h+1,后面的数更不可能
        }else {
            int cnt=0;
            for(int i=1;i<=h+1;i++){
                if(a[i]==h) cnt++;   //计算出有多少个数是h
            }
            if(L>=cnt) System.out.println(h+1);   //满足条件则是h+1否则是h
            else System.out.println(h);
        }


    }
}
