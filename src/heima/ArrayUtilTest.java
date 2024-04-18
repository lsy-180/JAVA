package heima;
// 工具类的书写 不需要创建对象
public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double[] as={5.96,5953.9,159.4};
        String str= ArrayUtil.printArr(arr);
        System.out.println(str);
        double avg=ArrayUtil.getaverage(as);
        System.out.println(avg);
    }
}
