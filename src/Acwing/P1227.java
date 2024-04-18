package Acwing;

import java.util.Scanner;

public class P1227 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt(),K=scanner.nextInt();
        int[][]num=new int[N][2];
        int []len=new int[2];
        for (int i = 0; i < num.length; i++) {
            num[i][0]= scanner.nextInt();
            num[i][1]= scanner.nextInt();
        }
        int l=1,r=100000;
        int end=1;

        while (l<r){
            int mid=(l+r+1)/2;
            int count=0;
            for (int i = 0; i < num.length; i++) {
                count+=(num[i][0]/mid)*(num[i][1]/mid);
            }
            if (count>=K){
                l=mid;
                end=mid;
            }else {
                r=mid-1;
            }
        }
        System.out.println(end);
    }
}
