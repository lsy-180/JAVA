package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class P1219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int w = scanner.nextInt(), m = scanner.nextInt(), n = scanner.nextInt();
        m--;n--;
        int mhang = m / w;
        int nhang = n / w;
        int mlie = m % w;
        int nlie = n % w;
        if (mhang % 2 != 0) {
            mlie = w-mlie-1;
        }
        if (nhang%2!=0){
            nlie=w-nlie-1;
        }
        System.out.println(Math.abs(nhang-mhang)+Math.abs(mlie-nlie));
    }
}
