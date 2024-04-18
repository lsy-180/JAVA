package LeetCode;

import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[]num=new int[n];
        int[]num2=new int[n];
        for(int i=0;i<n;i++){
            num[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            num2[i-n]=nums[i];
        }
        int j=0;
        for(int i=0;i<n;i++){
            nums[j++]=num[i];
            nums[j++]=num2[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
