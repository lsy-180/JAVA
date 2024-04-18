package jinzhi;

public class JinZhi {
    public static void main(String[] args) {
        // 除基取余法 不断的除以基数得到余数，直到商为0，再将余数倒着拼起来即可 基数是几进制就是几

        // 将十进制整数转换为字符串表示的二进制。
        int s = 123;
        String string="";
        StringBuilder stringBuilder=new StringBuilder();

        while (true){
            if(s==0){
                break;
            }
            else {
                int d=s%2;
                s=s/2;
                String string1=String.valueOf(d);
                string+=string1;
                // 插入 在哪个位置插入
                stringBuilder.insert(0,d);
            }
        }
        String string1="";
        for (int i = string.length()-1; i >=0 ; i--) {
            String c=String.valueOf(string.charAt(i));
            string1+=c;
        }
        System.out.println(string1);
        System.out.println(stringBuilder);

        // 用StringBuilder  拼接余数

    }
}
