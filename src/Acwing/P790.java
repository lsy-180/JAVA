package Acwing;

import java.util.Scanner;

public class P790 {
    public static void main(String[] args) {
        // 解法一
        /*Scanner scanner=new Scanner(System.in);
        double n= scanner.nextDouble();
        if (n<0){
            n=-n;
            double x=Math.pow(n, (double) 1 /3);
            System.out.printf("%f",-x);
        }
        else {
            double x=Math.pow(n, (double) 1 /3);
            System.out.printf("%.6f",x);
        }*/
        // 第二种
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (n < 0) {
            n = -n;
            double l = -100, r = 100;
            while (r - l > 1e-8) {
                double min = (l + r) / 2;
                if (Math.pow(min, 3) >= n) {
                    r = min;
                } else l = min;
            }
            System.out.printf("%.6f", -r);
        } else {
            double l = -100, r = 100;
            while (r - l > 1e-8) {
                double min = (l + r) / 2;
                if (Math.pow(min, 3) >= n) {
                    r = min;
                } else l = min;
            }
            System.out.printf("%.6f", r);
        }


    }
}
