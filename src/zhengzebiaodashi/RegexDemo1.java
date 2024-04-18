package zhengzebiaodashi;


public class RegexDemo1 {
    public static void main(String[] args) {

        // 校验字符串是否满足规则，在一段文本中查找满足要求的内容。
        String qq = "1598151651";
        System.out.println(checkQQ(qq));

        // 正则表达式 从左到右一个一个匹配
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        // 只能是a b c
        System.out.println("ab".matches("[abc]")); // false
        System.out.println("a".matches("[a-d][m-p]")); // false
        // [a-z&&[def]] 取a-z与def的交集 如果写了一个&则不是交集 仅为一个&符号
        System.out.println("a".matches("[a-z&&[^bc]]"));

        // 判断邮箱格式是否正确
        String s="\\w ";
        String cd="(?:(?:\\d{3}-)?\\d{8}|^(?:\\d{4}-)?\\d{7,8})(?:-\\d+)?";
        System.out.println("0919-2880506".matches(cd));
        String string="(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("15:28:59".matches(string));
    }

    public static boolean checkQQ(String qq) {
        //先判断异常数据
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }
        // 0不能2在开头
        char s = qq.charAt(0);
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
