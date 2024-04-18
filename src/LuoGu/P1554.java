package LuoGu;

import java.util.Scanner;

public class P1554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(), N = scanner.nextInt();
        int a0 = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;
        for (int i = M; i <= N; i++) {
            int temp=i;
            while (temp != 0) {
                int c = temp % 10;
                temp = temp / 10;
                switch (c) {
                    case 0:
                        a0++;
                        break;
                    case 1:
                        a1++;
                        break;
                    case 2:
                        a2++;
                        break;
                    case 3:
                        a3++;
                        break;
                    case 4:
                        a4++;
                        break;
                    case 5:
                        a5++;
                        break;
                    case 6:
                        a6++;
                        break;
                    case 7:
                        a7++;
                        break;
                    case 8:
                        a8++;
                        break;
                    case 9:
                        a9++;
                        break;
                }
            }
        }
        System.out.printf("%d %d %d %d %d %d %d %d %d %d",a0,a1,a2,a3,a4,a5,a6,a7,a8,a9);
    }
}
