package Acwing.蓝桥杯每日一题.区间合并;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P1343 {
    public static int N=5010;
//    public static int left;
//    public static int right;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        PII[] piis=new PII[N];
        int i=0;
        LinkedList<PII> linkedList=new LinkedList<>();
        while (n!=0){
            n--;
            int l= scanner.nextInt();
            int r= scanner.nextInt();
            linkedList.add(new PII(l,r));
            piis[i]=new PII(l,r);
            i++;
        }
        Arrays.sort(piis,0,i);
        int k=0;
        int j=1;
        while (j<i){
            int left=piis[k].l;
            int right=piis[k].r;
            int left2=piis[j].l;
            int right2=piis[j].r;
            if (left2<=right&&right2>=right){
                piis[k].r=right2;
                j++;
            } else if (left2>right) {
                k++;
                piis[k].l=left2;
                piis[k].r=right2;
                j++;
            }else if (left2<right){
                j++;
            }
        }
        int max=0;
        int min=0;
        for (int p=0;p<=k;p++){
            max=Math.max(max,piis[p].r-piis[p].l);
        }
        for (int p=0;p<k;p++){
            min=Math.max(min,piis[p+1].l-piis[p].r);
        }
        System.out.printf("%d %d",max,min);
    }
    static class PII implements Comparable<PII>{
        int l;
        int r;

        public PII(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(PII o) {
            return Integer.compare(l,o.l);
        }
    }
}
