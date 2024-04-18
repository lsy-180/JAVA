public class ParIn {
    public static void main(String[] args) {
        String string="123456789";
        int sum=0;

        // 数据校验
        if (!string.matches("[1-9]\\d{0,9}")){
            System.out.println("数据有误");
        }
        else {
            System.out.println("数据正确");
        }
        for (int i = 0; i < string.length(); i++) {
            int c=string.charAt(i)- '0';
            System.out.println(c);
            String string1= String.valueOf(string.charAt(i));
//            System.out.println(string1);
            int i1=Integer.valueOf(string1);
//            System.out.println(i1);
            sum=sum*10+i1;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
