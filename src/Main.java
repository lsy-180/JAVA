import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Integer[]num=new Integer[n+1];
        Arrays.sort(num, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Arrays.fill(num,1);
        for (int i = 1; i < num.length; i++) {
            if (i==1){
                Arrays.fill(num,-1);
            }
            else if (i==2){
                for (int j = 2;  j< num.length; j++) {
                    if (j%2==0){
                        num[j]=1;
                    }
                }
            }
            else {
                int s=i;
                for (int j = i; j < num.length; j++) {
                    if (j%s==0){
                        num[j]=-num[j];
                    }
                }
            }

        }
        for (int i = 1; i < num.length; i++) {
            if (num[i]==-1){
                System.out.printf("%d ",i);
            }
        }
    }
}