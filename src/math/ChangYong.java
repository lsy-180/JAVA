package math;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ChangYong {
    public static void main(String[] args) {
        double s=-818189;
        System.out.println(Math.abs(s));
        // 向上取整
        System.out.println(Math.ceil(15.69));
        System.out.println(Math.ceil(-12.9999999999));

        // 向下取整
        System.out.println(Math.floor(12.96));
        System.out.println(Math.floor(-12.96));

        // 四舍五入
        System.out.println(Math.round(12.69));
        System.out.println(Math.round(12.34));

        // 获取两个整数较大值
        System.out.println(Math.max(12,99));
        System.out.println(Math.min(99,12));

        // 获取a的b次幂
        System.out.println(Math.pow(2,0.3));
        System.out.println(Math.pow(4,-2));

        // 开根号
        System.out.println(Math.sqrt(4));
        // 开立方根
        System.out.println(Math.cbrt(8));

        // 获取随机数
        System.out.println(Math.random());
        // 随机数种子
        Random random=new Random();
        System.out.println(random.nextInt(100));

        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        int count=0;
        int temp=sc;
        int fina=sc;
        int sum=0;
        for (int i=1000;i<10000;i++){
            int res=i;
            int su=i;
            int sums=0;
            for (int j=0;j<4;j++){
                int b=su%10;
                su=su/10;
                sums+= Math.pow(b,4);
            }
            if (sums==i){
                System.out.println(res);
            }
        }
        boolean flag=false;
        while (temp>0){
            temp=temp/10;
            count++;
        }
        for (int i=0;i<count;i++){
            int b=sc%10;
            sc=sc/10;
            sum+= Math.pow(b,count);
        }
        if (fina==sum){
            flag=true;
        }
        System.out.println("该数字是自幂数吗？ "+flag);
        System.out.println(System.currentTimeMillis());
        Date date=new Date();
        System.out.println(date.getTime());
    }
}
