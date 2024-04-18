package Acwing;

import java.util.Scanner;

public class P789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), q = scanner.nextInt();
        int[] num = new int[n];
        int[] query = new int[q];
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        for (int i = 0; i < query.length; i++) {
            query[i]= scanner.nextInt();
        }
        for (int i = 0; i < query.length; i++) {
            int x=query[i];
            int left=0,right=n-1;
            while (left<right){
                int mid=(left+right)/2;
                if (num[mid]>=x){
                    right=mid;
                }
                else {
                    left=mid+1;
                }
            }
            if (num[left]!=x){
                System.out.println(-1+" "+-1);
            }
            else {
                System.out.printf("%d ",left);
                int lefts=0,rights=n-1;
                while (lefts<rights){
                    int mid=(lefts+rights+1)/2;
                    if (num[mid]<=x){
                        lefts=mid;
                    }
                    else {
                        rights=mid-1;
                    }
                }
                System.out.printf("%d",rights);
                System.out.println();
            }
        }
    }
}
