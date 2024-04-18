package LuoGu;

import java.util.Scanner;

public class P1428 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[]num=new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            int count=0;
            int temp=num[i];
            for (int j = 0; j < i; j++) {
                if (num[j]<temp){
                    count++;
                }
            }
            System.out.printf("%d ",count);
        }
    }
}
