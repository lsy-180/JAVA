package Acwing.枚举;

import java.util.Scanner;

public class P1210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = 10010;
        int[] num = new int[N];
        for (int i = 1; i <= n; i++) {
            num[i] = scanner.nextInt();
        }

//        System.out.println(Arrays.toString(num));
        // 超时写法
        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <=n ; j++) {
//                int[]temp=new int[N];
//                System.arraycopy(num,0,temp,0,num.length);
//                Arrays.sort(temp,i,j+1);
//                if (i==j){
//                    count++;
//                }else {
//                    if (temp[j]-temp[i]==j-i){
//                        count++;
//                    }
//                }
//            }
//        }

        for (int i = 1; i <= n; i++) {
            int min = N;
            int max = 0;
            for (int j = i; j <= n; j++) {
                min = Math.min(min, num[j]);
                max = Math.max(max, num[j]);
                if (max - min == j - i) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
