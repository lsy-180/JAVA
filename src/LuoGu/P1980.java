package LuoGu;

import java.util.Scanner;

public class P1980 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), x = scanner.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            int temp=i;
            while (temp!=0){
                int min=temp%10;
                temp=temp/10;
                if (min==x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
