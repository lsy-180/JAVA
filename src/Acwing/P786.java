package Acwing;

import java.util.Arrays;
import java.util.Scanner;

public class P786 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(),k= sc.nextInt();
        int[]num=new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[k-1]);
    }
}
