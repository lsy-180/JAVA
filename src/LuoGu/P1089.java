package LuoGu;

import java.util.Scanner;

public class P1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[12];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            sum += 300;
            if (num[i] > sum) {
                j = i + 1;
                break;
            }
            if (num[i] <= sum) {
                sum -= num[i];
                if (sum / 100 != 0) {
                    int x = sum / 100;
                    sum -= x * 100;
                    count += x * 100;
                }
            }
        }
        if (j > 0) {
            System.out.println(-j);
        } else {
            int c = (int) (count + count * 0.2);
            System.out.println(c + sum);
        }

    }
}
