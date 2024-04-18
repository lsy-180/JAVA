package Acwing.二叉树;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P1240 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int N=scanner.nextInt();
        int []num=new int[N+1];
        for (int i = 1; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        long max=-100010;
        int depth=1;
        int i=1;
        int j=0;
        int temp=1;
        while (i<N){
            int p= (int) (i+Math.pow(2,j));
            long maxs=0;
            if (p<N){
                for (int s=i;s<p;s++){
                    maxs+=num[s];
                }
                if (maxs>max){
                    max=maxs;
                    depth=temp;
                }
            }else {
                for (int s=i;s<=N;s++){
                    maxs+=num[s];
                }
                if (maxs>max){
                    max=maxs;
                    depth=temp;
                }
            }
            i+= (int) Math.pow(2,j);
            j++;
            temp++;
        }
        System.out.println(depth);
    }
}
