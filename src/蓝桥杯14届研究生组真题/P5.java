package 蓝桥杯14届研究生组真题;

public class P5 {
    public static int[] num = {
            99, 22, 51, 63, 72, 61,
            20, 88, 40, 21, 63, 30,
            11, 18, 99, 12, 93, 16,
            7, 53, 64, 9, 28, 84,
            34, 96, 52, 82, 51, 77};

    public static void main(String[] args) {
        int res=0;
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i]*num[j]>=2022) res++;
            }
        }
        System.out.println(res);
    }
}
