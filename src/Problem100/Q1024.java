package Problem100;

import java.util.Scanner;

public class Q1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("\'%s\'\n", strArray[i]);
        }
    }
}
