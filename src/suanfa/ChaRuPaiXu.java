package suanfa;

import java.util.Arrays;

public class ChaRuPaiXu {
    public static void main(String[] args) {
        String[][] arrs=new String[3][3];
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int p = 0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        String string="sw";
        string.equals("AA");
        System.out.println(Arrays.toString(arr));
    }
}
