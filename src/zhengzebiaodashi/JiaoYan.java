package zhengzebiaodashi;

public class JiaoYan {
    public static void main(String[] args) {
        // 大小写字母，数字，下划线，一共4-16位
        String string="\\w{4,16}";
        System.out.println("189swWd_".matches(string));
        String string1="^[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("01020220011101003x".matches(string1));
        // 表示或 身份证校验简单校验
        String reg="[1-9]\\d{16}(\\d|X|x)";
        System.out.println("610202511499815598".matches(reg));

        // 忽略大小写的书写方式
        // 匹配的时候忽略abc的大小写 (?i)
        String regex="a((?i)b)c";
        System.out.println("Abc".matches(regex)); //false

        // 省份，市区，派出所 先拆再写再拼
        String string2="^[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        // \\组号 将x组的内容再出来用一次

        String regex1="(.).+\\1";

        // 判断一个字符串的开始部分和结束部分是否一致 且开始部分内部每个字符也需要一致。
        // (.)把首字母看做一组 \\1将首字母拿出来再次使用 * 作用于\\1 表示后面重复的内容出现0次或多次
        String  regex2="((.)\\2*).+\\1";
        System.out.println("aab123abc".matches(regex2));

        // 需求 将重复的内容替换为单个字符
        // (.)将重复内容的第一个字符看做一组， \\1表示第一个字符再次出现 +表示至少一次 $表示将正则表达式中的第一组内容再拿出来用
        String str="我要学学编编编编程程程程程程程";
        String result= str.replaceAll("(.)\\1+","$1");
        System.out.println(result);

    }
}
