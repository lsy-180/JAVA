package Acwing.贪心;

import java.util.Scanner;

public class P1055 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int[]num=new int[N+1];
        for (int i = 1; i <=N; i++) {
            num[i]= scanner.nextInt();
        }
        int end=0;
        for (int i = 1; i <N ; i++) {
            if (num[i+1]-num[i]>0){
                end+=num[i+1]-num[i];
            }
        }
        System.out.printf("%d",end);
    }
}
