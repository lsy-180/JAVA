package LuoGu;

import java.util.Arrays;
import java.util.Scanner;

public class P8597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next(), string2 = scanner.next();
        char[] char1 = string2.toCharArray();
        char[] char2 = string1.toCharArray();
        int count=0;
        while (true) {
            for (int i = 0; i < string1.length() - 1; i++) {
                char c1 = char1[i];
                char c2 = char2[i];
                char c3 = char1[i + 1];
                char c4 = char2[i + 1];
                if (c1 != c2) {
                    count++;
                    if (c1 == '*' && c2 == 'o' && c4 == '*') {
                        char2[i] = '*';
                        char2[i + 1] = 'o';
                    } else if (c1 == '*' && c2 == 'o' && c4 == 'o') {
                        char2[i] = '*';
                        char2[i + 1] = '*';
                    } else if (c1 == 'o' && c2 == '*' && c4 == 'o') {
                        char2[i] = 'o';
                        char2[i + 1] = '*';
                    } else if (c1 == 'o' && c2 == '*' && c4 == '*') {
                        char2[i] = 'o';
                        char2[i + 1] = 'o';
                    }
                }
            }
            if(Arrays.equals(char1, char2)){
                break;
            }
        }
        System.out.println(count);
    }
}
