package LuoGu;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int high = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (high + 30 >= num[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
