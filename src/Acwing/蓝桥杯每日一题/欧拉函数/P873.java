package Acwing.蓝桥杯每日一题.欧拉函数;

import java.util.Scanner;

public class P873 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            if (a==1){
                System.out.println(1);
            }else {
                int res=a;
                // 分解质因数
                for (int i=2;i<=a/i;i++){
                    if (a%i==0){
                        while (a%i==0){
                            a=a/i;
                        }
                        res=res/i*(i-1);
                    }
                }
                if (a>1) res=res/a*(a-1);
                System.out.println(res);
            }
        }
    }
}
