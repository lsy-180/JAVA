package LuoGu;

import java.util.Scanner;

public class P1317 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[]num=new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        int count=0;
        for (int i = 1; i < num.length-1; i++) {
            if (num[i-1]>=num[i]&&num[i]<num[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
