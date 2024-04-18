package Acwing.并查集;

import java.io.BufferedInputStream;
import java.util.Objects;
import java.util.Scanner;

public class P837 {
    public static int N = 100010;
    public static int[] q = new int[N];
    public static int[] size = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            q[i]=i;
            size[i]=1;
        }
        while (m != 0) {
            m--;
            String s = scanner.next();

            if (Objects.equals(s,"C")){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (find(a)==find(b)) continue;
                size[find(b)]+=size[find(a)];
                q[find(a)]=find(b);
            } else if (Objects.equals(s,"Q1")) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (find(a)==find(b)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else {
                int a = scanner.nextInt();
                System.out.println(size[find(a)]);
            }
        }
    }
    public static int find (int x){  // 返回祖宗节点并执行路径压缩
        if (q[x]!=x) q[x]=find(q[x]);
        return q[x];
    }
}
