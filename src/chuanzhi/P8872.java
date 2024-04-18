package chuanzhi;

import java.util.Arrays;
import java.util.Scanner;

public class P8872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int max=arr[arr.length-1];
        int min=arr[0];
        int jicha=max-min;
        int s=0;
        int j=arr.length-1;
        for (int i = 0; i < m; i++) {
            int mins=arr[s];
            int maxs=arr[j];
            if (arr[j]-mins > maxs-arr[s]){
                System.out.println(1);
                arr[j]=arr[s];
                if (jicha>maxs-arr[s]){
                    jicha=maxs-arr[s];

                }
            }
            else {
                arr[s]=arr[j];
                if (jicha>arr[j]-mins){
                    jicha=arr[j]-mins;
                }
            }
            System.out.println(jicha);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(jicha);
    }

}
