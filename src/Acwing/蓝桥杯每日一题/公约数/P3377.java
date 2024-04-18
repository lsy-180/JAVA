package Acwing.蓝桥杯每日一题.公约数;

import java.util.Scanner;

public class P3377 {
    public static int res=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            if (a==1){
                System.out.println(1);
            }else {
                System.out.println(yueshu(a));
            }

        }
    }

    private static int yueshu(int a) {
        int s=0;
        for (int i=1;i<=a/i;i++){
            if (a%i==0){
                s++;
                int p=a/i;
                if (p!=i){
                    if (a%p==0){
                        s++;
                    }
                }
            }
        }
        return s;
    }
}
