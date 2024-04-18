package Acwing;

import java.math.BigDecimal;
import java.util.Scanner;

public class P794 {
    public static void main(String[] args) {
        // 高精度除法
        Scanner scanner=new Scanner(System.in);
        BigDecimal number1 = scanner.nextBigDecimal();
        BigDecimal number2 = scanner.nextBigDecimal();
        BigDecimal[] result = number1.divideAndRemainder(number2);
        BigDecimal quotient = result[0];
        BigDecimal remainder = result[1];

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
