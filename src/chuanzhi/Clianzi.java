package chuanzhi;

import java.util.ArrayList;
import java.util.Scanner;

public class Clianzi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String string=scanner.nextLine();
            if (string.isEmpty()){
                break;
            }
            arrayList.add(string);
        }
        int m = arrayList.size();
        int s=0;
        while (m>0){
            s++;
            m=m/10;
        }
        int hang=arrayList.size()-s;
        int count=0;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("%" + s + "d %s\n", i + 1, arrayList.get(i));
        }
    }
}
