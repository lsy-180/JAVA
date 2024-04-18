package Acwing.蓝桥杯每日一题.组合计数;

import java.util.Scanner;

public class P885 {
    public static int N=100010;
    public static int[][]num=new int[N][N];
    public static int MOD=1000000000+7;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        init();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println(num[a][b]);
        }
    }
    public static void init(){
        for (int i=0;i<N;i++){
            for (int j=0;j<=i;j++){
                if (j==0) num[i][j]=1;
                else num[i][j]=(num[i-1][j]+num[i-1][j-1])%MOD;
            }
        }
    }
}
