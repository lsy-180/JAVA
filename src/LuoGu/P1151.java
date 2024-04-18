package LuoGu;

import java.util.Scanner;

public class P1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int k = scanner.nextInt();
        for (int i = 10000; i < 30001; i++) {
            int a5 = i % 10;
            int a4 = i / 10 % 10;
            int a3 = i / 100 % 10;
            int a2 = i / 1000 % 10;
            int a1 = i / 10000;
            int sub1 = a1 * 100 + a2 * 10 + a3;
            int sub2 = a2 * 100 + a3 * 10 + a4;
            int sub3 = a3 * 100 + a4 * 10 + a5;
            if (sub1 % k == 0 && sub2 % k == 0 && sub3 % k == 0) {
                count++;
                System.out.println(i);
            }
        }
        if (count==0){
            System.out.println("No");
        }
    }
}
