package Problem100;

import java.util.Scanner;

public class Q1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resultBoolean = (num1 == num2) ? 1 : 0;

        System.out.println( resultBoolean);
    }
}
