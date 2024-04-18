package LuoGu;

import java.util.Arrays;
import java.util.Scanner;

public class P1161 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double[][]num=new double[n][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0]=sc.nextDouble();
            num[i][1]=sc.nextInt();
        }

        int[]tas=new int[2000000];
        Arrays.fill(tas,0);
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j <= num[i][1]; j++) {
                if (tas[(int) Math.floor(num[i][0]*j)]==0){
                    tas[(int) Math.floor(num[i][0]*j)]=1;
                }
                else if(tas[(int) Math.floor(num[i][0]*j)]==1){
                    tas[(int) Math.floor(num[i][0]*j)]=0;
                }
            }
        }
        for (int i = 0; i < tas.length; i++) {
            if (tas[i]==1){
                System.out.println(i);
                break;
            }
        }
    }
}
