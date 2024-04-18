import java.util.Random;

public class SuiJi {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(34)+68;
        System.out.println(x);
        int end=0;
        for (int i=1;i<10000;i++){
            if (i%4==0&&i%100!=0||i%400==0){
                end++;
            }
        }
        System.out.println(end);
    }
}
