package Acwing.蓝桥杯每日一题.哈希;

import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
public class P841 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        String string= scanner.next();

        while (m!=0){
            m--;
            int l1= scanner.nextInt();
            int r1= scanner.nextInt();
            int l2= scanner.nextInt();
            int r2= scanner.nextInt();
            String s1=string.substring(l1-1,r1);
            String s2=string.substring(l2-1,r2);
            if (Objects.equals(s1,s2)){
                pw.println("Yes");
            }else {
                pw.println("No");
            }
        }
        pw.flush();
    }
}
