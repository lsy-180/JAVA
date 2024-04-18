package LuoGu;

import java.util.Scanner;

public class P1426 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s= scanner.nextInt(),x=scanner.nextInt();
        double length=7;
        double res=0;
        int qw=0;
        while (res<s){
            if (Math.abs(s-res)<x){
                length=length*0.98;
                res+=length;
                if (Math.abs(s-res)<x){
                    System.out.println("y");
                    qw=1;
                    break;
                }else {
                    System.out.println("n");
                    qw=1;
                    break;
                }
            }
            res+=length;
            length=length*0.98;
        }
        if (qw==0){
            System.out.println("n");
        }
    }
}
