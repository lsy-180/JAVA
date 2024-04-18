package LuoGu;

import java.util.Scanner;

public class P1567 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]num=new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i]=scanner.nextInt();
        }
        int max=0,count=0;
        for (int i = 0; i < num.length-1; i++) {
            if (num[i+1]>num[i]){
                count++;
            }else {
                count=1;
            }
            if (count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
