package Acwing.蓝桥杯每日一题.BFS;

import java.util.Scanner;

public class P845 {
    public static int[][] num=new int[4][4];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                num[i][j]= scanner.nextInt();
            }
        }

    }
}
