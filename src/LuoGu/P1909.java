package LuoGu;

import java.util.Scanner;

public class P1909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] num = new int[3][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0]= scanner.nextInt();
            num[i][1]= scanner.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            int pencil=num[i][0];
            if (n%pencil!=0){
                int c=n/pencil+1;
                int money=c*num[i][1];
                if (money<min){
                    min=money;
                }
            }else {
                int c=n/pencil;
                int money=c*num[i][1];
                if (money<min){
                    min=money;
                }
            }
        }
        System.out.println(min);
    }
}
