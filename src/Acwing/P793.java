package Acwing;

import java.math.BigDecimal;
import java.util.Scanner;

public class P793 {
    public static void main(String[] args) {
        // 高精度乘法
        Scanner scanner=new Scanner(System.in);
        BigDecimal number1 = scanner.nextBigDecimal();
        BigDecimal number2 = scanner.nextBigDecimal();
        BigDecimal sum=number1.multiply(number2);
        System.out.println(sum);
    }
}
