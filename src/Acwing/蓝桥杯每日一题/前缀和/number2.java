package Acwing.蓝桥杯每日一题.前缀和;

import java.util.Scanner;

public class number2 {
    public static int N=1010;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int q= scanner.nextInt();
        int[][]num=new int[N][N];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                num[i][j]= scanner.nextInt();
            }
        }
        int[][]s=new int[N][N];

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+num[i][j];
            }
        }
        while (q!=0){
            q--;
            int x1= scanner.nextInt();
            int y1= scanner.nextInt();
            int x2= scanner.nextInt();
            int y2= scanner.nextInt();
            System.out.println(s[x2][y2]-s[x2][y1-1]-s[x1-1][y2]+s[x1-1][y1-1]);
        }

    }
}
