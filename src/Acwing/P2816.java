package Acwing;

import java.util.Scanner;

public class P2816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];


        for (int i = 0; i < n; i++) {
            A[i]= scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i]= scanner.nextInt();
        }
        int count=0;
        int j=0;
        for (int i = 0; i < A.length; i++) {
            if (j!=m){
                while (A[i] != B[j]) {
                    j++;
                    if (j==m){
                        break;
                    }
                }
            }
            if (j==m){
                break;
            }
            if (A[i]==B[j]){
                count++;
                j++;
            }
        }
        if (count==n){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
