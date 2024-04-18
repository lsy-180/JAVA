package LuoGu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        // 解法一 用0和1标记，若已经移动树则为0 最后统计为为1的值即为没有移动的树
        /*Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt(),m= scanner.nextInt();
        int[]start=new int[m];
        int[]end=new int[m];
        int i=0;
        int[]ls=new int[l+1];
        Arrays.fill(ls, 1);
        while (i!=m){
            start[i]=scanner.nextInt();
            end[i]=scanner.nextInt();
            i++;
        }
        int count=0;
        for (int j = 0; j < start.length; j++) {
            for (int k = start[j]; k <= end[j]; k++) {
                ls[k]=0;
            }
        }
        for (int i1 = 0; i1 < ls.length; i1++) {
            if (ls[i1]!=0){
                count++;
            }
        }
        System.out.println(count);*/
        // 解法二 区间合并
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(), m = scanner.nextInt();
        int[][] num = new int[m][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0] = scanner.nextInt();
            num[i][1] = scanner.nextInt();
        }
        // 二维数组排序
        Arrays.sort(num, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] temp = num[0];
        arrayList.add(temp);

        for (int i = 1; i < num.length; i++) {
            //如果集合中最后一个元素的结尾值比二维数组当前元素的起始值要小
            if (temp[1] < num[i][0]) {
                //将二维数组当前元素添加到集合中
                temp = num[i];
                //更新tmp
                arrayList.add(num[i]);
                //如果集合中最后一个元素的结尾值比二维数组当前元素的结尾值要小
            } else if (temp[1] <= num[i][1]) {
                //删除集合中最后一个元素
                arrayList.remove(temp);
                //更新tmp
                temp = new int[]{temp[0], num[i][1]};
                arrayList.add(temp);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            l -= arrayList.get(i)[1] - arrayList.get(i)[0];
            System.out.println(Arrays.toString(arrayList.get(i)));
        }
        System.out.println(l - arrayList.size() + 1);
    }
}
