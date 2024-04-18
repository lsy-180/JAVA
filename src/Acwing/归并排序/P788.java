package Acwing.归并排序;

import java.util.Scanner;
// 逆序对的数量
public class P788 {
    static int[] num ;
    static int[] temp = new int[100005];
    // 定义为int的话会越界超过int的最大范围。因此用long
    static long count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        num=new int[n];
        for (int i = 0; i < n; i++) {
             num[i] = scanner.nextInt();
        }
        merge( 0, n - 1);
        /*for (int i : num) {
            System.out.printf("%d ", i);
        }*/
        System.out.println(count);
    }

    public static void merge( int left, int right) {
        if (left>=right){
            return;
        }
        int mid=(left+right)/2;
        merge(left,mid);
        merge(mid+1,right);
        int i=left,j=mid+1,k=0;
        while (i<=mid && j<=right){
            if (num[i]>num[j]){
                count+=mid-i+1;
                temp[k++]=num[j++];
            }
            else {
                temp[k++]=num[i++];
            }
        }
        while (i<=mid){
            temp[k]=num[i];
            i++;
            k++;
        }
        while (j<=right){
            temp[k]=num[j];
            j++;
            k++;
        }
        for (int s=left,p=0;s<=right;s++,p++){
            num[s]=temp[p];
        }
    }
}
