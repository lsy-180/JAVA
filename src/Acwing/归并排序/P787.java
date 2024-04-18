package Acwing.归并排序;

import java.util.Scanner;

public class P787 {
    static int[]temp=new int[100005];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        merge(num,0,n-1);
        for (int i : num) {
            System.out.printf("%d ",i);
        }
    }
    public static void merge(int[]arr,int left,int right){
        if (left>=right){
            return;
        }
        int mid=(left+right)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);

        int k=0,i=left,j=mid+1;
        while (i<=mid&&j<=right){
            if (arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int s=left,p=0;s<=right;s++,p++){
            arr[s]=temp[p];
        }
    }
}
