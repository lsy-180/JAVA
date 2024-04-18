package jinzhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Cun {
    public static void main(String[] args) throws ParseException {
        // 计算活了多少天
        String birthday="2001-11-01";
        // 解析字符串
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=simpleDateFormat.parse(birthday);
        long birtime=date.getTime();

        // 计算当天毫秒值
        long today=System.currentTimeMillis();
        long time=today-birtime;

        // 间隔多少天
        System.out.println(time/1000/60/60/24);

        LocalDate localDate=LocalDate.of(2001,11,1);
        LocalDate localDate1=LocalDate.now();

        long days= ChronoUnit.DAYS.between(localDate,localDate1);
        System.out.println(days);

        Year ya= Year.now();
        System.out.println(ya);
        LocalDate localDate2= LocalDate.of(2000,11,1);
        // 时间往前减一天
        LocalDate localDate3= localDate2.minusDays(1);
        System.out.println(localDate3);
        // Java自带的判断是否是闰年的方法。
        System.out.println(localDate2.isLeapYear());
    }
}
