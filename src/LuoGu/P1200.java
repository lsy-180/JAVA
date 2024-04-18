package LuoGu;

import java.util.Scanner;

public class P1200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ufo = scanner.next();
        String data = scanner.next();
        int ufos=product(ufo);
        int datas=product(data);
        System.out.println(ufos+" "+datas);
        if (ufos%47==datas%47){
            System.out.println("GO");
        }
        else {
            System.out.println("STAY");
        }
    }

    public static int product(String str) {
        int pro = 1;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            int p = c - 'A'+1;
            pro = pro * p;
        }
        return pro;
    }
}
