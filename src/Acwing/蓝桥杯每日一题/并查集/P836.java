package Acwing.蓝桥杯每日一题.并查集;

import java.util.Objects;
import java.util.Scanner;

public class P836 {
    public static int N=100010;
    public static int[]q=new int[N];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        for (int i=1;i<=n;i++){
            q[i]=i;
        }
        while (m!=0){
            m--;
            String qs= scanner.next();
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            if (Objects.equals(qs, "M")){
                q[find(a)]=find(b);
            }else {
                if (q[find(a)]!=find(b)){
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }
            }
        }
    }
    public static int find (int x){  // 返回祖宗节点并执行路径压缩
        if (q[x]!=x) q[x]=find(q[x]);
        return q[x];
    }
}
