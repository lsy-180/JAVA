package Acwing.模拟;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]strings=new String[101];
        int P = 100010;
        int N= scanner.nextInt();
        scanner.nextLine();// 忽略掉第一行的回车
        int n=N;
        Integer[] num = new Integer [P];
        Arrays.fill(num,0);
        int p = 0;
        int count=0;
        while (N!=0) {
            N--;
            String string=scanner.nextLine();
            strings[p++]=string;
        }
//        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < n; i++) {
            String []str=strings[i].split(" ");
            for (int j = 0; j < str.length; j++) {
                num[p++]=Integer.parseInt(str[j]);
                count++;
            }
        }
        int duan=0,chong=0;
        Arrays.sort(num, Collections.reverseOrder());
//        System.out.println(Arrays.toString(num));
        for (int i = 0; i < count-1; i++) {
            if (num[i]-num[i+1]==2){
               duan=(num[i]+num[i+1])/2;
            }else if (num[i]-num[i+1]==0){
                chong=num[i];
            }
        }
        System.out.printf("%d %d",duan,chong);
    }
}
