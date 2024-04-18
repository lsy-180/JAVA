package Acwing;

import java.util.Scanner;
// lowb操作



/*
位运算二进制
* 求n的第k位数字:n >> k &1
返回n的最后一位1: n=(n-1)&n;
*
* */
public class P801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            int x = scanner.nextInt();
            int count = 0;

            while (x!=0) {
                count++;
                //把一个整数减去1，再和原来的整数做相与运算，会把该整数二进制的最右边的1变成0
                x=(x-1)&x;
            }

            System.out.printf("%d ", count);
            n--;
        }
    }
}
