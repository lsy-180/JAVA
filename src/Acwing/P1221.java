package Acwing;

import java.util.Scanner;

// 二分 四平方和
public class P1221 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for (int i = 0;; i++) {
            if (i*i+i*i+i*i+i*i>N) break;
            for (int j = i;; j++) {
                if (i*i+j*j+j*j+j*j>N) break;
                for (int k = j;; k++) {
                    if (i*i+j*j+k*k+k*k>N) break;
                    for (int l = k;l<2250; l++) {
                        if (i*i+j*j+k*k+l*l>N) break;
                        else {
                            int p= (int) Math.sqrt(N-i*i-j*j-k*k);
                            if (i*i+j*j+k*k+p*p==N){
                                System.out.printf("%d %d %d %d",i,j,k,p);
                                return;
                            }
                        }
                    }
                }

            }

        }
    }
}
// 哈希表法
/*import java.util.*;
public class Main{
    private static HashMap<Integer,int[]> map = new HashMap<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int c = 0;c * c <= x;c++){
            for(int d = 0;c * c + d * d <= x;d++){
                Integer n = c * c + d * d;
                if(map.get(n) == null){
                    map.put(n,new int[]{c,d});
                }
            }
        }
        for(int a = 0; a * a <= x;a++){
            for(int b = 0;a * a + b * b <= x;b++){
                int res = x - a * a - b * b;
                if(map.get(res) != null){
                    int c = map.get(res)[0];
                    int d = map.get(res)[1];
                    System.out.println(a + " " + b + " " + c + " " + d +" ");
                    return;
                }
            }
        }
    }
}*/
