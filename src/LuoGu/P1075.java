package LuoGu;

import java.util.Arrays;
import java.util.Scanner;

public class P1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[2];
        double p = Math.pow(n, 0.5);
        for (int i = 2; i < p; i++) {
            if (n % i == 0) {
                num[0] = i;
                num[1] = n / i;
                break;
            }
        }
        Arrays.sort(num);
        System.out.println(num[1]);
    }
}
