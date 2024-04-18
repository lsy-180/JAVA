package LuoGu;

import java.util.Scanner;

public class P1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int count=0;
        int yandi=0;
        while (n!=0){
            n--;
            count++;
            yandi++;
            if (yandi==k){
                n++;
                yandi-=k;
            }
        }
        System.out.println(count);
    }
}
