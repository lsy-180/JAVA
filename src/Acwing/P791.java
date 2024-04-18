package Acwing;

import java.math.BigDecimal;
import java.util.Scanner;

// 高精度加法
public class P791 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigDecimal number1 = scanner.nextBigDecimal();
        BigDecimal number2 = scanner.nextBigDecimal();
        BigDecimal sum=number1.add(number2);
        System.out.println(sum);
    }
}
