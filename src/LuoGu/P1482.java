package LuoGu;

import java.util.Scanner;

public class P1482 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String a[]=string1.split("/");
        String b[]=string2.split("/");
        int zi=Integer.valueOf(a[0])*Integer.valueOf(b[0]);
        int mu=Integer.valueOf(a[1])*Integer.valueOf(b[1]);
//        System.out.println(zi+" "+mu);
        yuefen(zi, mu);
    }
    public static void yuefen(int zi, int mu) {
        int ra=0;
        int rb=0;
        if (zi > mu) {
            for (int i = mu; i >= 1; i--) {
                if (zi % i == 0 && mu % i == 0) {
                    ra = zi / i;
                    rb = mu / i;
                    break;
                }
            }
        } else if (zi == mu) {
            ra = rb = 1;
        } else {
            for (int i = zi; i >= 1; i--) {
                if (mu % i == 0 && zi % i == 0) {
                    ra = zi / i;
                    rb = mu / i;
                    break;
                }
            }
        }
        System.out.printf("%d %d", rb, ra);
    }
}
