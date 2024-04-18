package Acwing.区间合并;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P422 {
    public static int L=10010;
    public static int M=105;
    public static PII[]num=new PII[L];
    public static PII[]pii_s=new PII[L];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int l= scanner.nextInt();
        int m= scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int le= scanner.nextInt();
            int ri= scanner.nextInt();
            num[i]=new PII(le,ri);
        }
        Arrays.sort(num,0,m);
        int i=0;
        int j=1;
        while (j<m){
            int l1=num[i].l;
            int r1=num[i].r;
            int l2=num[j].l;
            int r2=num[j].r;
            if (l2<=r1 && r2>=r1){
                num[i].r=r2;
                j++;
            }else if (l2<r1&&r2<r1){
                j++;
            }else {
                i++;
                num[i].l=l2;
                num[i].r=r2;
                j++;
            }
        }
        int count=0;
        for (int p = 0; p <= i; p++) {
            count+=num[p].r-num[p].l+1;
        }

        System.out.println(l+1-count);
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
