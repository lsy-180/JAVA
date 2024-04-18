package Acwing;

import java.util.Arrays;
import java.util.Scanner;

public class P785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
//        quickSort(num, 0, num.length - 1);
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d ",num[i]);
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if (start>end){
            return;
        }
        int basenumber = arr[i];
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < basenumber) {
                    break;
                }
                end--;
            }
            while (true) {
                if (end <= start || arr[start] > basenumber) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);
    }
}
