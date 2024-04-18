package Acwing.蓝桥杯每日一题.贡献法;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P4261 {
    public static int N = 500010;
    public static int[]l=new int[N];
    public static int[]r=new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        String string = scanner.next();
        long end=0;
        int sh=0;
        int sg=0;
        for (int i=0;i<n;i++){
            if (string.charAt(i)=='G'){
                l[i]=sh;
                sg++;
                sh=0;
            }else {
                l[i]=sg;
                sh++;
                sg=0;
            }
        }
        sh=0;
        sg=0;
        for (int i=n-1;i>=0;i--){
            if (string.charAt(i)=='G'){
                r[i]=sh;
                sg++;
                sh=0;
            }else {
                r[i]=sg;
                sh++;
                sg=0;
            }
        }
        for (int i=0;i<n;i++){
            end+= (long) l[i] *r[i]+Math.max(l[i]-1,0)+Math.max(r[i]-1,0);
        }
        System.out.println(end);
    }
}
