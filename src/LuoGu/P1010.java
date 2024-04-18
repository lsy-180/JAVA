package LuoGu;

import java.util.Scanner;

public class P1010 {
    public static int n;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        micifang(n);
    }
    public static void micifang(int x){
        for (int i = 14; i >=0 ; i--) {
            if (Math.pow(2,i)<=x){
                if (i==1){
                    System.out.printf("%s","2");
                } else if (i==0) {
                    System.out.printf("%s","2(0)");
                }
                else{
                    System.out.printf("%s","2(");
                    micifang(i);
                    System.out.printf("%s",")");
                }
                x-= (int) Math.pow(2,i);
                if (x!=0){
                    System.out.printf("%s","+");
                }

            }
        }
    }
}
