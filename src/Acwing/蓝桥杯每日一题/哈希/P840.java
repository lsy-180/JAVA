package Acwing.蓝桥杯每日一题.哈希;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class P840 {
    public static int N = 100010;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));;
        int n = scanner.nextInt();
        Set<Integer> set=new HashSet<>();
        while (n!=0){
            n--;
            String s=scanner.next();
            int x= scanner.nextInt();
            if (Objects.equals(s,"I")){
                set.add(x);
            }else {
                if (set.contains(x)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }

    }
}
