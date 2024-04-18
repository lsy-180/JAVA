package Acwing.数论;

import java.util.Scanner;

public class P1216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=n;
        while (n/3!=0){
            int x=n/3;
            n=x+n%3;
            count+=x;
        }
        System.out.println(count);
    }
}
