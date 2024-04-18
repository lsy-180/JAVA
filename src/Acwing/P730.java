package Acwing;

import java.util.Scanner;

public class P730 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]num=new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i]=scanner.nextInt();
        }
        // 也可以用二分 l=0，r=1e5
        int end = -1;
        for (int i = 1; i < 100000; i++) {
            long temp=i;
            int sc=i;
            for (int j = 0; j < num.length; j++) {
                temp=2*temp-num[j];
                if (temp>Math.pow(2,32)){
                    break;
                }
                if (temp<0){
                    break;
                }
            }
            System.out.println(temp);
            if (temp>=0){
                end=sc;
                break;
            }
        }
        System.out.println(end);
    }
}
