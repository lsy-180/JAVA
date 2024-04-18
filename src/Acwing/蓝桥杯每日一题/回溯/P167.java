package Acwing.蓝桥杯每日一题.回溯;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P167 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        while (true){
            int n= scanner.nextInt();
            if (n==0){
                break;
            }
            int[]num=new int[n];
            int max=0;
            int he=0;
            for (int i = 0; i < num.length; i++) {
                num[i]= scanner.nextInt();
                he+=num[i];
                max=Math.max(max,num[i]);
            }
            for (int i=max;i<he;i++){
                if (he%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
