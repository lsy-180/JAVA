package LuoGu;

import java.util.Arrays;
import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]num=new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]= sc.nextInt();
        }
        int[]cha=new int[n-1];
        for (int i = 0; i < num.length-1; i++) {
            cha[i]=Math.abs(num[i]-num[i+1]);
        }
        Arrays.sort(cha);
        boolean flag=true;
        for (int i = 0; i < cha.length; i++) {
            if (cha[i]!=i+1){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("Jolly");
        }
        else {
            System.out.println("Not jolly");
        }
    }
}
