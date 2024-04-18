package 蓝桥杯14届研究生组真题;

import java.io.PrintWriter;
import java.util.Scanner;

public class Pzuida {
    public static int[]x=new int[50010];
    public static int[]y=new int[50010];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n= scanner.nextInt();
        while (n!=0){
            n--;
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            int d= scanner.nextInt();
            int k= scanner.nextInt();
            int res=0;
            int p=0;
            for (int i=a;i<=b;i++){
                if (i%k==0){
                    x[p++]=i;
                }
            }
            int o=0;
            for (int i=c;i<=d;i++){
                if (i%k==0){
                    y[o++]=i;
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < o; j++) {
                    int gong=zuidagongyueshu(x[i],y[j]);
                    if (gong==k){
                        res++;
                    }
                }
            }
            pw.println(res);
            pw.flush();
        }
    }
    public static int zuidagongyueshu(int a,int b){
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        while (d!=0){
            int temp=c%d;
            c=d;
            d=temp;
        }
        return c;
    }
}
