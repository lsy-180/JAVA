package LuoGu;

import java.util.Scanner;

public class P1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=3;
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), d = scanner.nextDouble();
        for(double i=-100;i<=100;i+=0.001){
            double j=i+0.001;
            double v1=a*j*j*j+b*j*j+c*j+d;
            double v2=a*i*i*i+b*i*i+c*i+d;
            if (v1*v2<0){
                System.out.printf("%.2f ",i);
                count--;
            }
            if (count==0){
                break;
            }
        }
    }
}
