package Acwing.模拟;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class P1231 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        int T= scanner.nextInt();
        int[]h=new int[4];
        int[]m=new int[4];
        int[]s=new int[4];
        int[]f=new int[4];
        scanner.nextLine();
//        scanner.useDelimiter(":");
        String[][]strings=new String[T][2];
        for (int i = 0; i < strings.length; i++) {
            strings[i][0]= scanner.nextLine();
            strings[i][1]= scanner.nextLine();
            int d=0;
            int d2=0;
            String[]line=strings[i][0].split(":| ");
            String[]line2=strings[i][1].split(":| ");
            int h1=Integer.parseInt(line[0]);
            int m1=Integer.parseInt(line[1]);
            int s1=Integer.parseInt(line[2]);
            int h2=Integer.parseInt(line[3]);
            int m2=Integer.parseInt(line[4]);
            int s2=Integer.parseInt(line[5]);
            if(line.length==7){
                d=line[6].charAt(2)-'0';
            }
            int ht1=Integer.parseInt(line2[0]);
            int mt1=Integer.parseInt(line2[1]);
            int st1=Integer.parseInt(line2[2]);
            int ht2=Integer.parseInt(line2[3]);
            int mt2=Integer.parseInt(line2[4]);
            int st2=Integer.parseInt(line2[5]);
            if(line2.length==7){
                d2=line2[6].charAt(2)-'0';
            }
            int d3=d+d2;
            int time1=get_time(h1,m1,s1);
            int time2=get_time(h2,m2,s2);
            int time3=get_time(ht1,mt1,st1);
            int time4=get_time(ht2,mt2,st2);
//            int one=time2-time1+d*24*3600;60069 80344 74484 37159 115170
//            int two=time4-time3+d2*24*3600;

            int answer=(time4+24*3600*d3-time1-time3+time2)/2;
            int hour=answer/3600;
            int minute=answer%3600/60;
            int second=answer%60;
            System.out.printf("%02d:%02d:%02d",hour,minute,second);
            System.out.println();


        }
        System.out.println(Arrays.deepToString(strings));

    }
    public static int get_time(int h,int m,int s){
        return h*3600+m*60+s;
    }
}
