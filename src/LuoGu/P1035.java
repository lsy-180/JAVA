package LuoGu;

import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double count = 1;
        int sum = 1;
        double x = 1;
        while (true) {
            if (count > n) {
                break;
            }
            count = count + 1 / (x + 1);
            sum++;
            x++;
        }
        System.out.println(sum);
    }
}
