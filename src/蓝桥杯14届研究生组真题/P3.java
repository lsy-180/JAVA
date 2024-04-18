package 蓝桥杯14届研究生组真题;

import java.util.Scanner;

public class P3 {
    public static int N=2010;
    public static int[][]num=new int[N][N];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int x1= scanner.nextInt();
            int y1= scanner.nextInt();
            int x2= scanner.nextInt();
            int y2= scanner.nextInt();
            for (int j=x1;j<=x2;j++){
                for (int k=y1;k<=y2;k++){
                    if (num[j][k]==0){
                        num[j][k]=1;
                    }else {
                        num[j][k]=0;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j=1;j<=n;j++){
                System.out.printf("%d",num[i][j]);
            }
            System.out.println();
        }
    }

}

