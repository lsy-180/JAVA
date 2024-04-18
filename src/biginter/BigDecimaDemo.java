package biginter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimaDemo {
    public static void main(String[] args) {
        // 用于小数的精确计算 用来表示很大的小数 解决小数运算精确失真问题
        // 通过传递double类型的小数创建对象
        BigDecimal bigDecimal=new BigDecimal(0.01);
        BigDecimal bigDecimal2=new BigDecimal(0.09);
        // 结果不精确 不建议
        System.out.println(bigDecimal);
        System.out.println(bigDecimal2);

        // 通过传递字符串表示的小数创建对象 进行精确计算
        BigDecimal bigDecimal3=new BigDecimal("0.01");
        BigDecimal bigDecimal4=new BigDecimal("0.09");
        BigDecimal bigDecimal5=bigDecimal3.add(bigDecimal4);

        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);
        System.out.println(bigDecimal5);

        // 通过静态方法创建对象
        BigDecimal bd=BigDecimal.valueOf(10);
        System.out.println(bd);

        /*
        细节：
        未超出double范围用静态方法，
        若超出double范围则用构造方法。
        若传递0-10之间的整数，则方法返回已经创建好的对象，不会重新new
        * */

        /*
        * public BigDecimal add(BigDecimal val)
        加法
        public BigDecimal subtract(BigDecimal val)
        减法
        public BigDecimal multiply(BigDecimal val)
        乘法
        public BigDecimal divide( BigDecimal val)
        除法
        public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
        * */

        int sc=100;
        // 加法
        BigDecimal bd2=BigDecimal.valueOf(10);
        BigDecimal bd3=BigDecimal.valueOf(3);
        BigDecimal bd4=bd2.add(bd3);
        // 除法
        BigDecimal b5=bd2.subtract(bd3);
        // 乘法
        BigDecimal bd5=bd2.multiply(bd3);
        // 除法 精确2位，舍入模式 HELP_UP 为四舍五入
        BigDecimal bd6=bd2.divide(bd3,2, RoundingMode.HALF_DOWN);
        System.out.println(bd6);


    }
}
