package LuoGu;

import java.util.Scanner;

public class P1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt(), R = scanner.nextInt();
        int count = 0;
        for (int i = L; i <= R; i++) {
            int p=i;
            while (p!=0){
                int c=p%10;
                p=p/10;
                if (c==2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
