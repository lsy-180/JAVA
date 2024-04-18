package biginter;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

        /*
        public BigInteger(int num，Random rnd)
        获取随机大整数，范围:[e ~ 2的num次方-1]
        public BigInteger(string val)
        获取指定的大整数
        public BigInteger( string val, int radix)
        获取指定进制的大整数
        public static BigInteger valueOf(long val)
        静态方法获取BigInteger的对象，
        内部有优化细节:
        对象一旦创建里面的数据不能发生改变。
        * */
        Random random=new Random();
        int wd=random.nextInt();
        System.out.println(random);
        BigInteger bigInteger=new BigInteger(4,random);
        System.out.println(bigInteger);
        BigInteger bigInteger2=new BigInteger("100");
        System.out.println(bigInteger2);
        int scd=bigInteger2.intValue();
        // 创建两个BigInteger对象
        BigInteger bd1=BigInteger.valueOf(10);
        BigInteger bd2=BigInteger.valueOf(10);
        BigInteger bd3=bd1.add(bd2);
        System.out.println(bd3);

        /*
        * public BigInteger add(BigInteger val)
        加法
        public BigInteger subtract(BigInteger val)
        减法
        public BigInteger multiply( BigInteger val)
        乘法
        public BigInteger divide(BigInteger val)
        除法，获取商
        public BigInteger[]divideAndRemainder(BigInteger val)
        * 除法，获取商和余数
        public boolean equals(object x)
        比较是否相同
        publicBigInteger pow(int exponent)
        次幂
        public BigInteger max/min(BigInteger val)
        返回较大值/较小值
        public int intValue(BigInteger val)
        转为int类型整数，超出范围数据有误

        * */
    }
}
