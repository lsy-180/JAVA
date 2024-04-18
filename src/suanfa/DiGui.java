package suanfa;

public class DiGui {
    public static void main(String[] args) {
        // 递归算法 一定要有出口
        // 递归求1-100之间的和
        int num=100;
        System.out.println(getSum(num));// 5050
        int nums=5;
        System.out.println(getCHeng(nums));
    }
    public static int getSum(int number){
        if (number>0){
            return number+getSum(number-1);
        }
        return 0;
    }
    public static int getCHeng(int number){
        if (number>1){
            return number*getCHeng(number-1);
        }
        return 1;
    }
}
