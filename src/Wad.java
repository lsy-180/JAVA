import java.util.Scanner;

public class Wad {
    public static void main(String[] args) {
//        创建对象 接收数据
//        键盘录入
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位数整数：");
////      double s=sc.nextDouble();
        int sa = sc.nextInt();
        String noodles= sc.next();
//        String string=sc.next();
//        System.out.println(string);
//        System.out.println(sa);
//        for (int i=1;i<4;i++){
//            int c=10;
//            int b;
//            b=sa%c;
//            sa/=10;
//            System.out.println("其三位数分别是：\n"+b);
//        }
        int price = 1000;
        if (sa == 1) {
            System.out.println("实际付的钱：" + price * 0.9);
        } else if (sa == 2) {
            System.out.println("实际付的钱：" + price * 0.8);
        } else if (sa == 3) {
            System.out.println("实际付的钱：" + price * 0.7);
        } else {
            System.out.println("非会员，不打折");
        }
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "吃岐山面":
                System.out.println("吃岐山面");
                break;
            default:
                System.out.println("吃屎");
                break;
        }
    }
}
