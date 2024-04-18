package LuoGu;

import java.util.Scanner;

public class P1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (n==0){
            System.out.println(0);
        }
        int count=0;
        if (n<0){
            n=-n;
            while (n!=0){
               int c=n%10;
               n=n/10;
               count=count*10+c;
            }
            System.out.println(-count);
        }
        else if(n>0) {
            while (n!=0){
                int c=n%10;
                n=n/10;
                count=count*10+c;
            }
            System.out.println(count);
        }
    }
}
