package Acwing.模拟;

import java.util.Scanner;

public class P1245 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            int j=i;
            while (j!=0){
                int x=j%10;
                j=j/10;
                if (x==0||x==1||x==2||x==9){
                    count+= i;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
