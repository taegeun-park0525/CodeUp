package Problem100;

import java.util.Scanner;

public class Q1033 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    String radixNum = Integer.toString(num,16);

    System.out.println(radixNum.toUpperCase());
    }
}
