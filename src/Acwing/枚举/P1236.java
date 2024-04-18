package Acwing.枚举;

import java.util.Scanner;

public class P1236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P=100010;
        int N = scanner.nextInt();

        int[] A = new int[P];
        int[] B = new int[P];
        int[] C = new int[P];
        int[] as = new int[P];
        int[] cnt = new int[P];
        int[] s = new int[P];
        int[] cs = new int[P];
        int[] ap = new int[P];
        int[] cp = new int[P];
        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextInt();
            A[i]++;
        }
        for (int i = 1; i <= N; i++) {
            B[i] = scanner.nextInt();
            B[i]++;
        }
        for (int i = 1; i <= N; i++) {
            C[i] = scanner.nextInt();
            C[i]++;
        }
        for (int i = 1; i <= N; i++) {
            as[A[i]]++;
        }
//        System.out.println(Arrays.toString(as));
        for (int i = 1; i <= N; i++) {
            cs[C[i]]++;
        }
        for (int i = 1; i < P; i++) {
            cnt[i] = cnt[i - 1] + as[i];
        }
        for (int i = 1; i < P; i++) {
            s[i] = s[i - 1] + cs[i];
        }
        long count = 0;
        for (int i = 1; i <= N; i++) {
            ap[i]=cnt[B[i]-1];
            cp[i]=s[P-1]-s[B[i]];

            count+= (long) ap[i] *cp[i];
        }
        System.out.println(count);
        // 二分的思想
//        Arrays.sort(A);
//        Arrays.sort(C);
//        Arrays.sort(B);
//        long count=0;
//        for (int i = 1; i <=N; i++) {
//            int l=1,r=N;
//            int l2=1,r2=N;
//            while (l<r){
//                int mid=(l+r+1)/2;
//                if (A[mid]>=B[i]){
//                    r=mid-1;
//                }else {
//                    l=mid;
//                }
//            }
//            if (A[l]>=B[i]){
//                l=0;
//            }
//            while (l2<r2){
//                int mid=(l2+r2)/2;
//                if (C[mid]>B[i]){
//                    r2=mid;
//                }else {
//                    l2=mid+1;
//                }
//            }
//            if (C[l2]<=B[i]){
//                r2=N+1;
//            }
//            count+=(long)l*(N-r2+1);
//        }
//        System.out.println(count);
//        scanner.close();


    }
}
