package LuoGu;

import java.util.Scanner;

public class P1887 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int n=N%M;
        int b=N/M;
        for(int i=n;i<M;i++) System.out.printf("%d ",b);;
        for(int i=0;i<n;i++) System.out.printf("%d ",b+1);;
    }
}
