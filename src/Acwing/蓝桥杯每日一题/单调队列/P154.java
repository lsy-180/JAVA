package Acwing.蓝桥杯每日一题.单调队列;

import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P154 {
    public static int N = 1000010;
    public static int[] num = new int[N];
    public static List<Integer> integerList = new ArrayList<>();
    public static List<Integer> integerArrayList = new ArrayList<>();
    public static int[] q = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int hh = 1, tt = 0;
        for (int i = 0; i < n; i++) {
            if (hh<=tt && i-k+1>q[hh]) hh++;
            while (num[q[tt]]>=num[i] && hh<=tt) tt--;
            q[++tt]=i;
            if (i>=k-1) pw.print(num[q[hh]] + " ");
        }
        pw.println();
        hh = 1;tt = 0;
        for (int i = 0; i < n; i++) {
            if (hh<=tt && i-k+1>q[hh]) hh++;
            while (num[q[tt]]<=num[i] && hh<=tt) tt--;
            q[++tt]=i;
            if (i>=k-1) pw.print(num[q[hh]] + " ");
        }
        pw.flush();
        // 超时写法
//        int j=0;
//        for (int i = 1; i <= n; i++) {
//            num[i]= scanner.nextInt();
//            integerList.add(num[i]);
//            j++;
//            if (j==k){
//                Integer min = Collections.min(integerList, Comparator.naturalOrder());
//                System.out.printf("%d ",min);
//                j--;
//                integerList.remove(0);
//            }
//        }
//        System.out.println();
//        j=0;
//        for (int i = 1; i <= n; i++) {
//            integerArrayList.add(num[i]);
//            j++;
//            if (j==k){
//                Integer max = Collections.max(integerArrayList, Comparator.naturalOrder());
//                System.out.printf("%d ",max);
//                j--;
//                integerArrayList.remove(0);
//            }
//        }
    }
}
