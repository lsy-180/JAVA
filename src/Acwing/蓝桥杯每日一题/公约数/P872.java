package Acwing.蓝桥杯每日一题.公约数;

import java.util.Scanner;

public class P872 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println(zuidagongyueshu(a,b));
        }
    }
    public static int zuidagongyueshu(int a,int b){
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        while (d!=0){
            int temp=c%d;
            c=d;
            d=temp;
        }
        return c;
    }
}
