package Acwing.蓝桥杯每日一题.递归;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class P1360 {
    public static int N = 500010;
    public static int a=0;
    public static int b=0;
    public static int s=0;
    public static String[] num = new String[N];
    public static String[] end = new String[N];
    public static LinkedList<String> linkedList = new LinkedList<>();

    public static LinkedList<String> linkedList2 = new LinkedList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            setN(i);
        }
        for (int i = 0; i < linkedList.size(); i++) {
            num[i]=linkedList.get(i);
        }
//        System.out.println(linkedList);
//        System.out.println(Arrays.toString(num));
        merge(num,0, linkedList.size()-1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(num[i]);
        }
    }

    public static void setN(int n) {
        for (int i = 0; i <= n; i++) {
            int z = check(i, n);
            if (z == 0) {
                String temp = String.format("%d/%d", i, n);
                linkedList.add(temp);
            } else {
                int sc = i / z;
                int n2 = n / z;
                String temp = String.format("%d/%d", sc, n2);
                if (!linkedList.contains(temp)) {
                    linkedList.add(temp);
                }
            }
        }
    }

    private static int check(int x, int y) {
        int z = y;
        while (x % y != 0) {
            z = x % y;
            x = y;
            y = z;
        }
        return z;
    }
    public static void merge(String []arr,int left,int right){
        if (left>=right){
            return;
        }
        int mid=(left+right)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);

        int k=0,i=left,j=mid+1;
        while (i<=mid&&j<=right){
            String[] string=num[i].split("/");
            double x=Double.parseDouble(string[0]);
            double y=Double.parseDouble(string[1]);
            double temp=x/y;
            String[] string2=num[j].split("/");
            double x2=Double.parseDouble(string2[0]);
            double y2=Double.parseDouble(string2[1]);
            double temp2=x2/y2;
            if (temp<=temp2){
                end[k]=arr[i];
                k++;
                i++;
            }
            else {
                end[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i<=mid){
            end[k]=arr[i];
            i++;
            k++;
        }
        while (j<=right){
            end[k]=arr[j];
            j++;
            k++;
        }
        for (int s=left,p=0;s<=right;s++,p++){
            arr[s]=end[p];
        }
    }
}
