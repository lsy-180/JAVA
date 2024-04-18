package LuoGu;

import java.util.Scanner;

public class P1147 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int[]num=new int[2000010];
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
        }
        int[]b=new int[2000010];
        for (int i = 1; i < b.length; i++) {
            b[i]=b[i-1]+num[i];
        }
        int j=1;
        int k=0;
        while (j<M){
            if (b[j]-b[k]==M){
                if (k+1!=j){
                    System.out.printf("%d %d",k+1,j);
                    System.out.println();
                    k++;
                }
            } else if (b[j]-b[k]>M) {
                j--;
                k++;
            }else {
                j++;
            }
        }
    }
}
